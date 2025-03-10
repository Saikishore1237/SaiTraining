package Mar10;

class CheckTime {
    long startTime = 0l;
    long endTime = 0l;
    long timeDiff = 0l;

    public void concatTest1(String str) {
        startTime = System.nanoTime();
        str = str + "kirak";
        endTime = System.nanoTime();
        timeDiff = endTime - startTime;
        System.out.println("String time diff is " + timeDiff);
    }

    public void concatTest2(StringBuilder str) {
        startTime = System.nanoTime();
        str = str.append("kirak");
        endTime = System.nanoTime();
        timeDiff = endTime - startTime;
        System.out.println("StringBuilder time diff is " + timeDiff);
    }

    public void concatTest3(StringBuffer str) {
        startTime = System.nanoTime();
        str = str.append("kirak");
        endTime = System.nanoTime();
        timeDiff = endTime - startTime;
        System.out.println("StringBuffer time diff is " + timeDiff);
    }
}

public class StringBuilderandBuffer {
    public static void main(String[] args) {
        CheckTime object = new CheckTime();
        String website1 = "w3schools";
        object.concatTest1(website1);

        StringBuilder website2 = new StringBuilder("w3schools");
        object.concatTest2(website2);

        StringBuffer website3 = new StringBuffer("w3schools");
        object.concatTest3(website3);
    }
}
