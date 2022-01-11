import java.util.Scanner;
public class trafiicLight {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String light = sc.next();
		switch(light) {
		case "Red": case "red": case "RED":
			System.out.println("STOP");
			break;
		case "Yellow": case "yellow": case "YELLOW":
			System.out.println("WAIT");
			break;
		case "Green": case "green": case "GREEN":
			System.out.println("GO");
		}
	}

}
