import java.util.*;


public class Main {
	
	public static int divSize;
	public static int numDivs;
	public static League schedule;
	public static League div1;
	public static League div2;
	public static League div3;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		schedule = new League();
		/*
		schedule.addTeam(new Team("Kev"));
		schedule.addTeam(new Team("Kyle"));
		schedule.addTeam(new Team("Ponti"));
		schedule.addTeam(new Team("Eric"));
		schedule.addTeam(new Team("Ryan"));
		schedule.addTeam(new Team("Mike"));
		schedule.addTeam(new Team("Henry"));
		schedule.addTeam(new Team("Gavin"));
		schedule.addTeam(new Team("Ian"));
		schedule.addTeam(new Team("matt"));
		schedule.addTeam(new Team("Corey"));
		schedule.addTeam(new Team("Berger"));*/

		schedule.addTeam(new Team("1"));
		schedule.addTeam(new Team("2"));
		schedule.addTeam(new Team("3"));
		schedule.addTeam(new Team("4"));
		schedule.addTeam(new Team("5"));
		schedule.addTeam(new Team("6"));
		schedule.addTeam(new Team("7"));
		schedule.addTeam(new Team("8"));
		schedule.addTeam(new Team("9"));
		schedule.addTeam(new Team("10"));
		schedule.addTeam(new Team("11"));
		schedule.addTeam(new Team("12"));
		
		div1 = new League();
		div2 = new League();
		div3 = new League();
		numDivs = 3;
		divSize = schedule.teams.size() / numDivs;
		// set up divisions
		div1.teams =  new ArrayList<Team>(schedule.teams.subList(0, divSize));
		div2.teams =  new ArrayList<Team>(schedule.teams.subList(divSize, 2*divSize));
		div3.teams =  new ArrayList<Team>(schedule.teams.subList(2*divSize, schedule.teams.size()));
		
		// loop through all teams
		printMatchups();
		makeDivisionMatchups();
	}
	public static void printMatchups() {
		for (int i = 0; i < schedule.teams.size() - 1; i ++) {
            System.out.println("**** Week " + (i + 1) + " ****\n");
            ArrayList<Game> games = schedule.makePairings();
            for(Game game: games) {
            	System.out.println(game.home.getName() + " v " + game.away.getName());
            }
        }
	}
	public static void makeDivisionMatchups() {
		for (int i = schedule.teams.size() - 1; i < schedule.teams.size() - 1 + divSize - 1 ;i++ ) {
			System.out.println("*** Week " + (i + 1) + "****\n");
			// change the object being looped
			ArrayList<Game> game1 = div1.makePairings();
			ArrayList<Game> game2 = div2.makePairings();
			ArrayList<Game> game3 = div3.makePairings();
			for(Game game: game1) {
				System.out.println(game.away.getName() + " v " + game.home.getName());
			}
			for(Game game: game2) {
				System.out.println(game.away.getName() + " v " + game.home.getName());
			}
			for(Game game: game3) {
				System.out.println(game.away.getName() + " v " + game.home.getName());
			}	
		}
	}

}
