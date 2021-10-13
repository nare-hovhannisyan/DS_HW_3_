public class problem3 {

    public static void main(String[] args)
    {
        ArrayQueue<Integer> arrayQueue = new ArrayQueue<>();

        arrayQueue.enqueue(1);
        arrayQueue.enqueue(2);
        arrayQueue.enqueue(3);
        arrayQueue.enqueue(4);
        arrayQueue.enqueue(5);

        arrayQueue.dequeue();

        arrayQueue.print();
        System.out.println(arrayQueue.first());

        // size(), isEmpty(), enqueue(E), and first() are constant -> O(1), but dequeue() is linear -> O(n-i) because every time we delete
        // an element from the beginning we will have to shift the whole array to the left such that the beginning of array
        // always corresponds to index[0].
    }
}
