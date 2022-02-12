package com.techelevator;

import com.techelevator.view.Menu;

import java.math.BigDecimal;
import java.util.Scanner;

public class VendingMachineCLI {

	private static final String MAIN_MENU_OPTION_DISPLAY_ITEMS = "Display Vending Machine Items";
	private static final String MAIN_MENU_OPTION_PURCHASE = "Purchase";
	private static final String MAIN_MENU_OPTION_EXIT = "Exit";
	private static final String[] MAIN_MENU_OPTIONS = { MAIN_MENU_OPTION_DISPLAY_ITEMS, MAIN_MENU_OPTION_PURCHASE,MAIN_MENU_OPTION_EXIT };

	private static final String PURCHASE_MENU_OPTION_FEED_MONEY = "Feed Money";
	private static final String PURCHASE_MENU_OPTION_SELECT_PRODUCT = "Select Product";
	private static final String PURCHASE_MENU_OPTION_FINISH_TRANSACTION = "Finish Transaction";
	private static final String[] PURCHASE_MENU_OPTIONS = { PURCHASE_MENU_OPTION_FEED_MONEY, PURCHASE_MENU_OPTION_SELECT_PRODUCT, PURCHASE_MENU_OPTION_FINISH_TRANSACTION};

	private Menu menu;
	private String[] menuOptions = MAIN_MENU_OPTIONS;
	public VendingMachineCLI(Menu menu) {
		this.menu = menu;
	}

	public void run() {
		VendingMachine vendingMachine = new VendingMachine();
		boolean exit = false;
		while (!exit) {
			String choice = (String) menu.getChoiceFromOptions(menuOptions);

			if (choice.equals(MAIN_MENU_OPTION_DISPLAY_ITEMS)) {
				System.out.println("I'm in option 1");
				System.out.println(vendingMachine.getSlots());
				// display vending machine items
			} else if (choice.equals(MAIN_MENU_OPTION_PURCHASE)) {
				System.out.println("I'm in option 2");
				menuOptions = PURCHASE_MENU_OPTIONS;

				// do purchase
			}else if (choice.equals(MAIN_MENU_OPTION_EXIT)){
				exit = true;
			}else if (choice.equals(PURCHASE_MENU_OPTION_FEED_MONEY)){
				Scanner moneyScanner = new Scanner(System.in);
				String inputtedMoney = moneyScanner.nextLine();
				BigDecimal moneyInput = new BigDecimal(inputtedMoney);
				vendingMachine.currentMoneyProvided(moneyInput);
			}else if (choice.equals(PURCHASE_MENU_OPTION_SELECT_PRODUCT)){
				Scanner selectedItem = new Scanner(System.in);
				String inputtedItem = selectedItem.nextLine();

//				vendingMachine.selectProductSlot(vendingMachine.getSlots().get(inputtedItem));
				System.out.println("Current Money Provided: " + vendingMachine.getBalance());
			}else if (choice.equals(PURCHASE_MENU_OPTION_FINISH_TRANSACTION)){
				System.out.println(vendingMachine.returnChange());
				menuOptions = MAIN_MENU_OPTIONS;


			}
		}
	}

	public static void main(String[] args) {
		Menu menu = new Menu(System.in, System.out);
		VendingMachineCLI cli = new VendingMachineCLI(menu);
		cli.run();
	}
}
