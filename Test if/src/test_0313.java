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
//				System.out.println("����ƾ");
//			}
//			else {
//				System.out.println("Ż��");
//				break;
//			}
				
//			}
		
			switch(member) {
			
			case 1 : System.out.println("������"); break;
			case 2 : System.out.println("������"); break;
			case 3 : System.out.println("�����"); break;
			case 4 : System.out.println("�躽��"); break;
			case 5 : System.out.println("�����"); break;
			case 6 : System.out.println("��ä��"); break;
			case 7 : System.out.println("������"); break;
			case 8 : System.out.println("�ڼ���"); break;
			case 9 : System.out.println("������"); break;
			case 10 : System.out.println("��ä��"); break;
			case 11 : System.out.println("�����"); break;
			case 12 : System.out.println("���ϴ�"); break;
			case 13 : System.out.println("��ä��"); break;
			case 14 : System.out.println("������"); break;
			case 15 : System.out.println("������"); break;
			case 16 : System.out.println("������"); break;
			case 17 : System.out.println("������"); break;
			case 18 : System.out.println("������"); break;
			default:System.out.println("��ȣ�� �߸� �Է� �ϼ̽��ϴ�");

			}
	
			
			String[] ��4 = { "������", "������" , "�����", "�躽��" , "�����" ,"��ä��","������","�ڼ���","������","��ä��","�����","���ϴ�"
					,"��ä��","������","������", "������" ,"������", "������"};
			System.out.println("��ȣ�� �Է��ϼ���. �Է��� �˷��帳�ϴ�.");
			
			Scanner scanner= new Scanner(System.in);
			while (true) {
				int number = scanner.nextInt();
				if(1<=number && number<= ��4.length) {
					System.out.println(��4[number - 1]);
				}else {
					break;
				}
			}
			
			
		}
			
		}
	
