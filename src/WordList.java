import java.io.*;
import java.util.*;

public class WordList {
	
	private List<String> words;
	private String fileName;
	
	public WordList(String fileName) throws IOException {
		this.fileName = fileName;
		words = fill(fileName);
	}
	
	private List<String> fill() throws IOException {
		List<String> l = new ArrayList<String>();
		Scanner scan = new Scanner(new File(getFileName()));
		while (scan.hasNext())
			l.add(scan.next());
		return l;
	}
	
	public List<String> getWords() {
		return words;
	}

	public String getFileName() {
		return fileName;
	}

}
