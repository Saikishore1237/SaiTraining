package feb25;

class players
{
    int b=30;
public players()
{
    System.out.println("this is default constructor");
}
public int display()
{
    System.out.println("Display method execution");
    return b;
}

}


public class PlayerCheck {
    public static void main(String[] args) {

        players p1 = new players();
        int a = p1.display();
        System.out.println("a value got from b "+a);
    }
}
