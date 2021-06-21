package application;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordCounts {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub(
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
	
		Scanner txtFile = new Scanner(new File ("C:\\Users\\MALew\\Desktop\\Module2\\assignmentmodule2\\The Project Gutenberg eBook of The Raven, by Edgar Allan Poe.txt"));
		
		while (txtFile.hasNext()) {
			String word = txtFile.next();
			if (map.containsKey(word)){
				int count = map.get(word) + 1;
				map.put(word, count);
			}
			else {
				map.put(word, 1);
			}
		}
		txtFile.close();
		
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			System.out.println(entry);
		}
	}
	

}
