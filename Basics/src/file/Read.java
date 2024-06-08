package file;

import java.io.*;

public class Read {
    static void readFile(){
        // First, we need to provide the pathname of the file to read
        String pathname="C://Users//PC//Desktop//learnJavaWithAsmae/asmae.html";
        File file=new File(pathname);

        // To Write we use BufferedWriter . To Read, we use BufferedRead
        // To Write we use FileWriter . To Read, we use FileReader
        try {
            FileReader fileReader=new FileReader(file);

            // We Create a buffer to read the file
            BufferedReader bufferedReader=new BufferedReader(fileReader);

            // retrieve each line of my file, line by line using while loop + readLine() method
            // please note that before displaying a line, we have to check first its existence

            // But, first, let's retrive the first line
            String line=bufferedReader.readLine();
            while(line!=null){
                System.out.println(line);
                line=bufferedReader.readLine();
            }

            // Close the buffer
            bufferedReader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        readFile();
    }
}
