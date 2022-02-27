package main;

import main.exception.InvalidNumberException;
import main.exception.ValidateException;

public class App 
{
    public static void main( String[] args )
    {
        String text = "1tex";
        Validate validate = new Validate();

        try{
            validate.validateText(text);
        }catch(ValidateException error){
            System.out.println(error.getMessage());
        }

        try{
            validate.validateNumbers(text);
        }catch(InvalidNumberException error){
            System.out.println(error.getMessage());
        }
    }

}
