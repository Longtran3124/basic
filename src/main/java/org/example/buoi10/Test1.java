package org.example.buoi10;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test1 {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Java\\Basic\\untitled\\src\\main\\java\\org\\example\\buoi10\\HI.md");
        // check file is exists
//        if (file.exists()) {
//            System.out.println("File exists");
//        } else  {
//            System.out.println("File doesn't exist");
//        }

        // create file
//        if (file.createNewFile()) {
//            System.out.println("Tao thanh cong");
//        } else  {
//            System.out.println("Tao that bai");
//        }

        String content = "Myname: Nguyen Van A";

        FileOutputStream fileOutputStream = new FileOutputStream("C:\\Java\\Basic\\untitled\\src\\main\\java\\org\\example\\buoi10\\HI.md", false);
        fileOutputStream.write(content.getBytes());
        fileOutputStream.close();
    }
}
