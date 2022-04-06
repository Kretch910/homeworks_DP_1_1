public class FewOptionsException extends IllegalStateException {

    public FewOptionsException() {
        super("Не удалось создать обект 'Person'. Задано мало параметров для создания (нет имяни или фамилии).");
    }
}
