import java.util.ArrayList;

public class forEach {
    public static void main(String[] args) {
        // less steps, an enhanced for loop
        ArrayList<String> animals = new ArrayList<String>();
        animals.add("Cheetah");
        animals.add("Lion");
        animals.add("Zebra");

        for (String i : animals){
            System.out.println(i);
        }
    }
}
