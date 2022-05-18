package com.example;

import java.util.Locale;
import java.util.ResourceBundle;

public class App 
{
    public static void main( String[] args )
    {
        Locale usLocale = new Locale("en", "US");
        Locale esLocale = new Locale("es", "ES");
        
        ResourceBundle words;

        words = ResourceBundle.getBundle("WordList", esLocale);

        System.out.println("Palabras en español:");
        System.out.println(words.getString("coche"));
        System.out.println(words.getString("casa"));
        System.out.println(words.getString("hola"));

        words = ResourceBundle.getBundle("WordList", usLocale);

        System.out.println("\nPalabras en ingles:");
        System.out.println(words.getString("coche"));
        System.out.println(words.getString("casa"));
        System.out.println(words.getString("hola"));


    }
}
