import java.util.Scanner;
public class maths {
    public static void main(String[] args) {
        //simple program to calculate the hypotenuse of a triangle
        double a, b, c;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter side a: ");
        a = input.nextDouble();

        System.out.print("Enter side b: ");
        b = input.nextDouble();

        c = Math.sqrt((a*a) + (b*b));
        System.out.println("The hypotenuse of the triangle is: "+ c);

        input.close();
    }
}
