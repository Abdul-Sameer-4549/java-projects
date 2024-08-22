//i made a cofee token printing machine
import java.util.Scanner;

public class MySwitch {
    public static void main(String[] args) {
                Scanner hotel = new Scanner(System.in);
                System.out.println("1: Green tea");
                System.out.println("2: chai");
                System.out.println("3: Latey");
                System.out.println("4: sharbath");
                System.out.println("5:cold cofee");
                System.out.println("6: hot cofee");
                System.out.println("Enter your choice ");
                int choice = hotel.nextInt();
                switch (choice) {
                        case 1: 
                        System.out.println("Here you have the bestGreen tea");
                        break;
                    
                        case 2: 
                        System.out.println("Here you have the best Chai");
                        break;

                        case 3: 
                        System.out.println("Here you have the best Latey");
                        break;

                        case 4: 
                        System.out.println("Here you have the best sharbath");
                        break;

                        case 5: 
                        System.out.println("Here you have the best Cold cofee");
                        break;

                        case 6: 
                        System.out.println("Here you have the best Hot Coffe");
                        break;
                    default: System.out.println(("sorry we dont7 have"));;
                        break;
                }
        } 
    }

