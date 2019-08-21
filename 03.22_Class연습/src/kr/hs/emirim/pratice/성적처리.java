package kr.hs.emirim.pratice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class 己利贸府 {
	//府胶飘父惦
	static ArrayList<己利> 己利甸 = new ArrayList<>();

	public static void main(String[] args) {
		//颇老楷搬
		FileReader fr;
		try {
			fr = new FileReader("src/writed.txt");
			//滚欺 楷搬
			BufferedReader br = new BufferedReader(fr);
			//馆汗, 茄临 佬磊
			String line;
			while((line = br.readLine())!= null) { //捞抚\t林家\t荐切\t康绢 //酒捞坷 劳剂记 贸府
				StringTokenizer st = new StringTokenizer(line, "\t");		
				//货 按眉 父甸绢辑 持磊
				己利 new己利 = new 己利();
				new己利.setName(st.nextToken());
				new己利.setAddress(st.nextToken());
				new己利.setMath(Double.parseDouble(st.nextToken()));
				new己利.setEnglish(Double.parseDouble(st.nextToken()));
				//府胶飘俊 父甸绢柳 货 按眉 持磊
				己利甸.add(new己利);
				
			}
			//府胶飘 免仿窍磊
			for(己利 a: 己利甸) {
				System.out.println(a);
			}
			FileWriter fw = new FileWriter("src/save.txt");
			BufferedWriter bw = new BufferedWriter(fw);
			for(己利 a:己利甸) {
				bw.write(a.getName()+"\t"+a.getAddress()+"\t");
				bw.write(a.getMath()+"\t"+a.getEnglish()+"\t");
				bw.write(a.getTotal()+"\t"+a.getAverage());
				bw.newLine();
			}
			br.close();
			bw.close();	
			fr.close();
			fw.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} //劳剂记 贸府
 catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}


