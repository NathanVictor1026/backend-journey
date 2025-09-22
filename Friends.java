public class Friends {
    static int numberOfFriends; // static means that number of friends is shared throughout the method
    String name;
    Friends(String name){
        this.name = name;
        numberOfFriends++;
    }
    static void displayFriends(){    //static void because it is using a static parameter.
        System.out.println("You have "+numberOfFriends+ " friends.");
    }

    public static void main(String[] args) {
        // creating instance of the Friends class.
        Friends friend1 = new Friends("Nathan");
        Friends friend2 = new Friends("Zeus");
        Friends friend3 = new Friends("Victor");
        Friends friend4 = new Friends("Tenzu");

        Friends.displayFriends();
    }
}
