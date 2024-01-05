package com.metlife.soccer;

public class League_8 {

    public static void main(String[] args) {
        Team[] theTeams = createTeams();
        Game[] theGames = createGames(theTeams);
        Game currGame = theGames[0];
    }
    public static Team[] createTeams(){
        Team Team1 = new Team();
        Team Team2 = new Team();
        Team[] theTeams = {Team1,Team2};
        return theTeams;

    }
    public static Game[] createGames(Team[] theTeams){
        Game theGame = new Game();
        theGame.homeTeam = theTeams[0];
        theGame.awayTeam = theTeams[1];
        Game [] theGames = {theGame};
        return theGames;
    }
}
