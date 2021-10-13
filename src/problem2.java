public class problem2 {

    public static void main(String[] args)
    {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();

        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);
        System.out.println(list.removeLast());
        System.out.println(list.removeLast());
        list.print();

        // the running time of removeLast() method is linear -> O(n) because there is no way to find the element preceding the last element in constant time
        // that is why it is not included in the public interface because the running time is linear and all other methods of public interface take constant time
        // so it is not efficient to have such method in the public interface.
    }
}
