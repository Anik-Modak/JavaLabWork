package ChainPattern;

public class SubNumbers implements Chain
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
		if(requests.getCalculationWantwd()=="sub")
		{
			return requests.getNumber1()-requests.getNumber2();
		}
		else
		{
			return nextInChain.calculate(requests);
		}

	}
}
