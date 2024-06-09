package exercise5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Solution {
    static int occurWord(String word) throws FileNotFoundException {
        // Pick up the file
        String pathname="C://Users//PC//Desktop//learnJavaWithAsmae/myFile.txt";
        File file=new File(pathname);

        // Use a scanner to read
        Scanner scanner=new Scanner(file);

        // We need to initialize a variable to calculate the number of occurrences of the word
        int counter=0;


        // We have to read the file word by word using a while loop
        while(scanner.hasNext()){
            String wordInFile=scanner.next();
            if(wordInFile.equals(word)) counter++;
        }
        return counter;
    }

    public static void main(String[] args) throws FileNotFoundException{
        System.out.print("What is the word whose the number of appearances are you looking for: ");
        Scanner scanner=new Scanner(System.in);
        String word=scanner.next();
        System.out.println("the word \""+word+"\" appears "+occurWord(word)+" times");
    }
}
