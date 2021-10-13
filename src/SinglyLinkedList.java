public class SinglyLinkedList<E> {
    private static class Node<E>
    {
        private E element;
        private Node<E> next;

        public Node(E _element, Node<E> _next)
        {
            element = _element;
            next = _next;
        }

        public E getElement() { return element;}
        public void setElement(E e)
        {
            element = e;
        }
        public Node<E> getNext() { return next; }
        public void setNext(Node<E> _next) {next = _next; }
    }



    private int size = 0;
    private Node<E> head = null;
    private Node<E> tail = null;

    public SinglyLinkedList() {}

    public boolean isEmpty() {return  size ==0;}
    public int size() {return size;}

    public void print()
    {
        var e = head;
        while(e != null)
        {
            System.out.print(e.getElement()+ " ");
            e = e.getNext();
        }
        System.out.println();
    }

    public E first() {return head.getElement();}
    public E last() { return tail.getElement();}

    public void addFirst(E newest) {
        head = new Node(newest, head);
        if(size == 0)
            tail = head;
        size ++;
    }

    public void addLast(E newest) {
        var temp = new Node(newest, null);

        if(isEmpty())
            head = temp;
        else
            tail.setNext(temp);
        tail = temp;
        size ++;
    }

    public E removeFirst()
    {
        if(isEmpty()) return null;
        var temp = head.getElement();
        head = head.next;
        size --;
        if(size == 0)
            tail = null;

        return temp;
    }

    public E removeLast()
    {
        if(isEmpty()) return null;
        Node previousOfLast = head;
        while(previousOfLast.getNext().getNext() != null)
        {
            previousOfLast = previousOfLast.getNext();
        }
        var last = (E)previousOfLast.getNext().getElement();

        previousOfLast.setNext(null);
        tail = previousOfLast;
        size --;

        if(size == 0)
            head = null;

        return last;
    }
}
