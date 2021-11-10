package Chapter20.Stack;

public class EmptyException extends RuntimeException {
    public EmptyException() {
        this("Stacking is Empty");
    }
    public EmptyException(String message){
        super(message);

    }
}
