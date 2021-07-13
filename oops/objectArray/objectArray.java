class Monkey {
    String type = "Spider monkey";

    public static void sayOhh() {
        System.out.println("Ohh Ahh Ahh");
    }
}

public class objectArray {
    public static void main(String[] args) {

        Monkey m1 = new Monkey();
        Monkey m2 = new Monkey();
        Monkey m3 = new Monkey();

        Monkey[] monkeys = { m1, m2, m3 };

        for (Monkey m : monkeys) {
            m.sayOhh();

        }
    }

}