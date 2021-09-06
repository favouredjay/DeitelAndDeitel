package Chapter17.UdemyPractice;

public class CodeToRun implements Runnable{
    @Override
    public void run() {
        System.out.println("run away");

    }

    public static void main(String[] args) {

        new Thread(()->System.out.println("run away")).start();
    }
}
