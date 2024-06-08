package file;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class Move {
    // Our goal is to move a file from one location to another

    static void moveFile(){
        // we need to provide 2 paths
        // the first path of the file we want to move => "pathnameFileToMove"
        // the second path corresponds to the location where we want to move our file ==> "pathnameLocationDestination"

        String pathnameFileToMove="C://Users//PC//Desktop//learnJavaWithAsmae/asmae.html";
        File fileToMove=new File(pathnameFileToMove);


        String pathnameLocationDestination="C://Users//PC//Desktop//learnJavaWithAsmae//newFolder/"+fileToMove.getName();
        File locationSource=new File(pathnameLocationDestination);

        // In fact :
        // 1. you give the path of the file that you want to move
        // 2. you give the path of the destination location but don't forget to follow it by the same file's name


        // Now, we have to copy
        try {
            Files.copy(fileToMove.toPath(),locationSource.toPath());
        } catch (IOException e) {
            e.printStackTrace();
        }

        // finally
        // Since we want to move it from a destination to another
        // We have then to delete the file from the old location
        fileToMove.delete();


    }

    public static void main(String[] args) {
        moveFile();
    }
}
