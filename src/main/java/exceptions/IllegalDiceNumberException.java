package exceptions;

/**
 * Когда выбрасывается не подходящая сторона кубика, выпадает это исключение.
 */


public class IllegalDiceNumberException extends Exception {

    public IllegalDiceNumberException() {
    }

    public IllegalDiceNumberException(String message) {
        super(message);
    }
}
