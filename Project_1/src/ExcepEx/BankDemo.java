package ExcepEx;

class InsufficientFundException extends Exception
{
	private double amount;
	
	public InsufficientFundException(double amount)
	{
		this.amount = amount;
	}
	public double getAmount()
	{
		return amount;
	}
}

class CheckingAccount
{
	private double balance;
	public CheckingAccount()
	{
		
	}
	public void deposit(double amount)
	{
		balance = balance + amount;
	}
	
	public void withdraw(double amount) throws InsufficientFundException
	{
		if(amount <=balance)
		{
			balance = balance = amount;
		}
		else
		{
			double needs = amount - balance;
			throw new InsufficientFundException(needs);
		}
		
	}
	
}

public class BankDemo {
	public static void main(String[] args) {
		CheckingAccount c = new CheckingAccount();
		
		
		c.deposit(500.00);
		
		try {
		System.out.println("Withdrawing Rs.100/-");
		c.withdraw(100.00);
		System.out.println("Withdrawing Rs.600/-");
		c.withdraw(600.00);
		}
		catch(InsufficientFundException ie)
		{
			System.out.println("Sorry, amount required : "+ie.getAmount());
		}
	}
}

/*
[18:05] Tilaka (Guest)
package excep; class InsufficientFundException extends Exception

{​​​​​

    private double amount;

    public InsufficientFundException(double amount)

    {​​​​​

        this.amount=amount;

    }​​​​​

    public double getAmount()

    {​​​​​

        return amount;

    }​​​​​

}​​​​​ class CheckingAccount

{​​​​​

    private double balance;

    public CheckingAccount()

    {​​​​​

    }​​​​​

    public void deposit(double amount)

    {​​​​​

        balance=balance+amount;

    }​​​​​

    public void withdraw(double amount) throws InsufficientFundException

    {​​​​​

        if(amount<=balance)

            balance=balance-amount;

    else

    {​​​​​

        double needs=amount-balance;

        throw new InsufficientFundException(needs);

    }​​​​​

    }​​​​​

}​​​​​ public class BankDemo {​​​​​

    public static void main(String[] args) {​​​​​

        CheckingAccount c=new CheckingAccount();

        c.deposit(500.00);

        try

        {​​​​​

        System.out.println("Withdrawing Rs.100/-");

        c.withdraw(100.00);

        System.out.println("Withdrawing Rs.600/-");

        c.withdraw(600.00);

        }​​​​​

        catch(InsufficientFundException ie)

        {​​​​​

            System.out.println("Sorry amount required : "+ ie.getAmount());

        }​​​​​

    }​​​​​ }​​​​​

*/

//try finally exception too