package chapter14;

public class StringBuilder1 {
    public static void main(String[] args) {
        StringBuilder buffer = new StringBuilder("My name is Joy");
        System.out.println(buffer.length());
        System.out.println(buffer.capacity());

        buffer.ensureCapacity(80);
        System.out.println(buffer.capacity());
        System.out.println(buffer);

        buffer.setCharAt(3,'N');
        buffer.setCharAt(8, 'I');
        System.out.println(buffer);
        buffer.reverse();
        System.out.println(buffer);


    }
}
