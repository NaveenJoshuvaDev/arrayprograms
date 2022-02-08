package arrayPrograms;
import java.util.regex.*;
public class PwdException extends Exception {
	

	public  void getPassword(String password) throws PwdException {
		// TODO Auto-generated method stub
		String regex = "^(?=.*[0-9])"
                + "(?=.*[a-z])(?=.*[A-Z])"
                + "(?=.*[@#$%^&+=])"
                + "(?=\\S+$).{8,20}$";
		if(password==regex)
		{
			System.out.println("correct");
		}
		else
	{
		PwdException p =new PwdException();
		throw p;
	}

}
	}



