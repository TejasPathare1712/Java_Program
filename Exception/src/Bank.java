
public class Bank {
	int acno;
	String name;
	int balance;
	public int getAcno() {
		return acno;
	}
	public void setAcno(int acno) {
		this.acno = acno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public Bank(int acno, String name, int balance) {
		super();
		this.acno = acno;
		this.name = name;
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "Bank [acno=" + acno + ", name=" + name + ", balance=" + balance + "]";
	}
	public void deposite(int amt) {
		this.balance=this.balance+amt;
	}
	public void withdraw(int amt) {
		
			if(amt>balance) {
				throw new InvalidBalanceException("Balance is not sufficient");
			}
			else {
				System.out.println("Remaining Balance is"+(balance-amt));
			}
		
		
	}

}
