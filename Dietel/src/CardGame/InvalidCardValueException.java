package CardGame;

public class InvalidCardValueException extends RuntimeException{

    public InvalidCardValueException(String message) {
       super(message);
    }
}
