package interfacee;

import java.util.*;

public class BankAccount implements BankAccountSpe {

	private int balance;
	
	public BankAccount() {
		this.balance = 0;
	}
	
	public void deposit(int amount) {
		
		if (amount > 0) {
			balance += amount;
			System.out.println("Vous avez déposez " + amount + "euro" + ((balance < 1)?".":"s."));
			System.out.println("Vous avez maintenant " + balance + "euro"+ ((balance < 1)?"":"s")+" sur votre compte.");
		}
		
		else 
			System.out.println("Vous n'avez rien déposez.");
		
	}
	public boolean withdraw(int amount) {
		
		if (balance - amount >= 0 && amount > 0)
			return true;
		else 
			return false;
		
	}
	
	public static void main (String []args) {
		
		Scanner sc = new Scanner(System.in);
		BankAccount monCompte = new BankAccount();
		
		System.out.println("Combien voulez vous déposer dans votre compte??");
		int depot = sc.nextInt();
		monCompte.deposit(depot);
		
		System.out.println("Combien voulez vous retirer ??");
		int retrait = sc.nextInt();
		boolean peutretirer = monCompte.withdraw(retrait);
		
		if(peutretirer)
			System.out.println("Vous pouvez retirer");
		else
			System.out.println("Il est impossible de retirer");
	}
	
}
