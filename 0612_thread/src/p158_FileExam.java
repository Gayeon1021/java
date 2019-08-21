
import java.io.FileNotFoundException;
import java.io.FileReader;

public class p158_FileExam	{
	public static void main (String ars[]) {
		try {
			FileReader fr = new FileReader("test.java");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}