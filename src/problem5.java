public class problem5 {

    public static void main(String[] args)
    {
        ArrayDequeue<Integer> arrayDequeue = new ArrayDequeue<>();
        arrayDequeue.addLast(1);
        arrayDequeue.addLast(2);
        arrayDequeue.addLast(3);
        arrayDequeue.addLast(4);
        arrayDequeue.addLast(5);

        System.out.println(arrayDequeue.last());

        arrayDequeue.addFirst(11);
        arrayDequeue.addFirst(22);
        System.out.println(arrayDequeue.first());
        arrayDequeue.removeFirst();
        arrayDequeue.removeFirst();

        arrayDequeue.removeLast();

        System.out.println(arrayDequeue.size());
        System.out.println(arrayDequeue.isEmpty());


        arrayDequeue.print();

    }
}
