package kr.hs.emirim.pratice;
import java.io.*;
public class ReadLineFileExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fname = "BufferInput.txt";
		try {
			
	FileReader fr = new FileReader("src/dataw.txt");
	BufferedReader br = new BufferedReader(fr);
	String s="";
	while((s= br.readLine())!=null) {
		System.out.println(s);
	}
	br.close();
	fr.close();
}
catch(Exception e) {
	System.out.println(e.toString());
}
	}

}
