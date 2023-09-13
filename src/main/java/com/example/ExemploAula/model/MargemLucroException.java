package com.example.ExemploAula.model;

public class MargemLucroException extends Exception {

    public MargemLucroException() {
        super("A Margem de lucro deve sempre ser maior ou igual a 20%");
    }

}
