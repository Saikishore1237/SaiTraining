package Mar11;

public class FunctionalInterface {
    public static void main(String[] args) {

SampleFunctionalInterface s1=new SampleFunctionalInterface() {
    @Override
    public void display() {
        System.out.println("This is functional interface");
    }
};
s1.display();

SampleFunctionalInterface s2=() -> System.out.println("This is FI with LAMDA expression");

s2.display();

SampleFunctionalInterface s3=() -> {
    System.out.println("This is executing multiple steps");
    System.out.println("This to inside brackets");
};

s3.display();

FunctionalinterfacewithReturntype f1=(a,b) -> {

    // System.out.println(a+b);
    return(a+b);
        };
        System.out.println(f1.SumofNumbers(20,20));
    }
}
