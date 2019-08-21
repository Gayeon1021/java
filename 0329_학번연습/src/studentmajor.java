
import java.util.*;
public class studentmajor {
private String[] 학년3 = {"인터랙티브미디어과","인터렉티브미디어과","뉴미디어디자인과","뉴미디어 디자인과","뉴미디어솔루션과","뉴미디어 솔루션과"};
private String[] 학년2 = {"뉴미디소프트웨어과","뉴미디어소프트웨어과","뉴미디어솔루션과","뉴미디어 솔루션과","뉴미디어디자인과","뉴미디어 디자인과"};

public static void main(String[] args) {
			 Scanner sc= new Scanner(System.in);
	 
			 while(true) {
				 System.out.println("학번을 입력해주세요");
				 String num = sc.nextLine();
				if(num.substring(0,1).equals("3")) {
					if(num.substring(1, 2).equals("1") || num.substring(1, 2).equals("2")) {
						System.out.println("인터랙티브미디어 입니다.");
					}
					else if(num.substring(1, 2).equals("3") || num.substring(1, 2).equals("4")) {
						System.out.println("뉴미디어디자인 입니다.");
					}
					else if(num.substring(1, 2).equals("5") || num.substring(1, 2).equals("6")) {
						System.out.println("뉴미디어솔루션 입니다.");
					}
				}
				else {
			 if (num.substring(1,2).equals("3")  || num.substring(1,2).equals("4")) {
				 System.out.println("뉴미디어 웹솔루션 입니다.");
			 }
			 
			 else if (num.substring(1,2).equals("1")  || num.substring(1,2).equals("2")) {
					 System.out.println("뉴미디어 소프트웨어 입니다.");
				 }
			 
			 else if (num.substring(1,2).equals("5")  || num.substring(1,2).equals("6")) {
					 System.out.println("뉴미디어 디자인 입니다.");
				 }
		}
		}
	}
	}
