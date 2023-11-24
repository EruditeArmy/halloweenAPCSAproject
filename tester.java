package GitHub.halloweenAPCSAproject;

import java.util.Random;

public class tester {
  
    public static void main(String[] args) {

        int ammountOfTrickOrTreaters = 4;

        //Make sure this number is correlated to amount of names in array within person.java for the names method to make sure the amount of people does not go out of the scope of people.
        int amountOfHousesVisited = 4;

        String name[] = {"Joe", "Bob", "Alex", "Jack", "Jake", "Shawn", "Ryan"};
        String costume[] = {"Spiderman", "Thor", "Captain America", "Hulk", "Iron man", "Black Widow", "Superman"};

        //To be use for random amount of tricks
        Random rand = new Random();


        for(int i = 0; i<ammountOfTrickOrTreaters; i++){

            person myTrickerTreater1 = new person(ammountOfTrickOrTreaters, name[i], costume[i]);
            
            System.out.println(myTrickerTreater1.getName() + " was dressed as " + myTrickerTreater1.getCostume());

            for(int b = 0; b<amountOfHousesVisited; b++){

                house myHouse = new house(coinflip(10));

                
                System.out.println("House " + b + "\nAddress : " + house.houseAddress(b) + "\n" + myTrickerTreater1.addNumOfCandy(b));
                System.out.println("Since the house's decoration was " + myHouse.isDecorated() + "\n" + myTrickerTreater1.getName() + " decided to " + myTrickerTreater1.trickOrTreat(myHouse.isDecorated(), rand.nextInt(5)));

            }

            System.out.println("After all of this " + myTrickerTreater1.getName() + " ended with " + myTrickerTreater1.getNumOfCandy() + " Pieces of candy and visited " + amountOfHousesVisited + " houses");
            
            System.out.println(myTrickerTreater1.getName() + " got home at " + myTrickerTreater1.homeBy() + "\n\n");

            
            
        }
        
    }

    public static boolean coinflip(int range){

        Random rand = new Random();

        if(rand.nextInt(range)>2){
            return true;
        }
        else{
            return false;
        }
    }

    
}