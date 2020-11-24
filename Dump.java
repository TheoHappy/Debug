
public class Dump {
	
	public Dump(String str) {
		System.out.println("New line at " + findNewLine(str));
	}
		
	private int findNewLine(String str) {
		int i = 0;
		char aChar;
//		char aChar;

		do {
			aChar = str.charAt(i);
			i++;
		} while(aChar != '\n');
		
		return i;
	}

	public static void main(String[] args) throws Exception {
		new Dump("Hello World!\nHowz goin?!");
	}

}
