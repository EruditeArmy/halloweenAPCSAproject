package GitHub.halloweenAPCSAproject;

import java.util.Random;

public class house {

    boolean decorated;

    public house(boolean decorated){

        this.decorated = decorated;

    }
   
    public int numOfCandy(){
        Random rand = new Random();
        int numOfCandy = rand.nextInt(50);
        return numOfCandy;
    }

    public int numOfHousesVisited(){
        Random rand = new Random();
        int numOfHousesVisted = rand.nextInt(15);
        return numOfHousesVisted;
    }

    public static String houseAddress(int currentHouse){

        String address[] = {"Forestwood dr, 1441", "Stone road, 12", "Walkway roady, 94", "Green Avenue, 515", "1st Ave, 124", "41st Street, 2414", "PO Box 85182", "The House, 76"};
        
        return address[currentHouse];
    }

    public boolean isDecorated(){
        return decorated;
    }

    
}
