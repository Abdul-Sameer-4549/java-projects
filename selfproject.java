import java.util.Scanner;
class MyScanner {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("What is your Name?");
        String name= input.nextLine();
        System.out.println("How old are you? ");
        int age = input.nextInt();
        input.nextLine();
        System.out.println("What is your favorouit food");
        String food = input.nextLine();

        System.out.println("Hello "+ name);
        System.out.println("You like " + food);
        System.out.println("you are " + age + " Years old");
    }
}
