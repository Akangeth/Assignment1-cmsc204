import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;	


/**
 * This class checks many methods wether the password given is a correct password or has faults
 *
 * 
 * 
 */
public class PasswordCheckerUtility extends Object {

	
	
	/**
	 * STUDENT tests for the methods of PasswordChecker
	 * @author Allan Kangethe
	 *
	 */
	
	
	
	/**
	 * Checks two passwords are the same, if not, throws exception
	 * 
	 * @param password is a password 
	 * @param passwordConfirm is the confirm password
	 * @throws UnmatchedException Throws exception when passwords do not match
	 */
	public static void comparePasswords(String password, String passwordConfirm) throws UnmatchedException
	{
		
			if(!password.equals(passwordConfirm)) //checks if password and passwordConfirm match
			{
				throw new UnmatchedException(); // throws exception
			}
	}
	
	
	/**
	 * Check if the two passwords are the same and returns
	 * 
	 * @param password is the password
	 * @param passwordConfirm is the password confirm
	 * @return true if the two passwords are the same
	 */
	 public static boolean comparePasswordsWithReturn(String password, String passwordConfirm)
	{
		 boolean result = false; //initally false
		 
		 if(password.equals(passwordConfirm)) // Checks if passwords match
		 {
			 result = true; // true if they both equal
			
		 }
		 return result; //return result
	}
	 
	 /**
		 * Method checks if password is between 6 and 9 characters
		 * 
		 * @param password is the password
		 * @return true if password is between 6-9 characters
		 * 
		 */
	 public static boolean hasBetweenSixAndNineChars(String password)
	 {
		 boolean result = false;
		 
		 if(password.length() >= 6 && password.length() <= 9)
		 {
			 result = true;  //true if number is between 6-9
		 }
		 
		 return result; 
	 }
	 
	 
	 /**
		 * Checks if there is at least one numerical digit
		 * 
		 * @param password is the password
		 * @return true if there at least one numerical digit
		 * @throws NoDigitException throws exception when no digit is in password
		 */
	 public static boolean hasDigit(String password) throws NoDigitException

	 {
		 boolean found = false;
		 
		 for(int i = 0; i < password.length(); i++)
		 {	 
			 char passwordIndex = password.charAt(i); //gets char at every string index

			 
			 found = Character.isDigit(passwordIndex); //checks if it is a digit
			 
			 if(found)
				{
					return found; //return if it is a digit
				}
		 }
		 
		 if(found == false)
		 {
			 throw new NoDigitException(); //throws exception
		 }
		 
		 return found; 
	 }
	 
	 
	 /**
		 * Checks if the password has at least one lower case character
		 * 
		 * @param password is the password
		 * @return true if there is at least one lower case letter
		 * @throws NoLowerAlphaException throws exception when no lower case letter is in password
		 */
	 public static boolean hasLowerAlpha(String password) throws NoLowerAlphaException
	 {
		 boolean found = false; //initially false
		 
		 for(int i = 0; i < password.length(); i++) //goes through every string index
		 {	 
			 char passwordIndex = password.charAt(i); //gets char value at every string index
				
				found = Character.isLowerCase(passwordIndex);
				
				if(found) //if finds a lower case letter
				{
					return found;
				}
			 
		 }
		 
		 if(found == false)
		 {
			 throw new NoLowerAlphaException();
		 }
		 
		 return found; //return false
	 }
	 
	 
	 /**
		 * Checks if password has at least one upper case letter
		 * 
		 * @param password is the password
		 * @return true if there at least one upper case letter in the password
		 * @throws NoUpperAlphaException throws exception when there is no upper case letter in password
		 */
	 public static boolean hasUpperAlpha(String password) throws NoUpperAlphaException
	 {
		 
		 boolean found = false;
		 
		 for(int i = 0; i < password.length(); i++) //goes through every password index
		 {	 
			
				char passwordIndex = password.charAt(i);
				
				found = Character.isUpperCase(passwordIndex);
				
				if(found)
				{
					return found; //return if true
				}
			 			 
		 }
		 
		 if(found == false)
		 {
			 throw new NoUpperAlphaException(); //throws exception
		 }
		 
		 return found;
	 }
	 

	 /**
		 * Checks if there is at least one special character
		 * 
		 * @param password is the password
		 * @return true if there is at least one special character
		 * @throws NoSpecialCharacterException throws exception when there is no special character in exception
		 */
	 public static boolean hasSpecialChar(String password) throws NoSpecialCharacterException 
	 {
		
		 
		 Pattern chechPattern = Pattern.compile("\\W");
			for (int i = 0; i < password.length(); i++) {
				Matcher checkMatcher = chechPattern.matcher(Character.toString(password.charAt(i)));
				if (checkMatcher.matches()) //return true if matches
					return true;
			}
			throw new NoSpecialCharacterException(); //throws exception
		
		}
		 
	 

	 /**
		 * Check if password is over 6 characters
		 * 
		 * @param password is the password
		 * @return true if password has 6 or more characters
		 * @throws LengthException throws exception when password is not longer than 6 or more characters
		 */
	 public static boolean isValidLength(String password) throws LengthException
	 {
		 boolean result = false;
		 
		 if(password.length() >= 6)
		 {
			result = true; //true if greater than 6 characters
		 }
		 else
		 {
			 
			 throw new LengthException(); //throw exception
		 }


		 return result;
	 }
	 
	 
	 /**
		 * Methods checks to see if password is between 6 and 9. As long as it is less than 10, and >= 6, it is OK.
		 * 
		 * @param password is the password
		 * @return true if the password has 6-9 characters.
		 * @throws WeakPasswordException throws exception when the password is between 6 - 9 characters
		 */
	 public static boolean isWeakPassword(String password) throws WeakPasswordException 
	 {
		 if(password.length() >= 6 && password.length() <= 9) //checks if string password is between 6-9 
			 												  // characters
		 {
			 throw new WeakPasswordException(); //throws exception
			
		 }
		 return false;
		
	 }
	 
	 
	 /**
		 * Check if there are 2 characters that are repeated one after the other
		 * 
		 * @param password is the password
		 * @return true if there are 2 characters that are repeated one after the other
		 * @throws InvalidSequenceException throws exception when more than 2 characters are repeated
		 */
	 public static boolean NoSameCharInSequence(String password) throws InvalidSequenceException
	 {
		 //for loop checks every char index in string
		 for (int i = 0; i < password.length(); i++) {
			 
			 //try to handle the exception
				try {
					if (password.charAt(i) == password.charAt(i + 1) 
							&& password.charAt(i) == password.charAt(i + 2))
					{
						throw new InvalidSequenceException(); //throw exception
					}
				} 
				catch (IndexOutOfBoundsException e)
				{
					break; //break
				}
			}
			return true; // return true if no exception is thrown
		}
		 
	 
	 
	 /**
		 * Checks 6 methods to determine whether password is valid
		 * 
		 * @param password is the password
		 * @return true if password is a valid password
		 * @throws LengthException throws exception if password is less than 6 characters
		 * @throws NoUpperAlphaException throws exception if upper case character is not present
		 * @throws NoDigitException throws exception if digit is not present
		 * @throws NoLowerAlphaException throws exception if lower case character is not present
		 * @throws InvalidSequenceException throws exception when more than 2 characters are repeated
		 * @throws NoSpecialCharacterException throws exception if no special characters are present
		 */
	 public static boolean isValidPassword(String password) throws LengthException, NoUpperAlphaException,
	 					NoLowerAlphaException, NoDigitException, InvalidSequenceException, NoSpecialCharacterException
	 {
		 
		 boolean result = false;
		
		 
		 //checks all methods for exceptions
		 boolean isValidLength = isValidLength(password);
		 if(isValidLength == false)
		 {
			 throw new LengthException();
		 }
		 boolean hasUpperAlpha = hasUpperAlpha(password);
		 if(hasUpperAlpha == false)
		 {
			 throw new NoUpperAlphaException();
		 }
		 
		 boolean hasDigit =  hasDigit(password);
		 if(hasDigit == false)
		 {
			 throw new NoDigitException();
		 }
		 
		 boolean NoSameCharInSequence = NoSameCharInSequence(password);
		 if(NoSameCharInSequence == false)
		 {
			 throw new InvalidSequenceException();
		 }
		 

		 boolean hasLowerAlpha = hasLowerAlpha(password);
		 if(hasLowerAlpha == false)
		 {
			 throw new NoLowerAlphaException();
		 }

		 boolean hasSpecialChar = hasSpecialChar(password);
		 if(hasSpecialChar == false)
		 {
			 throw new NoSpecialCharacterException();

		 }
		 
		 
		 //checks if all booleans are true
		 if((isValidLength == true) && (hasDigit == true) && (hasUpperAlpha == true)
				 && (hasLowerAlpha == true) && (hasSpecialChar == true) && (NoSameCharInSequence == true))
		 {
			 result = true; //valid is true
		 }
		 
		 if(result == false)
		 {
			 
			 throw new InvalidSequenceException(); //throws exception
		 }

		 return result;
		 
	 }
	 
	 /**
		 * Puts all attempted passwords into an array list and returns
		 * 
		 * @param passwords are the passwords
		 * @return an array list of all invalid password attempts
		 */
		public static ArrayList<String> getInvalidPasswords(ArrayList<String> passwordsArray) throws InvalidSequenceException {
			
			
			//puts passwords into array list
			ArrayList<String> inValidPasswords = new ArrayList<>();
			for (int i = 0; i < passwordsArray.size(); i++)
				try {
					isValidPassword(passwordsArray.get(i));
				} catch (Exception e) {
					inValidPasswords.add(passwordsArray.get(i) + " -> " + e.getMessage());
				}
			return inValidPasswords;

		}
	 
	 
	
	
	
	
}
