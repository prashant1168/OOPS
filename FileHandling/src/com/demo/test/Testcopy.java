package com.demo.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Testcopy {
public static void main(String[] args) {
	FileInputStream fis=null;
	FileOutputStream fout=null;
	try {
		fis=new FileInputStream("test1.txt")
		fout=new FileOutputStream("testcopy.txt",true);
	}
}
}
