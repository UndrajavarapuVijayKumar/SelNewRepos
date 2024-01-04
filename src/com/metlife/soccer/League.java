package com.metlife.soccer;

public class League {
    public static void main(String[] args) {
        Player p1 = new Player();
        p1.PlayerName = "George Eliot";
        p1.score = 12;
        Player p2 = new Player();
        p2.PlayerName= "Graham Green";
        p2.score = 14;
        Player p3 = new Player();
        p3.PlayerName = "Geoffery Chaucer";
        p3.score = 15;
        Player[] players = {p1,p2,p3};  //Array Of Objects

        Team Team1 = new Team();
        Team1.TeamName = "The GREEEN's";
        Team1.playerArray = players;    //Values from players  to playerArray

       /* for (Player player : Team1.playerArray){
            System.out.println(player.PlayerName + " ->Scores -> " + player.score);
        }*/
        Team team2 = new Team();
        team2.TeamName="The REDD's";
        team2.playerArray = new Player[3];
        team2.playerArray[0]=new Player();
        team2.playerArray[0].PlayerName="Robert Service";
        team2.playerArray[1]=new Player();
        team2.playerArray[1].PlayerName="Robbie Burns";
        team2.playerArray[2]=new Player();
        team2.playerArray[2].PlayerName="Rafeal Sabatini";
        /*for (Player player : team2.playerArray){
            System.out.println(player.PlayerName);
        }*/
        Game currGame = new Game();
        currGame.homeTeam = team2;
        currGame.awayTeam = Team1;

        Goal goal1 = new Goal();
        goal1.thePlayer=currGame.homeTeam.playerArray[2];
        goal1.theTeam = currGame.homeTeam;
        goal1.theTime = 22;

        Goal goal2 = new Goal();
        goal2.thePlayer = currGame.awayTeam.playerArray[1];
        goal2.theTeam = currGame.awayTeam;
        goal2.theTime = 33;

        Goal[] theGoals = {goal1,goal2};
        currGame.goals = theGoals;

        System.out.println("Goals scored after: " + currGame.goals[0].theTime +
                            " minutes by " + currGame.goals[0].thePlayer.PlayerName +
                            " of the team " + currGame.goals[0].theTeam.TeamName);
        System.out.println("Goals scored after: "+ currGame.goals[1].theTime+
                            " minutes by " + currGame.goals[1].thePlayer.PlayerName +
                            " of the team " + currGame.goals[1].theTeam.TeamName);

    }
}
