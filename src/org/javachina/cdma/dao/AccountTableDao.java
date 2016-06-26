package org.javachina.cdma.dao;

import java.util.ArrayList;

import org.javachina.cdma.db.DB;
import org.javachina.cdma.dto.Account;

public class AccountTableDao {
	public boolean isAccountExit(String number){
		boolean isExit = false;
		ArrayList<Account> accounts = DB.getInstance().getAccountTable();
		for (Account account : accounts) {
			String dbNumber = account.getPhoneNumber();
			if(number.equals(dbNumber)){
				isExit = true;
				break;
			}
		}
		return isExit;
	}
	public void addAccount(Account account){
		ArrayList<Account> accounts = DB.getInstance().getAccountTable();
		accounts.add(account);
	}
}
