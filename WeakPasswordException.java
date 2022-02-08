public class WeakPasswordException extends RuntimeException
{
	public WeakPasswordException()
	{
		super("This password is weak");
	}
}
