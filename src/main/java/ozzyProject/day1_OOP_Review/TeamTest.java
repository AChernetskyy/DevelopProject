package ozzyProject.day1_OOP_Review;

import java.util.Arrays;

public class TeamTest {
    public static void main(String[] args) {


        FotballPlayer joe = new FotballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer beckham = new SoccerPlayer("Beckham");

       // Team liverpool = new Team("Liverpool");
        Team<SoccerPlayer> liverpool=new Team<>("Liverpool");


//        liverpool.addPlayer(joe);
//        liverpool.addPlayer(pat);
        liverpool.addPlayer(beckham);

        for (Player p: liverpool.numPlayers()) {
            System.out.println(p.toString());
        }
    }
}
