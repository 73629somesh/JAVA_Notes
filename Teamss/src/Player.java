
public class Player {
	
	private int pno;
	private String pname;
	private String skills;
	public Player() {
		super();
	}
	public Player(int pno,String pname,String skills) {
		this.pno=pno;
		this.pname=pname;
		this.skills=skills;
	}
	
	
int getPno() {
	return pno;
}
String getPname() {
	return pname;
}
String getSkills() {
	return skills;
}

@Override
public String toString() {
	return "Player [pno=" + pno + ", pname=" + pname + ", skills=" + skills + "]";
}}
