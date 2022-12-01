import model.group;
import model.players;
import model.team;

import java.util.ArrayList;

    public class main {
        public static void main(String[] args) {
            ArrayList<players> playerList=new ArrayList<players>();
            players p1=new players("Neymar",12,31,10);
            players p2=new players("Messi",10,36,9);
            players p3=new players("Ronaldo",10,40,9);
            playerList.add(p1);
            playerList.add(p2);
            playerList.add(p3);
            System.out.println(playerList);

            ArrayList<group> groupList=new ArrayList<group>();
            group g1=new group("Brazil");
            group g2=new group("Argentina");
            group g3=new group("Portugal");
            groupList.add(g1);
            groupList.add(g2);
            groupList.add(g3);
            System.out.println(groupList);

            ArrayList<team> teamList=new ArrayList<team>();
            team t1=new team("Brazil","Yellow","Left Wing");
            team t2=new team("Argentina","Blue","GK");
            team t3=new team("Portugal","White","CM");
            teamList.add(t1);
            teamList.add(t2);
            teamList.add(t3);
            System.out.println(teamList);




        }
    }

