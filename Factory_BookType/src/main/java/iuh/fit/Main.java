package iuh.fit;

public class Main {
    public static void main(String[] args) {

        Book B1 = BookFactory.createBook("Audio");
        Book B2 = BookFactory.createBook("Paper");

        System.out.println(B1.getType());
        System.out.println(B2.getType());
    }
}