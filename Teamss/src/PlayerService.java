import java.util.*;
public class PlayerService {
	static Team tarr[]=new Team[3];
	static int cnt;
	static {
		 Team tarr[]=new Team[3];
		 cnt=0;
		 
	}
	public static void addNewTeam() {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Team No.");
		int tno=sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter Team name.");
		String tname=sc.nextLine();
		
		System.out.println("Enter Captain no.");
		int pno=sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter Captain name");
		String pname=sc.nextLine();
		
		System.out.println("Enter Captain Skills ");
		String Skills=sc.nextLine();
		
		Player c=new Player(pno,pname,Skills);
		
		//Enter Other Player Details
		Player parr[]=new Player[3];
		
		for(int i=0;i<parr.length;i++) {
			System.out.println("Enter Player no.");
			pno=sc.nextInt();
			sc.nextLine();
		
			System.out.println("Enter Player Name");
			pname=sc.nextLine();
			
			System.out.println("Enter Player Skills");
			Skills=sc.nextLine();
			
			parr[i]=new Player(pno,pname,Skills);
		
		}
		tarr[cnt]=new Team(tno,tname,c,parr);
		cnt++;
	}
	public static void displayAll() {
		for(int i=0;i<cnt;i++) {
			System.out.println(tarr[i]);
		}
	}
}
	
