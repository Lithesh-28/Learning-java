package exceptions;

public class CalculateException extends Exception{

    public CalculateException(String message, Throwable cause){
        super(message,cause);
    }
}
