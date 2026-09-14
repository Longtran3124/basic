package org.example.buoi10;

public class Test {
    public static void main(String[] args) {
        // Phương thức sayHello thuộc về đối tượng
        Student student = new Student();
        student.sayHello();

        // phương thức sayGoodbye thuộc về class vì có từ khóa static
        Student.sayGoodbye();
    }
}
