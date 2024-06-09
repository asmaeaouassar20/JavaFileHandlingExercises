package file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Read2 {

    static void readFile() throws IOException{
        // First, you should know that there are many ways to read a file
        // In the following example we will use Scanner class

        // So, pick up the file
        File file = new File("C://Users//PC//Desktop//learnJavaWithAsmae/myFile.txt");

        // Remember that when we read from a standard source like keyboard, we use System.in
        // But now we want to read from a file:
        // So we will use the following constructor
        //Scanner(File source) that Constructs a new Scanner that produces values scanned from the specified file.
        Scanner scanner = new Scanner(file);

        // Now we use this scanner to retrieve the content of the file
        // Starting with the first line. Retrieve it and store it in a variable
        //String line=scanner.nextLine();
        // REMARK : if you want to retrieve just the first word you can use the following
        // String firstWord=scanner.next()

        // Now, I want to read the full content of the file
        // SO, I will use while loop
        while(scanner.hasNextLine()){
            String line=scanner.nextLine();
            System.out.println(line);
        }

    }

    static public void main(String[] args) throws IOException{
        readFile();
    }


}
