import java.util.*;
public class Team {
	private int tno;
	private String tname;
	private Player Captain;
	private Player[]plist;
 
	public Team(){
		super();
	}
	public Team(int tno,String tname,Player captain,Player[]plist) {
		this.tno=tno;
		this.tname=tname;
		this.Captain=captain;
		this.plist=plist;
	
	}
	public String toString() {
		return "Team no,:"+tno+" Team name: "+tname+"captain:"+Captain+"Plist:"+Arrays.toString(plist);
		
	}
}
