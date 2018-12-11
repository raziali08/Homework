package constructors;

public class Team {

    String playerName;
    int playerNumber;

//constructor 1
    //specifier classname (){}

    public Team() {
        System.out.println("no player added)");
    }

    //constructor 2

    public Team(String PlayerName) {

        this.playerName = playerName;

        System.out.println("the player name is : " + PlayerName);
    }

    //constructor 3

    public Team(String playerName, int playerNumber) {
        this.playerName = playerName;
        this.playerNumber = playerNumber;

        System.out.println("Player name is : " + playerName + " and player number is : " + playerNumber);


    }

    //Methods
    //Specifier Methodtype Methodname (){}

    public void position() {

        System.out.println("Golie");
    }

    public void tastk() {
        System.out.println("Score Goals");
    }

    //Return Method

    public String getPlayerName() {
        System.out.println("player Name is :" + playerName);
        return playerName;
    }

    public int getPlayerNumber() {
        System.out.println("player Number is :" + playerName);
        return playerNumber;
    }

}


