public class arrays {
    public static void main(String[] args) {
        //store multiple values in a single variables
        String[] cars = {"Camaro", "Benz", "Tesla"};
        System.out.println(cars[1]);
        //data types in an array have to be consistent.

        /* or*/
        String[] students = new String[10]; //declare an array called students, and will hold 10 strings.

        //how to loop through an array
        //using a for loop.
        for (int i = 0; i<= cars.length; i++) {
            System.out.println(cars[i]);
        }
    }
}
