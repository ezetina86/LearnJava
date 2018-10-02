package soccer;

public class League {
	
	public static  void main(String[] args) {
		/*
		 * 
        ______          _            _   _        _                                 
		|  ___|        | |          | | (_)      | |                                
		| |_ __ _ _ __ | |_ __ _ ___| |_ _  ___  | |     ___  __ _  __ _ _   _  ___ 
		|  _/ _` | '_ \| __/ _` / __| __| |/ __| | |    / _ \/ _` |/ _` | | | |/ _ \
		| || (_| | | | | || (_| \__ \ |_| | (__  | |___|  __/ (_| | (_| | |_| |  __/
		\_| \__,_|_| |_|\__\__,_|___/\__|_|\___| \_____/\___|\__,_|\__, |\__,_|\___|
		                                                            __/ |           
	                                                               |___/            

		 */
		
		Player player1 = new Player();
		Player player2 = new Player();
		Player player3 = new Player();
		Player player4 = new Player();
		Player player5 = new Player();
		Player player6 = new Player();
		Player player7 = new Player();
		
		player1.setPlayer("Alberto Aguilar");
		player2.setPlayer("Bernabe Bautista");
		player3.setPlayer("Carlos Carrazco");
		player4.setPlayer("David Dominguez");
		player5.setPlayer("Enrique Enriquez");
		player6.setPlayer("Fernando Fernandez");
		player7.setPlayer("Gerardo Gonzalez");
		
		Player player8  = new Player();
		Player player9  = new Player();
		Player player10 = new Player();
		Player player11 = new Player();
		Player player12 = new Player();
		Player player13 = new Player();
		Player player14 = new Player();
		
		player8.setPlayer("Arturo Arzate");
		player9.setPlayer("Benito Bustamante");
		player10.setPlayer("Carmelo Castañeda");
		player11.setPlayer("Daniel Duarte");
		player12.setPlayer("Ezequiel Estrada");
		player13.setPlayer("Felipe Farfan");
		player14.setPlayer("Gustavo Gutierrez");
		
		Player[] thePlayers1 = {player1, player2, player3, player4 , player5 , player6 , player7};
		Player[] thePlayers2 = {player8, player9, player10, player11 , player12 , player13 , player14};
		
		Team team1 = new Team();
		Team team2 = new Team();
		
		team1.setPlayerArray(thePlayers1);
		team2.setPlayerArray(thePlayers2);
		
		team1.setTeamName("Alces FC");
		team2.setTeamName("Ballenas FC");
		
		
		System.out.println("\n Players of " + team1.getTeamName() + ": \n");
		for(Player thePlayer: team1.playerArray) {
			System.out.println(thePlayer.playerName);
		}
		
		System.out.println("\n Players of " + team2.getTeamName() + ": \n");
		for(Player thePlayer: team2.playerArray) {
			System.out.println(thePlayer.playerName);
		}
		
		Game currGame = new Game();
		currGame.setHomeTeam(team1);
		currGame.setAway(team2);
		
		Goal goal1 = new Goal();
		goal1.setPlayer(currGame.homeTeam.playerArray[3]);
		goal1.setTeam(team2);
		goal1.setTime(55);
		
		Goal[] theGoals = {goal1};
		currGame.setGoals(theGoals);
		
		
		System.out.println("\n");
		goal1.showsGoal();
		
		
	}

}
