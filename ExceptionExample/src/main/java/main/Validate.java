package main;

import main.exception.InvalidLengthException;
import main.exception.InvalidNumberException;

public class Validate {
    
    public void validateText(String text) throws InvalidLengthException{
        if(text.length() < 5){
            throw new InvalidLengthException("Longitud invalida");
        }
    }

    public void validateNumbers(String text) throws InvalidNumberException{
        if(text.charAt(0) == '1'){
            throw new InvalidNumberException("Empieza con 1");
        }
    }
}
