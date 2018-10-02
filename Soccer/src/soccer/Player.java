package soccer;

public class Player {

	public String playerName;
	
	Player(){
		
	}
	
	Player(String playerName){
		this.playerName = playerName;
		
	}
	
	public String getPlayer() {
		
		return this.playerName;
	}
	
	public void setPlayer(String playerName) {
		this.playerName = playerName;
	}
	
}
