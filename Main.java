package com.rbi.Admin;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

import com.rbi.Model.Account;
import com.rbi.Operation.Operation;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		int A;
		Operation op = new Operation();

		Scanner sc = new Scanner(System.in);

		Account Ac = new Account();
		Ac.setAccNum(1234);
		Ac.setCustomerName("Abhishek");
		Ac.setAddress("pune");
		Ac.setPassword(123);
		Ac.setDepositMoney(1000);

		Account Ac2 = new Account();
		Ac2.setAccNum(6789);
		Ac2.setCustomerName("Avinash");
		Ac2.setAddress("Nashik");
		Ac2.setPassword(678);
		Ac2.setDepositMoney(5000);

		LinkedList l = new LinkedList();
		l.add(Ac);
		l.add(Ac2);

		while (true) {
			System.out.println();
			System.out.println("Select bellow one option");
			System.out.println(
					"1. Show Acc Info \n2. Balance Enquiry \n3. Deposit Money \n4. Withdraw \n5. Transfer Money");
			int x = sc.nextInt();

			switch (x) {

			case 1:
				Iterator itr = l.iterator();
				while (itr.hasNext()) {
					Object itr1 = itr.next();
					System.out.println("Show Account Information:" + itr1);
					System.out.println("________________");
				}
				break;

			case 2:

				while (true) {
					System.out.println("Press 1 for Account 1234 and press 2 for 6789 and press 0 to exit");

					A = sc.nextInt();
					if (A == 1) {
						System.out.println("Account number:" + Ac.getAccNum());
						System.out.println("Your total Balance is:" + Ac.getDepositMoney());
					} else if (A == 2) {
						System.out.println("Account number:" + Ac2.getAccNum());
						System.out.println("Your total Balance is:" + Ac2.getDepositMoney());
					}

					else if (A == 0) {
						break;
					}

					else {
						System.out.println("Invalid Choice");
					}

				}

				break;

			case 3:
				while (true) {
					System.out.println("Press 1 for Account 1234 and press 2 for 6789 and press 0 to exit");

					A = sc.nextInt();
					if (A == 1) {
						while (true) {
							System.out.println("Account number:" + Ac.getAccNum());

							if (Ac.getAccNum() == 1234) {
								System.out.println("Enter amount:");
								int c = sc.nextInt();
								if (c > 0) {
									double Total = Ac.getDepositMoney() + c;
									Ac.setDepositMoney(Total);
									System.out.println("Your Total Balance is:" + Ac.getDepositMoney());
									break;
								}
							}
						}
					} else if (A == 2) {
						while (true) {
							System.out.println("Account number:" + Ac2.getAccNum());

							if (Ac2.getAccNum() == 6789) {
								System.out.println("Enter amount:");
								int c = sc.nextInt();
								if (c > 0) {
									double Total = Ac2.getDepositMoney() + c;
									Ac2.setDepositMoney(Total);
									System.out.println("Your Total Balance is:" + Ac2.getDepositMoney());
									break;
								}
							}
						}
					}

					else if (A == 0) {
						break;
					}

					else {
						System.out.println("Invalid choice");
					}
				}

				break;

			case 4:
				while (true) {
					System.out.println("Press 1 for Account 1234 and press 2 for 6789 and press 0 for exit");

					A = sc.nextInt();
					if (A == 1) {
						System.out.println("Account number:" + Ac.getAccNum());

						if (Ac.getAccNum() == 1234) {
							while (true) {
								System.out.println("Enter amount:");
								double c = sc.nextDouble();
								if (c < Ac.getDepositMoney()) {
									Double Total = Ac.getDepositMoney() - c;
									System.out.println("Money has been Withdraw successfully");

									Ac.setDepositMoney(Total);
									System.out.println("Total balance is:" + Ac.getDepositMoney());
									break;
								} else if (c < 0) {
									System.out.println("Enter Amount should be greater than Zero ");
								}

								else {
									System.out.println(
											"Your entered Amount has been greater than your Total Balance \n Please ReEnter Amount");
								}
							}
						}
					}

					else if (A == 2) {
						System.out.println("Account number:" + Ac2.getAccNum());

						if (Ac2.getAccNum() == 6789) {
							while (true) {
								System.out.println("Enter amount:");
								double c = sc.nextDouble();
								if (c < Ac2.getDepositMoney()) {
									Double Total = Ac2.getDepositMoney() - c;
									System.out.println("Money has been Withdraw successfully");

									Ac2.setDepositMoney(Total);
									System.out.println("Total balance is:" + Ac2.getDepositMoney());
									break;
								} else if (c < 0) {
									System.out.println("Enter Amount should be greater than Zero ");
								}

								else {
									System.out.println(
											"Your entered Amount has been greater than your Total Balance \n Please ReEnter Amount");
								}
							}
						}
					}

					else if (A == 0) {
						break;
					}

					else {
						System.out.println("Invalid Input");
					}
				}
				break;

			case 5:
				while (true) {

					System.out.println(
							"press 1 to tranfer money from Account " + Ac.getAccNum() + " to " + Ac2.getAccNum());
					System.out.println(
							"press 2 to tranfer money from Account " + Ac2.getAccNum() + " to " + Ac.getAccNum());
					System.out.println("pres 0 to exit");
					A = sc.nextInt();
					if (A == 1) {
						while (true) {
							System.out.println("Enter amount:");
							int c = sc.nextInt();
							if (c < Ac.getDepositMoney()) {

								double Total = Ac.getDepositMoney() - c;
								Ac.setDepositMoney(Total);

								System.out.println("Amount has been transferred successfully");
								System.out.println("Rs " + c + " has been debited from " + Ac.getAccNum());
								System.out.println(
										"Account Number " + Ac.getAccNum() + " Balance is " + Ac.getDepositMoney());
								System.out.println();

								Double Total1 = Ac2.getDepositMoney() + c;
								Ac2.setDepositMoney(Total1);
								break;

							} else if (c < 0) {
								System.out.println("Enter Amount should be greater than Zero ");
							}

							else {
								System.out.println(
										"Your entered Amount has been greater than your Total Balance \n Please ReEnter Amount");
							}
						}
					} else if (A == 2) {
						while (true) {

							System.out.println("Enter amount:");
							int c = sc.nextInt();

							if (c < Ac2.getDepositMoney()) {

								double Total = Ac2.getDepositMoney() - c;
								Ac2.setDepositMoney(Total);

								System.out.println("Amount has been transferred successfully");
								System.out.println("Rs " + c + " has been debited from " + Ac2.getAccNum());
								System.out.println(
										"Account Number " + Ac2.getAccNum() + " Balance is " + Ac2.getDepositMoney());
								System.out.println();

								Double Total1 = Ac.getDepositMoney() + c;
								Ac.setDepositMoney(Total1);
								break;
							} else if (c < 0) {
								System.out.println("Enter Amount should be greater than Zero ");
							}

							else {
								System.out.println(
										"Your entered Amount has been greater than your Total Balance \n Please ReEnter Amount");
							}

						}
					} else if (A == 0) {
						break;

					} else {
						System.out.println("Input is invalid");
					}
				}
				break;

			}
		}
	}
}
