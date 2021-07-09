import java.util.ArrayList;

class exceptions {
    public static void main(String[] args) {

        // String[] pets = { "dog", "cat", "snake" };
        // System.out.println(pets[3]);

        // NullPointerException
        // ArrayList <String> list = null;
        // list.get(0);

        // corect way to tackle this 
        ArrayList <String> list = new ArrayList<String>();
        list.add("book");
        System.out.println(list.get(0)); 



    }
}