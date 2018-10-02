package soccer;

public class Game {
	
	public Team homeTeam;
	public Team awayTeam;
	public Goal[] goals;
	
	Game(){
		
	}
	
	Game (Team homeTeam, Team awayTeam, Goal[] goals){
		this.homeTeam = homeTeam;
		this.awayTeam = awayTeam;
		this.goals = goals;
	}
	
	public Team getHomeTeam() {
		return this.homeTeam;
	}
	
	public void setHomeTeam(Team homeTeam) {
		this.homeTeam = homeTeam;
	}
	
	public Team getAwayTeam() {
		return this.awayTeam;
	}
	
	public void setAway(Team awayTeam) {
		this.awayTeam = awayTeam;
	}
	
	public Goal[]  getGoals() {
		return this.goals;
	}
	
	public void setGoals(Goal[] goals) {
		this.goals = goals;
	}

}
