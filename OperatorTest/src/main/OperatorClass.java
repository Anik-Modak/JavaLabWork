package main;

public class OperatorClass
{

	public int addition(int i, int j)
	{
		// TODO Auto-generated method stub
		return i+j;
	}

	public int multiply(int i, int j)
	{
		// TODO Auto-generated method stub
		return i*j;
	}

	public int division(int i, int j)
	{
		// TODO Auto-generated method stub
		return i/j;
	}

	public int subtraction(int i, int j) 
	{
		// TODO Auto-generated method stub
		return i-j;
	}

	public double d_division(double i, double j)
	{
		// TODO Auto-generated method stub
		return i/j;
	}

	public boolean equals(int i, int j) 
	{
		// TODO Auto-generated method stub
		return i == j? true:false;
	}

	public int leftshift(int i, int j) 
	{
		// TODO Auto-generated method stub
		return i<<j;
	}

	public int rightshift(int i, int j)
	{
		// TODO Auto-generated method stub
		return i>>j;
	}

	public int xor(int i, int j) {
		// TODO Auto-generated method stub
		return i^j;
	}

	public int or(int i, int j) {
		// TODO Auto-generated method stub
		return 7|2;
	}

	public int and(int i, int j) {
		// TODO Auto-generated method stub
		return 7&2;
	}

	public int not(int i) {
		// TODO Auto-generated method stub
		return ~i;
	}

}
