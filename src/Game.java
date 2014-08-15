
public class Game {
	Team home;
	Team away;
	public Game(Team home, Team away) {
		this.home = home;
		this.away = away;
	}
	
	public Team getHome() {
		return home;
	}
	
	public Team getAway() {
		return away;
	}
}
