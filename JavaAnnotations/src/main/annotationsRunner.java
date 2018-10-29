package main;

import java.io.*;
import java.util.Scanner;

/**
 * <h2><i> Calculator </i></h2>
 * This program implements an calculator that 
 * simply we addition, multiplication,subtraction and division two given number and prints
 * <p> <b> Note: </b> This program is user friendly.
 * 
 * @author Anik_Modak
 * @since 29-10-2018
 */

public class annotationsRunner 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		annotations obj = new annotations();
		
		int num1 = input.nextInt();
		int num2= input.nextInt();
		
		System.out.println(obj.addition(num1, num2));
		System.out.println(obj.subtraction(num1, num2));
		System.out.println(obj.multiplication(num1, num2));
		System.out.println(obj.Division(num1, num2));

	}

}
