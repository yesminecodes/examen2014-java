public class AccesInterditException extends Exception {
    public AccesInterditException() {
        super("Accès interdit !");
    }

    public AccesInterditException(String message) {
        super(message);
    }
}