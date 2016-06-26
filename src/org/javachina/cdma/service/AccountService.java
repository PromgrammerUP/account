package org.javachina.cdma.service;

import org.javachina.cdma.dao.AccountTableDao;
import org.javachina.cdma.dto.Account;

public class AccountService {
	public boolean addAccount(Account account){
		AccountTableDao dao = new AccountTableDao();
		boolean isExit = dao.isAccountExit(account.getPhoneNumber());
		if(isExit){
			return false;
		}else{
			dao.addAccount(account);
			return true;
		}
	}
}
