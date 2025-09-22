import java.util.ArrayList;

public class arrayList {
    public static void main(String[] args) {
        /* array list is a resizable array. elements can be removed or added .
        arraylist stores reference data types
         */
        //syntax
        ArrayList<String> food = new ArrayList<String>();
        //use the add function
        food.add("Pizza");
        food.add("Mbosho");
        food.add("Chipchap");
        //to print items, use a for loop
        for (int i = 0; i<food.size(); i++){
            System.out.println(food.get(i));
        }
        //important methods in ArrayList
        /*
        food.set(0, sushi)
        food.remove(2)
        food.clear()
         */
    }
}
