package file;

import java.io.BufferedReader;
import java.io.FileReader;

public class ReadMultipleDataType {
   public static void main(String[] args){
       // This time we will see how to iterate through the contents of a file with different data types

       // So try first to create a file that contains data with different type

       // Let me tell that is easy, you have just to read the file line by line,
       // then parse each line according to the expected type of data

       // Which mean that we will use appropriate parsing methods to convert string to specific data
       // types (integers, floats, etc ... )
       // So we will create a static method called void processLine(String line) that does those things for each line
       // Let me consider that the file contains the following types of data : string and float
       // But, of course , it depends on what you choose
       // So, in my case, since, i have a float then i will add another method
       // Called isFloat()
       // If you don't understand yet, just read the following implementation, and I am sure that you are able to understand it

       String pathname="C://Users//PC//Desktop//learnJavaWithAsmae//myFile.txt";
       try{
           BufferedReader bufferedReader=new BufferedReader(new FileReader(pathname));
           String line=bufferedReader.readLine();
           while(line!=null){
               processLine(line);
               line=bufferedReader.readLine();
           }
           bufferedReader.close();
       }catch(Exception e){
           e.printStackTrace();
       }

   }


    static void processLine(String line){
       // our data is separated by space
        String[] data=line.split(" ");

        System.out.println("--------------------");

        // Iterate over the array of strings
        for(String d:data){
            if(isFloat(d)){
                System.out.println("Float : "+Float.parseFloat(d));
            }else{
                System.out.println("String : "+d);
            }
        }
        System.out.println("--------------------");

    }


    static boolean isFloat(String word){
       try{
           Float.parseFloat(word);
           return true; // This means that since there was no exception, we were therefore able to analyze the float
       }catch (Exception e){
           return false; // But if the word wasn't a float, so we return false;
       }
    }
}
