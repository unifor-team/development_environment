package utils;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Writer<T> {
    private ArrayList<T> list;
    private String fileName;

    public Writer(ArrayList<T> list, String fileName) {
        this.list = list;
        this.fileName = fileName;
    }

    public void writeFile() {
        try {
            FileWriter file = new FileWriter(fileName);

            String[] mainFileName = fileName.split("\\\\_");
            file.write(mainFileName[0]);
            file.write("\n");

            for (T product : this.list) {
                file.write(product.toString());
                file.write("\n");
            }
            file.close();
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }
}
