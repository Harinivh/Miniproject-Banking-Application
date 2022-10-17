package bankingapplication;
import java.util.Scanner;
public class BankAc {
	public static void main(String[] args) {
		BankAc obj = new BankAc();
		obj.showMenu();
	}
 
	int bal, previoustransaction, account;

	void deposit(int amt) {
		if (amt > 0) {
			bal = bal + amt;
			previoustransaction = amt;
		}
	}

	void withdraw(int amt) {
		if (amt > 0) {
			bal = bal - amt;
			previoustransaction = -amt;
		}
	}

	void getprevioustransaction() {
		if (previoustransaction > 0) {
			System.out.println("Deposited:" + previoustransaction);
		} else if (previoustransaction < 0) {
			System.out.println("withdrawn:" + previoustransaction);
		} else {
			System.out.println("No transaction");
		}
	}

	void showMenu() {
		char option = '\0';
		Scanner obj = new Scanner(System.in);

		System.out.println("P.acc no");
		System.out.println("Q.Check Bal");
		System.out.println("R.Deposit");
		System.out.println("S.Withdraw");
		System.out.println("T.previoustransaction");
		System.out.println("U.exit");
		do {
			System.out.println("Enter an option");
			option = obj.next().charAt(0);

			switch (option) {

			case 'P':
				System.out.println("enter your acc no");
				int amt = obj.nextInt();
				break;
			case 'Q':
				System.out.println("bal=" + bal);
				break;
			case 'R':
				System.out.println("Enter an amount to Deposit");
				int amt1 = obj.nextInt();
				deposit(amt1);
				break;
			case 'S':
				System.out.println("Enter an amount to withdraw");
				int amt2 = obj.nextInt();
				withdraw(amt2);
				break;
			case 'T':
				getprevioustransaction();
				break;

			case 'U':
				System.out.println("Exit");
				break;

			default:
				System.out.println("Invalid option");
				break;
			}

		} while (option != 'U');
	}
}
