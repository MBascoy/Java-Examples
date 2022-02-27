package main.exception;

public class InvalidLengthException extends ValidateException{
    public InvalidLengthException(String message){
        super(message);
    }
}