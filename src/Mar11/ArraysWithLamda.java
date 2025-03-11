package Mar11;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArraysWithLamda {
    public static void main(String[] args) {

        int a[]={5,3,2,4,5};

        Arrays.setAll(a,i->a[i]*3);

        System.out.println(Arrays.toString(a));

        Arrays.sort(a,1,3);
        System.out.println(Arrays.toString(a));
    }
}
