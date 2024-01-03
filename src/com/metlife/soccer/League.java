package com.metlife.soccer;

public class League {
    public static void main(String[] args) {
        Player p1 = new Player();
        p1.PlayerName = "George";
        Player p2 = new Player();
        p2.PlayerName= "Graham";
        Player p3 = new Player();
        p3.PlayerName = "Geoffery";

        Player[] players = {p1,p2,p3};

        Team Team1 = new Team();
        Team1.TeamName = "The GREEEN's";
        Team1.playerArray = players;

        for (Player player : Team1.playerArray){
            System.out.println(player.PlayerName);
        }
        Team team2 = new Team();
        team2.TeamName="The REDD's";
        team2.playerArray = new Player[3];
        team2.playerArray[0]=new Player();
        team2.playerArray[0].PlayerName="Robert";
        team2.playerArray[1]=new Player();
        team2.playerArray[1].PlayerName="Robbie";
        team2.playerArray[2]=new Player();
        team2.playerArray[2].PlayerName="Rafeal";
        for (Player player : team2.playerArray){
            System.out.println(player.PlayerName);
        }

    }
}
