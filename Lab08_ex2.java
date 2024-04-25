
import java.util.ArrayList;
import java.util.List;

class Account{
	//deposit, withdraw,transfermoney,accountlist;
	  private String holder;
	  private int accID;
	  private int accBalance;
	  public String getHolder()
	  {
		  return holder;
	  }
	  public void setHolder(String newHolder)
	  {
		  try {                 
			  this.holder= newHolder;
		  }
		  catch(Exception e)
		  {
			  System.out.println("Invalid name!");
		  }
	  }
	  public int getID()
	  {
		  return accID;
	  }
	  public void setID(int newAccID)
	  { 
		  try {
			  this.accID= newAccID;
			  
		  }catch(Exception e)
		  {
			  System.out.println("Invalid ID");
			  
		  }
		
	  }
	  public int getBalance()
	  {
		  return accBalance;
	  }
	  public void setBalance(int newAccBalance)
	  {
		  try {
		this.accBalance= newAccBalance;
			  
		  }catch(Exception e)
		  {
			  System.out.println("Invalid Balance!");
			  
		  }
	  }
	  
	  
	  
}
class BankManagement{
//create account, transaction
	private List<Account> accounts = new ArrayList<>();  
	
	public void createAccount(String userName)
	{
		System.out.print("Your first name");
		
		
	}

	
}

public class Lab08_ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
