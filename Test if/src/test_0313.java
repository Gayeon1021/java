import java.util.*;
public class test_0313 {

	 public static void main(String [] args) {
		 int member = 1;
			if(member == 5)
				System.out.println("ITZY");
			if(member == 7)
				System.out.println("BTS");
			if(member == 9)
				System.out.println("EXO");
			if(member == 13)
				System.out.println("SEVENTEEN");
			if(member == 1)
				System.out.println("IU");
			
			switch(member) {
			case 1 : System.out.println("IU"); break;
			case 5 : System.out.println("ITZY"); break;
			case 7 : System.out.println("BTS"); break;
			case 9 : System.out.println("EXO"); break;
			case 13 : System.out.println("SEVENTEEN"); break;
			}
			
			int num = 2;
			for(int i = 1; i < 10; i++) {
				System.out.println(num + " X " + i + " = " + num*i);
			}
			int i=1;
			
			while(i<=9) {
				System.out.println(num+"x"+i+"="+num*i);
				i++;
			}
			Scanner sc= new Scanner (System.in);
		//while(true) {
//			member =sc.nextInt();
//			if( member == 5)
//			{
//				System.out.println("itzy");
//			} else if (member == 7) {
//				System.out.println("bts");
//			}
//			else if (member == 9) {
//				System.out.println("exo");
//			}	
//			else if (member == 1) {
//				System.out.println("Iu");
//			}
//			else if (member == 13) {
//				System.out.println("¼¼ºìÆ¾");
//			}
//			else {
//				System.out.println("Å»Ãâ");
//				break;
//			}
				
//			}
		
			switch(member) {
			
			case 1 : System.out.println("°­Àº¼­"); break;
			case 2 : System.out.println("°û°¡¿¬"); break;
			case 3 : System.out.println("±è¹ÎÁö"); break;
			case 4 : System.out.println("±èº½ÀÌ"); break;
			case 5 : System.out.println("±è¼ÒÇö"); break;
			case 6 : System.out.println("±èÃ¤¹Î"); break;
			case 7 : System.out.println("³²Á¤À±"); break;
			case 8 : System.out.println("¹Ú¼­¿¬"); break;
			case 9 : System.out.println("¼­Çý¸²"); break;
			case 10 : System.out.println("½ÅÃ¤¸°"); break;
			case 11 : System.out.println("¾ç¼öºó"); break;
			case 12 : System.out.println("¾öÇÏ´Ã"); break;
			case 13 : System.out.println("¿øÃ¤¿¬"); break;
			case 14 : System.out.println("À±¼öºó"); break;
			case 15 : System.out.println("ÀÓÅÂÈñ"); break;
			case 16 : System.out.println("ÀüÀºÁ¤"); break;
			case 17 : System.out.println("Á¤À¯°æ"); break;
			case 18 : System.out.println("ÇÔÁöÇö"); break;
			default:System.out.println("¹øÈ£¸¦ Àß¸ø ÀÔ·Â ÇÏ¼Ì½À´Ï´Ù");

			}
	
			
			String[] ¹Ý4 = { "°­Àº¼­", "°û°¡¿¬" , "±è¹ÎÁö", "±èº½ÀÌ" , "±è¼ÒÇö" ,"±èÃ¤¹Î","³²Á¤À±","¹Ú¼­¿¬","¼­Çý¸²","½ÅÃ¤¸°","¾ç¼öºó","¾öÇÏ´Ã"
					,"¿øÃ¤¿¬","À±¼öºó","ÀÓÅÂÈñ", "ÀüÀºÁ¤" ,"Á¤À¯°æ", "ÇÔÁöÇö"};
			System.out.println("¹øÈ£¸¦ ÀÔ·ÂÇÏ¼¼¿ä. ÀÔ·ÂÀ» ¾Ë·Áµå¸³´Ï´Ù.");
			
			Scanner scanner= new Scanner(System.in);
			while (true) {
				int number = scanner.nextInt();
				if(1<=number && number<= ¹Ý4.length) {
					System.out.println(¹Ý4[number - 1]);
				}else {
					break;
				}
			}
			
			
		}
			
		}
	
