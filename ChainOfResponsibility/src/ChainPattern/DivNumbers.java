package ChainPattern;

public class DivNumbers implements Chain
{
	private Chain nextInChain;

	@Override
	public void setNextChain(Chain nextChain)
	{
		this.nextInChain = nextChain;

	}

	@Override
	public int calculate(Numbers requests)
	{
		if(requests.getCalculationWantwd()=="div")
		{
			return requests.getNumber1()/requests.getNumber2();
		}
		else
		{
			System.out.println("Error? this program calculation only additon, subtraction, multiplication and division");
			return -1;
		}

	}
}
