package Chapter9;

public class PersonalExample {
    private int clock;
    private int move;
    private int talk;
    private boolean filled;

    public PersonalExample(){

    }
    public PersonalExample(int move, int clock, boolean filled){
        this.move = move;
        this.clock = clock;
        this.filled = filled;
    }

    public int getMove() {
        return move;
    }
    public int getClock(){
        return clock;
    }
    public String toString(){
        return String.valueOf(filled);
    }

    public static void main(String[] args) {
        PersonalExample1 personalExample1 = new PersonalExample1();
        System.out.println("filled is " + personalExample1.toString());
    }
}
