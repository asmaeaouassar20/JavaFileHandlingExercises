package exercise3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class solution {
    // This time, I will just write the solution in the main method
    public static void main(String[] args) throws IOException {

        // provide paths
        String pathname1="C://Users//PC//Desktop//learnJavaWithAsmae/input.txt";
        String pathname2="C://Users//PC//Desktop//learnJavaWithAsmae/output.txt";

        // pick up your two files
        File input=new File(pathname1);
        File output=new File(pathname2);

        // To write in the "output" file, we need the two following objects
        FileWriter fileWriter=new FileWriter(output);
        PrintWriter printWriter=new PrintWriter(fileWriter);

        // Use a scanner to read from the "input" file
        Scanner scanner=new Scanner(input);

        //Now, let's transfer the content from the "input" file to "output" file
        while(scanner.hasNextLine()){
            String line=scanner.nextLine();
            System.out.println(line+" (line transferred successfully ! )");
            printWriter.println(line);
        }

        // Close the buffer
        printWriter.close();
    }
}
