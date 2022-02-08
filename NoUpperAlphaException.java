
public class NoUpperAlphaException extends RuntimeException
{
	public NoUpperAlphaException()
	{
		super("No uppercase characters in your password");
	}
}
