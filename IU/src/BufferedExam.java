import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;

public class BufferedExam {

	public static void main(String[] args) throws IOException {
		 BufferedInputStream bi  = new BufferedInputStream(System.in);
		 BufferedOutputStream bo  = new BufferedOutputStream(System.out);
		 int aa;
		 while((aa = bi.read()) != -1){
			 try {
				bo.write(aa);
				bo.flush();
			}
			 catch (IOException e) {
				 //e.printStackTrace();
			}
		 }
		 }
	}
