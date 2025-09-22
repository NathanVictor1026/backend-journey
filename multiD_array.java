public class multiD_array {
    public static void main(String[] args) {
        //2D array is an array of arrays
        //rows and columns
        String[][] cars = new String [2][2];
        cars[0][0] = "Lamborghini";
        cars[0][1] = "ferrari";

        cars[1][0] = "tesla";
        cars[1][1] = "benz";
        //to print through a multidimensional array, you need a nested for loop to print rows, and columns
        for (int i =0; i<cars.length; i++){
            System.out.println();
            for (int j = 0; j<cars[i].length; j++){
                System.out.print(cars[i][j]+ " ");
            }
        }

    }
}
