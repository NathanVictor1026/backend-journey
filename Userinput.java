import java.util.Scanner;
public class Userinput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("What is your name? ");
        String name = input.nextLine();

        System.out.println("hello "+ name);
        input.close();
    }
}
