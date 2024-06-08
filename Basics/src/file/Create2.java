package file;

import java.io.File;
import java.io.IOException;

public class Create2 {
    static void createFile() throws IOException {

        // Where do you want to create the file
        String pathname="C://Users//PC//Desktop//learnJavaWithAsmae/newFile.txt";
        // If you provide juste the name of the file you want to create, it will be created in the same folder of your project

        File file=new File(pathname);
        if(file.createNewFile()){
            System.out.println("the file is created successfully ! ");
        }else{
            System.out.println("the file is already exists ! ");
        }

    }

    public static void main(String[] args) throws IOException {
        createFile();
    }
}
