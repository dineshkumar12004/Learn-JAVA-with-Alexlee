class Main{
    public static void main(String[] args ) {
        shirt s = new shirt();
        s.putOn();
        s.setColor("white");
        s.setSize("M");


        System.out.println(s.color);
        System.out.println(s.size);
    }

}