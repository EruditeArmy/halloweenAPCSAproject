package GitHub.halloweenAPCSAproject;

import java.util.Random;

public class house {

    // instance variable
    boolean decorated;

    // object creation method
    public house(boolean decorated){

        this.decorated = decorated;

    }

    // returns numOfCandy to be used with the person class
    public int numOfCandy(){
        Random rand = new Random();
        int numOfCandy = rand.nextInt(50);
        return numOfCandy;
    }

    // returns numOfHousesVisited to be used with the person class
    public int numOfHousesVisited(){
        Random rand = new Random();
        int numOfHousesVisted = rand.nextInt(15);
        return numOfHousesVisted;
    }

    // static house adresses
    public static String houseAddress(int currentHouse){

        String address[] = {"Forestwood dr, 1441", "Stone road, 12", "Walkway roady, 94", "Green Avenue, 515", "1st Ave, 124", "41st Street, 2414", "PO Box 85182", "The House, 76"};
        
        return address[currentHouse];
    }

    // returns if the house is decorated or not
    public boolean isDecorated(){
        return decorated;
    }

    
}
