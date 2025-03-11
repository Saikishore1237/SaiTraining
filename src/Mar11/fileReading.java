package Mar11;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class fileReading {
    public static void main(String[] args) throws IOException {
        readDatafromFile(System.getProperty("user.dir")+"//src//Mar11//Log1//Log.txt");
        readDataAlternative(System.getProperty("user.dir")+"//src//Mar11//Log1/Log_new.txt");
    }

    public static void readDatafromFile(String filePath) throws IOException {
        FileReader fr = new FileReader(filePath);
        System.out.println(fr.read());

        int a=0;

        while((a=fr.read())!=-1)
        {
            System.out.print((char)a);
        }
    }

    public static void readDataAlternative(String filePath) throws IOException {
        FileReader fr = new FileReader(filePath);
        BufferedReader br = new BufferedReader(fr);
        System.out.println(br.readLine());
    }

}
