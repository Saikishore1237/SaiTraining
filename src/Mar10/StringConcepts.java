package Mar10;

public class StringConcepts {
    public static void main(String[] args) {

        String str1 = "MyName is Saikishore";

        System.out.println(str1);

        System.out.println(str1.charAt(3));
        System.out.println(str1.indexOf('i'));
        System.out.println(str1.toLowerCase());
        System.out.println(str1.toUpperCase());
        System.out.println(str1.substring(3,5));
        System.out.println(str1);
        System.out.println(str1.length());
        System.out.println(str1.compareTo("MyName is Saikishore"));
        System.out.println(str1.concat(" I like movies"));
        System.out.println(str1);
        System.out.println(str1.toString());
        System.out.println(str1.trim());
        System.out.println(str1.replace('r','R'));
        System.out.println(str1.isEmpty());
        /// ////////////////////////////////////////////////////////////////////////////////////////
        StringBuffer str2 = new StringBuffer("Saikishore is myname");

        System.out.println(str2);
        System.out.println(str2.append(". Hello World"));
        System.out.println(str2);
        System.out.println(str2.capacity());
        System.out.println(str2.length());
        str2.ensureCapacity(100);
        System.out.println(str2.capacity());
        System.out.println(str2.length());
        System.out.println(str2.insert(3,'K'));
        System.out.println(str2.deleteCharAt(3));
        System.out.println(str2.reverse());
        System.out.println(str2.reverse());
        str2.setLength(10);
        System.out.println(str2);

    }
}
