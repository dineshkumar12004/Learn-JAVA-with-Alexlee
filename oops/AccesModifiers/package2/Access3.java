package package2;

import package1.Access1;

public class Access3 extends Access1 {
    public static void main(String[] args) {
        Access3 a = new Access3();
        System.out.println(a.hour);
        System.out.println(a.minute);
    }
}
