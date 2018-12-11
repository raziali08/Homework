package constructors;

public class TeamTest {

    public static void main(String[] args) {

        Team Barcelona = new Team("Saji");

        Team USA = new Team ( "Riz" );

        Team Egypt = new Team("Bob", 7 );

        Barcelona.position();
        Barcelona.tastk();
        Barcelona.getPlayerName();
        Barcelona.getPlayerNumber();
    }

}
