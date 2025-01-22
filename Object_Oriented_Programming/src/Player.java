
public class Player {
	int pid;
	String name;
	String game;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGame() {
		return game;
	}
	public void setGame(String game) {
		this.game = game;
	}
	public Player(int pid, String name, String game) {
		super();
		this.pid = pid;
		this.name = name;
		this.game = game;
	}
	@Override
	public String toString() {
		return "Player [pid=" + pid + ", name=" + name + ", game=" + game + "]";
	}
	@Override
	public boolean equals(Object e1) {
		Player p2 = (Player)e1;
		if(this.pid == p2.pid && this.name.equals(p2)&& this.game.equals(p2)) {
			return true;
		}
		else {
			return false;
		}
	}

}
