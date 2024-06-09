package file;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class AddContent {
    static void addContent() throws IOException {

        // We suppose that we have already an existing file filled with some information
        // Let's first pick up this file
        File file=new File("C://Users//PC//Desktop//learnJavaWithAsmae/existingFile.txt");

        // remember that when we wanted to write on a file, we used the FileWriter class with the following constructor
        // FileWriter(File file)
        // But Now we want to add a content
        // which mean that we don't want to overwrite previous content
        // This is why we will use the same constructor expect that we will add a second parameter
        // FileWriter(File file, Boolean append)
        FileWriter fileWriter=new FileWriter(file, true); // append=true

        // Now we continue as we did in previous examples (other Java files in the same package)
        PrintWriter printWriter=new PrintWriter(fileWriter);
        printWriter.print("\nNew Added content");
        printWriter.close();

    }
}
