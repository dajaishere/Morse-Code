import java.util.Scanner;
import java.util.StringTokenizer;


public class Main{

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		StringTokenizer st = new StringTokenizer(input, " ");
		String sb = "";
		while(st.hasMoreTokens()) {
			String currToken = st.nextToken();
			sb += convertToMorse(currToken) + " ";
		}
		System.out.println(sb);
	}
	
	
	public static String convertToMorse(String input) {
		String result = "";
		if(input.length() == 1) {
			result = getMorseCode(input.toLowerCase().charAt(0));
		} else {
			for(Character c : input.toCharArray()) {
				result += getMorseCode(c.toLowerCase(c));
			}
		}
		return result;
	}
	
	
	public static String getMorseCode(Character character) {
		String result = null;
		switch(character) {
		case 'a' : result = ".-";
		break;
		case 'b' : result = "-...";
		break;
		case 'c' : result = "-.-.";
		break;
		case 'd' : result = "-..";
		break;
		case 'e' : result = ".";
		break;
		case 'f' : result = "..-.";
		break;
		case 'g' : result = "--.";
		break;
		case 'h' : result = "....";
		break;
		case 'i' : result = "..";
		break;
		case 'j' : result = ".---";
		break;
		case 'k' : result = "-.-";
		break;
		case 'l' : result = ".-..";
		break;
		case 'm' : result = "--";
		break;
		case 'n' : result = "-.";
		break;
		case 'o' : result = "---";
		break;
		case 'p' : result = ".--.";
		break;
		case 'q' : result = "--.-";
		break;
		case 'r' : result = ".-.";
		break;
		case 's' : result = "...";
		break;
		case 't' : result = "-";
		break;
		case 'u' : result = "..-";
		break;
		case 'v' : result = "...-";
		break;
		case 'w' : result = ".--";
		break;
		case 'x' : result = "-..-";
		break;
		case 'y' : result = "-.--";
		break;
		case 'z' : result = "--..";
		break;
		case '0' : result = "-----";
		break;
		case '1' : result = ".----";
		break;
		case '2' : result = "..---";
		break;
		case '3' : result = "...--";
		break;
		case '4' : result = "....-";
		break;
		case '5' : result = ".....";
		break;
		case '6' : result = "-....";
		break;
		case '7' : result = "--...";
		break;
		case '8' : result = "---..";
		break;
		case '9' : result = "----.";
		break;
		}
		return result;
	}
}