package GitHub.halloweenAPCSAproject;

import java.util.Random;


public class person {

    // instance variables used in simulation
    private int numOfCandy = 0;
    private String name;
    private String costume;
    private int numOfHousesVisited;

    // the object with needed parameters
    public person(int numOfHousesVisited, String name, String costume){

        this.numOfHousesVisited = numOfHousesVisited;
        this.name = name;
        this.costume = costume;
    }

    // Trick or treat method 
    public String trickOrTreat(boolean houseDecor, int numOfTricks){

        if(houseDecor == true){

            String treats[] = {"Candy Corn", "Chocolate", "Lolipop", "Starburts", "Sour patch kids", "Welch's Gummy Snacks", "Milkyway", "Snickers"};
            Random rand = new Random();

            return "recieved their favorite candy " + treats[rand.nextInt(treats.length)];

        }
        else{

            String tricks[] = {"Played the trick of punching them in the face and ran away with the candy ", "Played the trick of taking all their candy then giving it out to friends", "Played the trick of taking their costume and running away with the candy recieved", "Played the trick beating [NON PAINFULLY] them up then running away with the candy", "Played the trick of toilet paper on their house and ran away with candy"};
            Random rand = new Random();
            int x = rand.nextInt(4);
        
            String myText = tricks[x] + " " + numOfTricks + " Times, ";

            return myText;
        }
        
    }
    


    // returns what time the person gets home after trick or treating
    public String homeBy(){

        Random rand = new Random();

        return "and was home by " + (rand.nextInt(3) + 9) + ":" + rand.nextInt(59) + " pm";
            
    }

    // adds number of candy to the grand total amount of candy per every house
    public String addNumOfCandy(int currentHouse){

        Random rand = new Random();

        numOfCandy += rand.nextInt(25);

        return "collected " + rand.nextInt(100) + " pieces of candy from " + house.houseAddress(currentHouse) + "\nGrand total : " + numOfCandy;
    }

    // get methods ->
    public String getName(){
        return name;
    }
  
    public String getCostume(){
        return costume;
    }

    public int getNumHouses(){
        return numOfHousesVisited;
    }

    public int getNumOfCandy(){
        return numOfCandy;
    }

    



}
