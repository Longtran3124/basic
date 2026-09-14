package org.example.buoi10.Ex3.ultils;

import java.io.File;
import java.io.IOException;

public class FileManager {
    private static final String ERROR_FILE_EXISTS = "Error, file exists";
    private static final String ERROR_FILE_NOT_EXISTS = "Error, file does not exist";

    public static boolean isFileExist(String pathFile) {
        File file = new File(pathFile);
        return file.exists();
    }

    public static void createNewFile(String pathFile) throws IOException {
        if (isFileExist(pathFile)) {
            throw new RuntimeException(ERROR_FILE_EXISTS);
        }
        File file = new File(pathFile);
        file.createNewFile();
    }

    public static void createNewFile(String path, String fileName) throws IOException {
        String fullPath = path + File.separator + fileName;
        createNewFile(fullPath);
    }

    public static void deleteFile(String pathFile) throws IOException {
        if (!isFileExist(pathFile)) {
            throw new RuntimeException(ERROR_FILE_NOT_EXISTS);
        }
        File file = new File(pathFile);
        file.delete();
    }
}
