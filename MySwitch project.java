import java.util.Scanner;

public class MySwitch {
    public static void main(String[] args) {
       /*String day = "Sunday";

        switch (day) {
            case "Monday": System.out.println("there is Monday!");
                break;

                case "Tuesday": System.out.println("there is Tuesday!");
                break;

                case "Wednesday": System.out.println("there is Wednesday!");
                break;

                case "Thursday": System.out.println("there is Thursday!");
                break;

                case "Friday": System.out.println("there is Friday!");
                break;

                case "Saturday": System.out.println("there is Saturday!");
                break;

                case "Sunday": System.out.println("Wooh Oh fun Day !");
                break;
            default:
                break;*/


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

