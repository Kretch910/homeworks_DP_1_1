public class NegativeAgeException extends IllegalStateException{

    public NegativeAgeException() {
        super("Не удалось создать обект 'Person'. Возраст (age) не может быть отрицательным.");
    }
}
