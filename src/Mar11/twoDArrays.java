package Mar11;

import java.lang.reflect.Array;
import java.util.Arrays;

public class twoDArrays {
    public static void main(String[] args) {
        int a[][]=new int[3][2];
        System.out.println(a);

       // Arrays.fill(a,10);
        System.out.println(Arrays.deepToString(a));

        System.out.println(a.length);
        System.out.println(a[0].length);

        Arrays.fill(a[0], 50);  //Fills row
        System.out.println(Arrays.deepToString(a));

        for(int i=0;i<a.length;i++)
        {
            Arrays.fill(a[i],40);
        }

        System.out.println(Arrays.deepToString(a));

        int b[][]=Arrays.copyOf(a,4);
        System.out.println(Arrays.deepToString(b));

        int c[][]=Arrays.copyOf(a, 2);
        System.out.println(Arrays.deepToString(c));

        for (int i=0; i<a.length; i++)
        {
            for (int j=0; j<a[i].length; j++)
            {
                a[i][j] = i*j;
            }
        }
        System.out.println(Arrays.deepToString(a));

        for (int i=0;i<a.length;i++)
        {
            b[i]=Arrays.copyOf(b[i],6);
        }

        System.out.println(Arrays.deepToString(b));

    }
}
