import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        StockItem milk = new StockItem("Milk", "1 Gallon of Milk", 3.60f, 15);
        StockItem bread = new StockItem("Bread", "1 Loaf of Bread", 1.98f, 30);
        int choice;
        Scanner scan = new Scanner(System.in);
        do
        {
            System.out.println("1. Sold One Milk\n2. Sold One Bread\n3. Change price of Milk\n4. Change price of Bread\n5. Add Milk to Inventory\n6. Add Bread to Inventory\n7. See Inventory\n8. Quit");
            choice = scan.nextInt();
            switch (choice)
            {
                case 1:
                    milk.setQuantity(1);
                    break;
                case 2:
                    bread.setQuantity(1);
                    break;
                case 3:
                    milk.setPrice();
                    break;
                case 4:
                    bread.setPrice();
                    break;
                case 5:
                    System.out.println("How many milk did we get?");
                    int numMilk = scan.nextInt();
                    milk.raiseQuantity(numMilk);
                    break;
                case 6:
                    System.out.println("How many bread did we get?");
                    int numBread = scan.nextInt();
                    bread.raiseQuantity(numBread);
                    break;
                case 7:
                    System.out.println(milk);
                    System.out.println(bread);
                    break;
                case 8:
                    break;
            }
        } while (choice != 8);
    }
}

