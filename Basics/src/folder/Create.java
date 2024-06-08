package folder;

import java.io.File;

public class Create {
    static void createFolder(){
        // To create a folder, we can use the File class

        // first lets give the pathname, and don't forget to use slash instead of backslash
        String pathname="C:/Users/PC/Desktop/learnJavaWithAsmae/folder";

        // let's instantiate the File class
        File folder=new File(pathname);

        // Now let's verify whether the exists() method
        // which tests whether the file or directory denoted by the abstract pathname exists.
        if(!folder.exists()){
            folder.mkdir(); // mkdir() : Creates the directory named by this abstract pathname, including any necessary but nonexistent parent directories.
            System.out.println("the folder is created successfully in "+pathname);
        }
    }


    public static void main(String[] args) {
        // let's call our function , then execute
        createFolder();
    }
}
