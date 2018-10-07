package PracticeExercises5;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class MainClassE19_5 
{
	public static void main(String[] args) throws IOException
	{
		
		Scanner in = new Scanner(new File("input.txt"));

		List <String> wordList = new ArrayList<>();

		while (in.hasNext()) 
		{ 
			wordList.add(in.next());
		}
		
		int n = in.nextInt();
		
		System.out.println(toString(wordList.stream(),n));

	}
	@SuppressWarnings("hiding")
	public static <List> String toString(Stream<List> stream, int n)
	{
		return ",";
	}
}
