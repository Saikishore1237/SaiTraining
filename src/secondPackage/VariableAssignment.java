package secondPackage;

import org.w3c.dom.ls.LSOutput;

public class VariableAssignment {
    public static void main(String[] args) {

        int a=10;
        String b="saikishore is my name";

      //  while(a<15)
        //{
          //  System.out.println("While is working");
            // a=a+2;
        //}
while(b.length()>5)
        {
            System.out.println(b.substring(0, b.length()-1));
            b=b.substring(0, b.length()-1);

        }
    }
}
