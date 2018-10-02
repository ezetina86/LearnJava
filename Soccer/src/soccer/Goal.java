package soccer;

public class Goal {
	
	public Team theTeam;
	public Player thePlayer;
	public double theTime;
	
	Goal(){
		
	}
	
	Goal(Team theTeam, Player thePlayer, double theTime){
		this.theTeam = theTeam;
		this.thePlayer = thePlayer;
		this.theTime = theTime;
	}
	
	public Team getTeam() {
		return this.theTeam;
	}
	
	public void setTeam(Team theTeam){
		this.theTeam = theTeam;
	}
	
	public Player getPlayer() {
		return this.thePlayer;
	}
	
	public void setPlayer(Player thePlayer){
		this.thePlayer = thePlayer;
	}
	
	public double getTime() {
		return this.theTime;
	}
	
	public void setTime(double theTime){
		this.theTime = theTime;
	}
	
	public void showsGoal() {
		System.out.println("Goal scored after "  + theTime
		+ " mins by " + thePlayer.getPlayer()
		+ " of " + theTeam.getTeamName());
	}

}
