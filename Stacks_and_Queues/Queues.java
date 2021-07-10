import java.util.LinkedList;
import java.util.Queue;

class Queues {
    public static void main(String[] args) {
        System.out.println("This is Queues ");

        Queue<String> bbqLine = new LinkedList<String>();

        bbqLine.add("Jack");
        bbqLine.add("Tyrant");
        bbqLine.add("Karen");

        System.out.println(bbqLine.poll());
        System.out.println(bbqLine.peek());

        System.out.println(bbqLine);

    }
}