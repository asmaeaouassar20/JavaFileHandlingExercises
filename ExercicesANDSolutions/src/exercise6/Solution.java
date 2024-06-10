package exercise6;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Solution {

    // Maybe you are wondering
// ok, I know how to search for a word in a file but what about a letter
// That's easy
// Since you are iterating through the words in the file, then you simply test each time if the letter you are looking for exists in the word

    static int occurLetter(File file,char letter) throws IOException {

        // Read the file using a scanner
        Scanner scanner=new Scanner(file);

        // Initialize the counter
        int counter=0;

        // iterate over the words of your file
        while(scanner.hasNext()){
            String word=scanner.next();
            for(int i=0;i<word.length();i++){
                if(word.charAt(i)==letter) counter++;
            }
        }
        return counter;

    }

    public static void main(String[] args) throws IOException{
        // pick up the filex
        File file=new File("C://Users//PC//Desktop//learnJavaWithAsmae/myFile.txt");

        Scanner scanner=new Scanner(System.in);
        System.out.print("enter the letter you are looking for: ");
        char character=scanner.next().charAt(0);
        System.out.println("the letter "+character+" appears " +occurLetter(file,character)+" times int the file");
    }
}
