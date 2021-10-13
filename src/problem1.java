public class problem1 {

    public static void main(String[] args)
    {
        DoublyLinkedListNOHeader<Integer> list = new DoublyLinkedListNOHeader<>();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.addLast(4);
        list.addFirst(10);
        list.removeFirst();
        list.removeLast();
        list.print();

        // the pros of such method is that we dont keep extra nodes which will never have elements in them and will just be helper elements
        // but on the other hand, having header and tailer makes it easy to do the operations, for example we can add an
        // addBetween(E e, Node<E> prev, Node<E> next) method that we can use for both inserting at the beginning and inserting at the end,
        // we can do such thing with removals as well, but we cannot do it without header and tailer.
    }
}
