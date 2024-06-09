package exercise2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class solution {
    public static void main(String[] args) throws IOException{
        String pathname="C://Users//PC//Desktop//learnJavaWithAsmae/myFile.txt";
        String messageToAdd1="Hi! I am Asmae !\n";
        String messageToAdd2="I am happy when I learn Java";


        writeInFile(pathname,messageToAdd1,true);
        writeInFile(pathname,messageToAdd2,true);


    }


    static void writeInFile(String pathname,String contentToWrite,Boolean append) {
        try{
            File file=new File(pathname);
            FileWriter fileWriter=new FileWriter(file,append);
            PrintWriter printWriter=new PrintWriter(fileWriter);

            printWriter.print(contentToWrite);
            printWriter.close();
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
