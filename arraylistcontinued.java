import java.util.*;
public class arraylistcontinued {
    public static void main(String[] args) {
        // this is a list of lists. 2D arrayList

        ArrayList<ArrayList<String>> groceries = new ArrayList<>();

        // list one
        ArrayList<String> bakeryList = new ArrayList<String>();
        bakeryList.add("bread");
        bakeryList.add("cake");
        bakeryList.add("doughnut");

        // list two
        ArrayList<String> produceList = new ArrayList<String>();
        produceList.add("tomatoes");
        produceList.add("greens");
        produceList.add("potatoes");

        // add the seperate lists to the major list
        groceries.add(bakeryList);
        groceries.add(produceList);


        System.out.println(groceries.get(0).get(0));

    }
}
