package org.javachina.cdma.db;

import java.util.ArrayList;

import org.javachina.cdma.dto.Account;

public class DB {
	private DB() {}
	private static DB instance = new DB();
	public static DB getInstance(){
		return instance;
	}
	private final ArrayList<Account> accountTable  = new ArrayList<Account>();

    public ArrayList<Account> getAccountTable(){
    	return accountTable;
    }
}
