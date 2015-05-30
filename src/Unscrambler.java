import java.util.*;

public class Unscrambler {
	
	private List<String> words;
	private String key;
	private List<String> matches;
	
	public Unscrambler(List<String> words, String key) {
		this.words = words;
		this.key = key;
		this.matches = unscramble(words, key);
	}
	
	public List<String> unscramble(List<String> words, String key) {
		List<String> m = new ArrayList<String>();
		lengthMatch(words, key);
		int[] keyChars = getChars(key);
		for (int i = 0; i < words.size(); i++)
			if (compare(getChars(words.get(i)), keyChars))
				m.add(words.get(i));
		return m;
	}
	
	public void lengthMatch(List<String> words, String key) {
		String s = "";
		List<String> sameSize = new ArrayList<String>();	  	//eliminates words that aren't the same
		for (int i = 0; i < words.size(); i++)					//length as the key
			if (words.get(i).length() == key.length())
				sameSize.add(words.get(i));
		words.retainAll(sameSize);
	}
	
	public static int[] getChars(String word) {
		word = word.toLowerCase();
		int[] chars = new int[26];								//breaks a word down into each
		for (int i = 0; i < word.length(); i++)					//individual character
			chars[(int)word.charAt(i)-97]++;
		return chars;
	}
	
	public static boolean compare(int[] x, int[] y) {
		if (x.length != y.length) {
			System.out.println("Error (compare): arrays not standard size[26].");
			return false;
		} else {
			for (int i = 0; i < x.length; i++)
				if (x[i] != y[i])								//compares 2 arrays; very slow
					return false;								//there has to be a faster way??
		}
		return true;
	}
	
	public List<String> getMatches() {
		return matches;
	}

}
