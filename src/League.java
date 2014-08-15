import java.util.*;
public class League {
	public ArrayList<Team> teams;
	public Team[][] divisions;
	
	public League() {
		teams = new ArrayList<Team>();
	}
	
	public void addTeam(Team t) {
		teams.add(t);
	}
    public ArrayList<Game> makePairings() {
        ArrayList<Game> games = new ArrayList<Game>(teams.size() / 2);
        for (int i = 0; i < teams.size() / 2; i++) {
            games.add(new Game(teams.get(i), teams.get(teams.size() - (i + 1))));
        }
        teams.add(teams.remove(1));
        return games;
    }
}
