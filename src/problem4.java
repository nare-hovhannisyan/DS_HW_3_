import java.util.Scanner;

public class problem4 {

    public static void AskQuestions(ArrayQueue<Student> queue)
    {
        if(queue.isEmpty())
            return;

        var el = queue.dequeue();
        el.setAskedQuestions(el.getAskedQuestions()+1);
        System.out.println(el.getFullName() + " asks question " + el.getAskedQuestions());
        if(el.getRemainingQuestions() > 1)
        {
            el.setRemainingQuestions(el.getRemainingQuestions()-1);
            queue.enqueue(el);
        }

        AskQuestions(queue);
    }

    public static void main(String[] args)
    {
        ArrayQueue<Student> list = new ArrayQueue<>(20);
        Scanner scanner = new Scanner(System.in);
        String line = null;

        while(!(line = scanner.nextLine()).isEmpty()) {

            var words = line.split(" ");
            if(words.length == 3)
            {
                var st = new Student(words[0], words[1], 0, Integer.parseInt(words[2]));
                list.enqueue(st);
            }
        }

        AskQuestions(list);
    }
}


