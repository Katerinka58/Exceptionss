
@SuppressWarnings("unused")
public class MoneyException extends Exception {
    private String message;

    public MoneyException() {
        message = null;
    }

    MoneyException(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "MoneyException{" +
                "message='" + message + '\'' +
                '}';
    }
}
