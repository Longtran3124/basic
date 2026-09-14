package org.example.buoi10.Ex3.FE;

import org.example.buoi10.Ex3.ultils.FileManager;

public class Main {
    public static void main(String[] args) {

        String pathExists = "C:\\Java\\Basic\\untitled\\pom.xml";
        System.out.println(pathExists + " ton tai " + FileManager.isFileExist(pathExists));

        String pathNotExists = "C:\\Users\\pc\\Desktop\\Test.txt";
        System.out.println(pathNotExists + " ton tai " + FileManager.isFileExist(pathNotExists));
    }
}
