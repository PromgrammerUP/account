package org.javachina.cdma.test;

import java.io.File;
import java.io.IOException;

public class TestFile {
	public static void main(String[] args) {
//		File f1 = new File("f:/aa");
//		boolean isFile = f1.isFile();
//		System.out.println(isFile);
//		boolean isDir = f1.isDirectory();
//		System.out.println(isDir);
		
//		File f2 = new File("f:/aa/ww");
//		f2.mkdir();
//		File f2 = new File("f:/aa/yy/hh");
//		f2.mkdirs();
//		File f2 = new File("f:/aa/newFile.txt");
//		try {
//			f2.createNewFile();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			System.err.println("创建失败");
//		}
//		File f2 = new File("f:/aa/newFile.txt");
//		f2.delete();
//		File f2 = new File("f:/aa/ww");
//		f2.delete();
//		File f2 = new File("f:/aa/yy"); //如果目录非空，则删除失败
//		f2.delete();
		
//		File f2 = new File("f:/aa");
//		String[] names = f2.list();
//		for (String string : names) {
//			System.out.println(string);
//		}
//		File f2 = new File("f:/aa");
//		File[] files = f2.listFiles();
//		for (File file : files) {
//			System.out.println("名称"+file.getName()+"路径"+file.getPath());
//		}
		
		TestFile t = new TestFile();
		t.select("c:/Windows");
		System.out.println("目录有"+t.dirNum+"个");
		System.out.println("文件有"+t.fileNum+"个");
	}
	 private int fileNum = 0;
	 private int dirNum = 0;
	public void select(String path){
		File f2 = new File(path);
		File[] files = f2.listFiles();
		for (File file : files) {
			if(file.isDirectory()){
				dirNum++;
				System.out.println("目录名：------>"+file.getPath());
				this.select(file.getPath());
			}else{
				fileNum++;
				System.out.println("文件名：------->"+file.getPath());
			}
		}
	}
}
