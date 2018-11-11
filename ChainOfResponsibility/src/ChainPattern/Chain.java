package ChainPattern;

public interface Chain 
{
	public void setNextChain(Chain nextChain);
	public int calculate(Numbers requests);
}
