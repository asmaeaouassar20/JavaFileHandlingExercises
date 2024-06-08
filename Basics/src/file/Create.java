package file;

import java.io.File;
import java.io.IOException;

public class Create {

    static void createFile(){
        // To create a file
        // we have to use File class and the key word 'new'
        // Between quotation marks you have to provide the pathname
        // Don't forget to use slash instead of backslash
        String pathname="C://Users//PC//Desktop//learnJavaWithAsmae/file.txt";
        File file=new File(pathname);

        // Now we have created a new File instance by converting the given pathname string into an abstract pathname.

        // We have to verify if the file already exist before creating it, so we use  exists() method
        if(!file.exists()){
            try{
                file.createNewFile(); // Atomically creates a new, empty file named by this abstract pathname if and only if a file with this name does not yet exist.
                System.out.println("the file is created in "+pathname);
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        // Let's call our function and execute
        createFile();
    }

}
