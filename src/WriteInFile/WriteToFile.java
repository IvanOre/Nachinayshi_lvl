package WriteInFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class WriteToFile {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("Test2");
        PrintWriter pw = new PrintWriter(file);//  с помощью него запись в файл

        pw.println("Hello from lesson write to file");
        pw.println("Row 2");

        pw.close();
    }
}
