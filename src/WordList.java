import java.io.*;
import java.util.*;

public class WordList {
	
	private List<String> words;
	private String fileName;
	
	public WordList(String fileName) throws IOException {
		this.fileName = fileName;
		words = fill(fileName);
	}
	
	public List<String> fill(String s) throws IOException {
		List<String> l = new ArrayList<String>();
		Scanner scan = new Scanner(new File(s));
		while (scan.hasNext())
			l.add(scan.next());
		return l;
	}
	
	public List<String> getWords() {
		return words;
	}

}
