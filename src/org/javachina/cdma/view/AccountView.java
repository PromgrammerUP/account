package org.javachina.cdma.view;

import org.javachina.cdma.dto.Account;
import org.javachina.cdma.service.AccountService;

public class AccountView {
	public boolean addAccount(String number,String name,double money){
		Account newAccount = new Account(number,name,money);
		
		AccountService service = new AccountService();
		boolean isSuccess = service.addAccount(newAccount);
		
		if (isSuccess){
			return true;
		}
		return false;
	}
}
