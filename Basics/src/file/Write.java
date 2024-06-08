package file;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Write {
    static void writeFile() throws IOException {
        // First of all, to write on a file, the file should exist
        // This is why , whether you create a file or you use a file that already exists
        // for me, I will use a file that already exist
        String pathname="C://Users//PC//Desktop//learnJavaWithAsmae/file.txt";
        File file=new File(pathname);

        // First, you should know that there are many ways to write on a file
        // But, you are beginner, you don't have to know all of them at the first time
        // So, try just to understand the following steps

        // I will use FileWriter class
        // instantiate this class using the constructor given a File object
        FileWriter fileWriter=new FileWriter(file);  // Exception : error pointing to a file that doesn't exist

        // Now we have to create like a connection with this file, so that we can interact with it
        // So, we use BufferedWriter
        BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);

        // Now, writing on our file is the easier
        bufferedWriter.write("the text that you want to write on your file\n");
        bufferedWriter.write("Hi, I am Asmae !! ");
        bufferedWriter.newLine(); // To skip a line, you can use newLine() method or add '\n"
        bufferedWriter.write("Nice to meet you\n");
        bufferedWriter.write("I am a Java passionate");


        // the final step and logical one is to close the BufferedWriter and the FileWriter
        bufferedWriter.close();
        fileWriter.close();

        System.out.println("You just wrote in the file ! ");


    }

    public static void main(String[] args) throws IOException {
        // Now, let's call our method , then execute
        writeFile();

        // see the content of your file

        // What if the file was not empty initially ?
        // So, the previous content will be overwritten
    }
}
