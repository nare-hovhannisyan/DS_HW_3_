public class ArrayQueue<E> implements IQueue<E> {
    public static final int CAPACITY = 10;
    private E[] data;
    private int size = 0;

    public ArrayQueue()
    {
        this(CAPACITY);
    }
    public ArrayQueue(int capacity)
    {
        data = (E[])new Object[capacity];
    }

    public int size() { return  size; }
    public boolean isEmpty() { return size == 0; }

    public void enqueue(E el) throws IllegalStateException
    {
        if(size == data.length) throw new IllegalStateException("queue overflow");
        data[size()] = el;
        size ++;
    }

    public E first()
    {
        if(isEmpty()) {return null; }
        return data[0];
    }

    public E dequeue()
    {
        if(isEmpty()) { return null; }
        E answer = data[0];

        for(int i = 1; i < size(); i++)
        {
            data[i-1] = data[i];
        }

        data[size()-1] = null;
        size --;
        return answer;
    }

    public void print()
    {
        for(int i = 0; i < size(); i++)
        {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }
}
