
public class Player {
	String playerName;
	String sportPlay;
	
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public String getSportPlay() {
		return sportPlay;
	}
	public void setSportPlay(String sportPlay) {
		this.sportPlay = sportPlay;
	}
	public void setData() {
		playerName="Virat Kohli";
		sportPlay="cricket";
	}
	public void showData() {
		System.out.println("Player Name = "+playerName);
		System.out.println("Sport Play = "+sportPlay);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Player p1 = new Player();
		p1.setData();
		p1.showData();
		p1.setPlayerName("Rameshbabu Praggnanandhaa");
		p1.setSportPlay("Chess");
		System.out.println("Player Name = "+p1.getPlayerName());
		System.out.println("Player sport = "+p1.getSportPlay());

	}

}
