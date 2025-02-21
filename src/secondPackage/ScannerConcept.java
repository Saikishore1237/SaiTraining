package secondPackage;
import java.util.Scanner;

public class ScannerConcept {
    public static void main(String[] args) {

        int FruitsPrice=0;
        int VegPrice=0;
        int FrozenPrice=0;
        int SpicePrice=0;
        int Amount=0;
        float AmountPayable;
        float GST;
        Scanner GrocName = new Scanner(System.in);
        Scanner Item = new Scanner(System.in);

        while(true) {
            System.out.println("Enter which category you want to buy? Fruits/Veg/Frozen/Spices/None");
            String b = GrocName.next();
            while (true) {
                if (b.equalsIgnoreCase("Fruits")) {
                    System.out.println("Please enter Fruit name");
                    String a = Item.next();

                    if (a.equalsIgnoreCase("Apple")) {
                        FruitsPrice = FruitsPrice + 10;
                    } else if (a.equalsIgnoreCase("Banana")) {
                        FruitsPrice = FruitsPrice + 20;
                    } else if (a.equalsIgnoreCase("Guaua")) {
                        FruitsPrice = FruitsPrice + 30;
                    }

                    System.out.println("Do You want to buy more Items? Yes or No");

                    if (Item.next().equalsIgnoreCase("No")) {
                        System.out.println("Total Fruits cost: " + FruitsPrice);
                        break;
                    }
                } else if (b.equalsIgnoreCase("Veg")) {
                    System.out.println("Please enter Veg name");
                    String a = Item.next();

                    if (a.equalsIgnoreCase("Carrot")) {
                        VegPrice = VegPrice + 15;
                    } else if (a.equalsIgnoreCase("Cucumber")) {
                        VegPrice = VegPrice + 25;
                    } else if (a.equalsIgnoreCase("Beetroot")) {
                        VegPrice = VegPrice + 35;
                    }
                    System.out.println("Do You want to buy more Items? Yes or No");

                    if (Item.next().equalsIgnoreCase("No")) {
                        System.out.println("Total Vegetables cost: " + VegPrice);
                        break;
                    }
                } else if (b.equalsIgnoreCase("Frozen")) {
                    System.out.println("Please enter Frozen item name");
                    String a = Item.next();

                    if (a.equalsIgnoreCase("Paneer")) {
                        FrozenPrice = FrozenPrice + 50;
                    } else if (a.equalsIgnoreCase("Cheese")) {
                        FrozenPrice = FrozenPrice + 70;
                    } else if (a.equalsIgnoreCase("Nuggets")) {
                        FrozenPrice = FrozenPrice + 100;
                    }
                    System.out.println("Do You want to buy more Items? Yes or No");

                    if (Item.next().equalsIgnoreCase("No")) {
                        System.out.println("Total Frozen Items cost: " + FrozenPrice);
                        break;
                    }
                } else if (b.equalsIgnoreCase("Spices")) {
                    System.out.println("Please enter Spice name");
                    String a = Item.next();

                    if (a.equalsIgnoreCase("Lays")) {
                        SpicePrice = SpicePrice + 20;
                    } else if (a.equalsIgnoreCase("Kurkure")) {
                        SpicePrice = SpicePrice + 40;
                    } else if (a.equalsIgnoreCase("rolls")) {
                        SpicePrice = SpicePrice + 95;
                    }
                    System.out.println("Do You want to buy more Items? Yes or No");

                    if (Item.next().equalsIgnoreCase("No")) {
                        System.out.println("Total Spices cost: " + SpicePrice);
                        break;
                    }
                }

                else if (b.equalsIgnoreCase("None")) {
                    break;
                }

            }
            if (b.equalsIgnoreCase("None")) {
                Amount = FruitsPrice+VegPrice+FrozenPrice+SpicePrice;
                System.out.println("Amount for Groceries: " + Amount);
                GST = (Amount/100)*18;

                System.out.println("GST on the price: "+ GST);
                AmountPayable = (float)Amount+GST;
                System.out.println("Total amount payable: "+AmountPayable);
                break;
            }
        }
     }
}
