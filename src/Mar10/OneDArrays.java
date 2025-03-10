package Mar10;

import java.lang.reflect.Array;
import java.util.Arrays;

public class OneDArrays {
    public static void main(String[] args) {
        int a[] = new int[10];
        System.out.println(a);
        System.out.println(a.length);
        for (int i=0; i<a.length; i++)
        {
            a[i] = i*i;
            System.out.print(a[i]);
        }

        System.out.println(Arrays.toString(a));
        Arrays.fill(a, 40);
        System.out.println(Arrays.toString(a));

        int b[] = Arrays.copyOf(a,8);
        System.out.println(Arrays.toString(b));

        int c[]=Arrays.copyOfRange(a,4,8);
        System.out.println(Arrays.toString(c));

        String str[] = {"Hi", "Hello", "Adab", "Namasthe"};

        System.out.println(str);
        System.out.println(Arrays.toString(str));
        System.out.println(str.length);

        String str2[] = str;

        System.out.println("str2 string is "+Arrays.toString(str2));
        System.out.println(Arrays.mismatch(str, str2));

        String str3[]=str.clone();
        System.out.println(Arrays.toString(str3));

    }
}
