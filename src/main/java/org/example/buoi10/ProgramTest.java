package org.example.buoi10;


public class ProgramTest {
    public static void main(String[] args) throws Exception {
        try {
            throw new InvalidAgeException("Age invalid");
        } catch (Exception e) {

        }
    }
}
