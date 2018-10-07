package PracticeExercises2;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainClassE19_2 
{
	public static void main(String[] args) throws IOException
	{
		final String the = "the";
		
		Scanner in = new Scanner(new File("input.txt"));
	
		List <String> wordList = new ArrayList<>();
		
		while (in.hasNext()) 
		{ 
			wordList.add(in.next());
		}
		
		long count = wordList.stream()
				.filter(w -> w.equals(the))
				.count();
		
		System.out.println("Total'the' words are: " + count);
	}
}
