package Mar11;


import java.io.FileWriter;
import java.io.IOException;

public class FileWriting {


    public static void main(String[] args) throws IOException {

        writeDatatoFile(System.getProperty("user.dir")+"//src//Mar11//Log1//Log_new.txt", "sample content");
        writeDatatoFile(System.getProperty("user.dir")+"//src//Mar11//Log1//Log_new.txt", "sample content to be");
        writeDatatoFile(System.getProperty("user.dir")+"//src//Mar11//Log1//Log_new.txt", "sample content removed");
        writeDatatoFile(System.getProperty("user.dir")+"//src//Mar11//Log1//Log_new.txt", "sample content updated content");

    }

    public static void writeDatatoFile(String filePath, String content) throws IOException {

        FileWriter fr = new FileWriter(filePath);
        fr.write(content);
        fr.close();
    }
}
