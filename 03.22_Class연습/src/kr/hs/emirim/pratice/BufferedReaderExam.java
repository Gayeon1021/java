package kr.hs.emirim.pratice;
import java.io.*;
public class BufferedReaderExam {

	public static void main(String[] args) {
	BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
	String aa;
	try {
		 aa = br.readLine();
		 System.out.print(aa);
		
	}
catch(IOException e) {
	e.printStackTrace();
}
	}

}
