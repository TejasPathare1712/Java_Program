
public class Bank {
	String bankName;
	String accNo;
	float balance;
	
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getAccNo() {
		return accNo;
	}
	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}
	public float getBalance() {
		return balance;
	}
	public void setBalance(float balance) {
		this.balance = balance;
	}
	public void setData() {
		bankName="Punjab National Bank";
		accNo="3757000100084447";
		balance=5000.5f;
		
	}
	public void ShowData() {
		System.out.println("Bank Name = "+bankName);
		System.out.println("Account No = "+accNo);
		System.out.println("Bank Balance = "+balance);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank b1 = new Bank();
		b1.setData();
		b1.ShowData();

	}

}
