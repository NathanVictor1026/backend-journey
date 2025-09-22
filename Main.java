
public class Main{
        public static void main(String[] args) {
            /*Human human1 = new Human("winnie", 21, 60);
            Human human2 = new Human("Nathan", 25, 85);

            human1.eat();
            Food food1 = new Food("Matooke");
            Food food2 = new Food("Banana");
            Food food3 = new Food("Rice");

            Food[] fridge = {food1, food2, food3};
            System.out.println(fridge[0].name); */
            Ride ride1 = new Ride("Volkswagen");
            Garage garage = new Garage();
            garage.park(ride1);
        }

        }