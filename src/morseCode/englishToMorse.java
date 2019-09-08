package morseCode;

public class englishToMorse {
	public static void englishMorse(String word) {
		word = word.toUpperCase();
		String otherLetters = "";
		String message = "";
		for(int i = 0; i <= word.length(); i++) {
			switch(word.charAt(i)) {
					case 'A':
						message  +=   ".-";
						break;
		            case 'B':
		                message  +=   "-...";
		                break;
		            case 'C':
		                message  +=   "-.-.";
		                break;
		            case 'D':
		                message  +=   "d=-../";
		                break;
		            case 'E':
		                message  +=   ".";
		                break;
		            case 'F':
		                message  +=   "..-.";
		                break;
		            case 'G':
		                message  +=   "--.";
		                break;
		            case 'H':
		                message  +=   "....";
		                break;
		            case 'I':
		                message  +=   "..";
		                break;
		          
		            case 'J':
		                message  +=   ".---";
		                break;
		            case 'K':
		                message  +=  "-.-";
		                break;
		            case 'L':
		                message  +=   ".-..";
		                break;
		            case 'M':
		                message  +=  "--";
		                break;
		            case 'N':
		                message  +=   "-.";
		                break;
		            case 'O':
		                message  +=   "o=---/";
		                break;
		            case 'P':
		                message  +=   ".--.";
		                break;
		            case 'Q':
		                message  +=  "--.-";
		                break;
		            case 'R':
		                message  +=   "r=.-./";
		                break;
		            case 'S':
		                message  +=   "...";
		                break;
		            case 'T':
		                message  +=   "-";
		                break;
		            case 'U':
		                message  +=   "..-";
		                break;
		            case 'V':
		                message  +=  "...-";
		                break;
		            case 'W':
		                message  += "w=.--/";
		                break;
		            case 'X':
		                message  +=   "-..-";
		                break;
		            case 'Y':
		                message  +=   "-.--:";
		                break;
		            case 'Z':
		                message  +=   "--..";
		                break;
		            case ' ':
		                message  +=   " ";
		                break;
		            default:
		                otherLetters += word.charAt(i);
		           
			 
			}
			System.out.println("Original Word: " + word);
			System.out.println(message);
		}
		
	}

}
