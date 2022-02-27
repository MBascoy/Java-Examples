package main.exception;

public class InvalidNumberException extends ValidateException{
    public InvalidNumberException(String message){
        super(message);
    }
}
