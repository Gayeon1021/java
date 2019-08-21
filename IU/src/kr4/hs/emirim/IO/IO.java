package kr4.hs.emirim.IO;

import java.io.IOException;

public class IO {

	public static void main(String[] args) {
	int bt;
	try {
		while((bt = System.in.read()) != 'x') {
		System.out.println((char)bt);
		} 
	} catch (IOException e) {
	
		e.printStackTrace();
	}

	}
}

	
