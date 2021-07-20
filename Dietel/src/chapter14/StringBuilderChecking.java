package chapter14;

public class StringBuilderChecking {
    public static void main(String[] args) {
        StringBuilder buffer = new StringBuilder();
        StringBuilder buffer1 = buffer.append("Hello").append("Joy").append("!");
        System.out.println(buffer);
        System.out.println(buffer1);

        String s =new StringBuilder().append("How are you,").append("Joy ?").toString();
        System.out.println(s);



    }
}
