package WHOT;

public enum Suit {
    SQUARE,
    TRIANGLE,
    STAR,
    CIRCLE,
    WHOT,
    CROSSES;

    @Override
    public String toString() {
        return switch (this) {
            case SQUARE -> "square";
            case STAR -> "star";
            case CIRCLE -> "circle";
            case CROSSES -> "crosses";
            case TRIANGLE -> "triangle";
            case WHOT -> "whot";
            default -> null;
        };

    }
}