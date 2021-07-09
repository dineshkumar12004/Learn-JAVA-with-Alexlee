
public class Main {
    public static void main(String[] args) {
        pen p = new pen();

        System.out.println(p.color);
        System.out.println(p.point);
        System.out.println(p.type);

        System.out.println(p.clicked);

        p.click();

        System.out.println(p.clicked);


    }
}
