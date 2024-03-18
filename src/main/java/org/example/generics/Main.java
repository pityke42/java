package org.example.generics;
interface Player{
    String name();
}
record BaseballPlayer(String name, String position) implements Player{}
record FootballPlayer(String name, String position) implements Player{}
record ValleyballPlayer(String name, String position) implements Player{}

public class Main {
    public static void main(String[] args) {





        BaseballTeam irsa1 = new BaseballTeam("albertirsai vadallatok");
        BaseballTeam astros1 = new BaseballTeam("Huston Astros");

         scoreResult(irsa1, 3, astros1, 5);

        SportsTeam irsa2 = new SportsTeam("albertirsai vadallatok");
        SportsTeam astros2 = new SportsTeam("Huston Astros");

        scoreResult(irsa2, 3, astros2, 5);


         var harper = new BaseballPlayer("B Harper", "Right Fielder");
         var marsh = new BaseballPlayer("B Marsh", "Right Fielder");
         irsa1.addTeamMember(harper);
         irsa1.addTeamMember(marsh);
        irsa1.listTeamMembers();

        SportsTeam afc = new SportsTeam("Adeliade Crows");
        var tex = new FootballPlayer("Tex Walker", "Centre half forward");
        afc.addTeamMember(tex);
        afc.listTeamMembers();

        Team<BaseballPlayer, Affiliation> irsa3 = new Team<>("albertirsai vadallatok");
        Team<BaseballPlayer, Affiliation> astros3 = new Team<>("Huston Astros");
        scoreResult(irsa3, 10, astros3, 11);

        Team<ValleyballPlayer, Affiliation> adelaide = new Team<>("Adelaide Storm");
        adelaide.addTeamMember(new ValleyballPlayer("N Roberts", "Setter"));
        adelaide.listTeamMembers();

        var canberra = new Team<ValleyballPlayer, Affiliation>("Canberra Heat");
        canberra.addTeamMember(new ValleyballPlayer("B Black", "Opposite"));
        canberra.listTeamMembers();
        scoreResult(canberra, 0, adelaide, 1);

//        Team<Integer> melburneVB = new Team<>("Melburne Vipers");
        var philly = new Affiliation("city", "Philadelhia, PA", "US");
        Team<BaseballPlayer, Affiliation> phillies = new Team<>("Philadelphia Phillies", philly);
        Team<BaseballPlayer, Affiliation> astros = new Team<>("Huston Astros");
        scoreResult(phillies, 3, astros, 5);

        
        

    }
    public static void scoreResult(BaseballTeam team1, int t1Score,
                                   BaseballTeam team2, int t2Score){
        String message = team1.setScore(t1Score, t2Score);
        team2.setScore(t2Score, t1Score);
        System.out.printf("%s %s %s %n", team1, message, team2);
    }
    public static void scoreResult(SportsTeam team1, int t1Score,
                                   SportsTeam team2, int t2Score){
        String message = team1.setScore(t1Score, t2Score);
        team2.setScore(t2Score, t1Score);
        System.out.printf("%s %s %s %n", team1, message, team2);
    }
    public static void scoreResult(Team team1, int t1Score,
                                   Team team2, int t2Score){
        String message = team1.setScore(t1Score, t2Score);
        team2.setScore(t2Score, t1Score);
        System.out.printf("%s %s %s %n", team1, message, team2);
    }
}
