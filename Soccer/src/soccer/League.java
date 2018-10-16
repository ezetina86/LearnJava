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
		player10.setPlayer("Carmelo Canales");
		player11.setPlayer("Daniel Duarte");
		player12.setPlayer("Ezequiel Estrada");
		player13.setPlayer("Felipe Farfan");
		player14.setPlayer("Gustavo Gutierrez");
		
		Player[] thePlayers1 = {player1, player2, player3, player4 , player5 , player6 , player7};
		Player[] thePlayers2 = {player8, player9, player10, player11 , player12 , player13 , player14};
		
		Team[] theTeams = createTeams();
		
		Game[] theGames = createGames(theTeams);
		
		Goal goal1 = new Goal();
		goal1.setPlayer(player1);
		goal1.setTeam(theTeams[0]); 
		goal1.setTime(55);
		
		Goal[] theGoals = {goal1};
		
		System.out.println("Goal scored after "+
		goal1.getTime() + " mins by " + goal1.getPlayer().playerName + " of " + goal1.getTeam().teamName);

		
	} 

			
		public static Team[] createTeams() {
			
			Team team1 = new Team();
			Team team2 = new Team();
			
			team1.setTeamName("Alces");
			team2.setTeamName("Burros");
			
			Team[] theTeams = {team1,team2};
			
			return theTeams;
			
		}
		
		public static Game[] createGames(Team[] theTeams) {
		
			Game theGame = new Game();
			
			theGame.homeTeam=theTeams[0];
			theGame.homeTeam=theTeams[1];
			
			Game[] theGames = {theGame};
			return theGames;
	}

	
}