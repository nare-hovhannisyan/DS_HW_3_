public interface IQueue<E> {
    int size();
    boolean isEmpty();
    void enqueue(E el);
    E dequeue();
    E first();
}
