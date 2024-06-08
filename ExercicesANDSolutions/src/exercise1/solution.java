package exercise1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class solution {
   static void createFile(){
       // Ok, first, make sure  you have read the exercise statement
       // first, we create an ArrayList that contains lines of html code
       String [] contentHTMLArray={"<html>","<head>","<title> This is our title </title>",
               "</head>","<body>","<h1> Hi I am Asmae ! </h1>","<p> Nice to meet you ! </p>","</body>","</html>"};
       List<String> contentHTMLList= Arrays.asList(contentHTMLArray);

       // Now we have to iterate through our list and insert each element in the file
       // but first let's creat a new file and don't forget to verify whether the file exists already or not
       String pathname="C://Users//PC//Desktop//learnJavaWithAsmae/asmae.html";
       File file=new File(pathname);

       if(!file.exists()){
           System.out.println("the file doesn't exist");
           try {
               file.createNewFile();
               System.out.println("file is created successfully in "+pathname);
           } catch (IOException e) {
               e.printStackTrace();
           }

       }else{
           System.out.println("this file  already exists");
       }


       // Now, after preparing our file, let's fill it with html code
       // So, let's instantiate FileWriter and BufferedWiter  classes
       try {
           FileWriter fileWriter=new FileWriter(pathname);
           BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
           System.out.println("_____  here are our lines _____");
           for(String line: contentHTMLList){
                bufferedWriter.write(line);
                bufferedWriter.newLine();
                System.out.println(line);
           }
           bufferedWriter.close();
           fileWriter.close();
       } catch (IOException e) {
           e.printStackTrace();
       }


   }


    public static void main(String[] args) {
        // call the method
        createFile();
    }

}











