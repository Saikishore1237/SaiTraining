package feb24;
class temp
        {
            String fname, lname;
            public void display()
            {
                System.out.println(fname);
                System.out.println(lname);
            }

            public temp(String firstName, String lastName)
            {
                this.fname=firstName;
                this.lname=lastName;
            }
                }
public class thisKeyword {
    public static void main(String[] args) {
        temp k1=new temp("sai","Ranga");
        k1.display();
    }
}
