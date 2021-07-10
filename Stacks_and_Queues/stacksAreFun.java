import java.util.Stack;

public class stacksAreFun {
    public static void main(String[] args) {
        System.out.println("Stacks in Java");

        Stack<String> games = new Stack<String>();

        games.add("COD");
        games.add("Guitar hero");
        games.add("Super monkey ball");

        System.out.println(games.pop());
        System.out.println(games.peek());
        System.out.println(games);

    }
}
