package PracticeExercises1;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.*;
import java.util.Scanner;

public class MainClassE19_1 
{
	public static void main(String[] args) throws IOException
	{
		final String the = "the";
		
		Scanner in = new Scanner(new File("input.txt"));
	
		List <String> wordList = new ArrayList<>();
		
		while (in.hasNextLine()) 
		{ 
			wordList.add(in.nextLine());
		}
		
		long count = wordList.stream()
				.filter(w -> w.contains(the))
				.count();
							
		System.out.println("Total the words: " + count);
	}

}
