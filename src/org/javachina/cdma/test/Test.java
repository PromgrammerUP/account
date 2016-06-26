package org.javachina.cdma.test;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import org.javachina.cdma.db.DB;
import org.javachina.cdma.dto.Account;
import org.javachina.cdma.view.AccountView;

public class Test {
	public static void main(String[] args) {
		String info = JOptionPane.showInputDialog("请按以下格式输入-->电话号码：用户名：剩余金额");
		String[] infos = info.split(":");
		String number = infos[0];
		String name = infos[1];
		String money = infos[2];
		double moneyd = Double.parseDouble(money);
		AccountView view = new AccountView();
		boolean isSuccess = view.addAccount(number, name, moneyd);
		if(isSuccess){
			System.out.println("添加成功！");
		}else{
			System.out.println("添加失败！");
		}
		System.out.println("以下是测试部分-----");
		ArrayList<Account> accounts = DB.getInstance().getAccountTable();
		for (Account account : accounts) {
			String phnumber = account.getPhoneNumber();
			String name1 = account.getName();
			double money1 = account.getMoney();
			System.out.println("电话号码："+phnumber+"\r\n姓名"+name1+"\r\n余额"+money1);
			
		}
	}
}
