package soccer;

public class Team {
	
	public String teamName;
	public Player[] playerArray;
	
	Team(){
		
	}
	
	Team(String teamName, Player[] playerArray){
		this.teamName = teamName;
		this.playerArray = playerArray;
	}
	
	public String getTeamName() {
		return this.teamName;
	}
	
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	
	public Player[] getPlayerArray() {
		return this.playerArray;
	}
	
	public void setPlayerArray(Player[]  playerArray) {
		this.playerArray = playerArray;
	}

}
