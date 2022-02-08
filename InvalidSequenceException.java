/**
 * This method throws an exception
 * 
 * */
public class InvalidSequenceException extends RuntimeException
{
	public InvalidSequenceException()
	{
		super("Have repeating characters and sequence");
	}
}