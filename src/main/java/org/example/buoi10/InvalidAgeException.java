package org.example.buoi10;

// Tự định nghĩa Exception
public class InvalidAgeException extends Exception{
    public InvalidAgeException(String message) {
        super(message);
    }
}
