package PracticeExercises3;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainClassE19_3 
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
		
		wordList.stream()
			.filter(w -> w.contains(the))
			.forEach(System.out :: println);
		
	}
}
