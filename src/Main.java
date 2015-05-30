import static java.lang.System.*;
import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] yolo) throws IOException {
		
		WordList l = new WordList("words");
		List<String> words = l.getWords();
		Unscrambler u = new Unscrambler(words, prompt());
		output(u.getMatches());
	}
	
	public static String prompt() {
		Scanner scan = new Scanner(in);
		out.println("Enter the word you would like unscrambled.");
		return scan.next();
	}
	
	public static void output(List<String> m) {
		out.println("Possible matches include: ");
		for (int i = 0; i < m.size(); i++)
			out.println(m.get(i));
	}

}
