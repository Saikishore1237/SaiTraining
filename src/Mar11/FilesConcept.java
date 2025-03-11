package Mar11;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FilesConcept {
    public static void main(String[] args) throws IOException {

        System.out.println(System.getProperty("user.dir"));

        File f1 =new File(System.getProperty("user.dir")+"//src//Mar11//Log1");
        File f2 =new File(System.getProperty("user.dir")+"//src//Mar11//Log2");

        System.out.println(f1.exists());
        System.out.println(f1.canRead());
        System.out.println(f1.canWrite());

        f1.mkdirs();
        f2.mkdirs();

        System.out.println(f1.exists());
        System.out.println(f1.canRead());
        System.out.println(f1.canWrite());

        System.out.println(f1.isDirectory());
        System.out.println(f1.getPath());

        File f3=new File(f1.getPath()+"//Log.txt");

        System.out.println(f3.exists());

        f3.createNewFile();
        System.out.println(f3.exists());

        System.out.println(f3.length());
        System.out.println(f3.lastModified());

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");

        Date d1 = new Date(f3.lastModified());
        System.out.println(sdf.format(d1));
    }
}
