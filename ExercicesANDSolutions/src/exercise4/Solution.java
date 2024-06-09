package exercise4;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Solution {
    public static  void main(String[] args) throws IOException {

        // Pick up the first file
        String pathname1="C://Users//PC//Desktop//learnJavaWithAsmae/input.txt";
        File inputFile=new File(pathname1);

        // Pick up the second file
        String pathname2="C://Users//PC//Desktop//learnJavaWithAsmae/output.txt";
        File outputFile=new File(pathname2);

        // To write in the "output" file
        FileWriter fileWriter=new FileWriter(outputFile);
        PrintWriter printWriter=new PrintWriter(fileWriter);

        // To read from the "input" file
        Scanner scanner=new Scanner(inputFile);

        while(scanner.hasNextInt()){
            int integer1=scanner.nextInt();
            int integer2=scanner.nextInt();
            printWriter.println(integer1+integer2);
        }
        printWriter.close();



    }
}
