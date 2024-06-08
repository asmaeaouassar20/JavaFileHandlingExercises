package file;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Write2 {
    static void writeFile() throws IOException {

        // Juste Create the three following objects
        File file=new File("C://Users//PC//Desktop//learnJavaWithAsmae/newFile");
        FileWriter fileWriter=new FileWriter(file);
        PrintWriter printWriter=new PrintWriter(fileWriter);

        // Now, write on the file using print() method
        printWriter.println("hello!");
        printWriter.print("I am Asmae ");
        printWriter.print("Aouassar");

        // Please don't forget to close your buffer
        printWriter.close();
    }

    public static void main(String[] args) throws IOException{
        writeFile();
    }
}
