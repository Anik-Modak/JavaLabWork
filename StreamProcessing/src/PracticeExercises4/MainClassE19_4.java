package PracticeExercises4;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MainClassE19_4 
{
	public static void main(String[] args) throws IOException
	{
		
		Scanner in = new Scanner(new File("input.txt"));

		List <String> wordList = new ArrayList<>();

		while (in.hasNext()) 
		{ 
			wordList.add(in.next());
		}
		
		Collections.sort(wordList);
		
		wordList.stream()
			.filter(w -> w.length()<=4)
			.distinct().forEach(System.out :: println);

	}
}
