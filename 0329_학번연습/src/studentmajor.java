
import java.util.*;
public class studentmajor {
private String[] �г�3 = {"���ͷ�Ƽ��̵���","���ͷ�Ƽ��̵���","���̵������ΰ�","���̵�� �����ΰ�","���̵��ַ�ǰ�","���̵�� �ַ�ǰ�"};
private String[] �г�2 = {"���̵����Ʈ�����","���̵�����Ʈ�����","���̵��ַ�ǰ�","���̵�� �ַ�ǰ�","���̵������ΰ�","���̵�� �����ΰ�"};

public static void main(String[] args) {
			 Scanner sc= new Scanner(System.in);
	 
			 while(true) {
				 System.out.println("�й��� �Է����ּ���");
				 String num = sc.nextLine();
				if(num.substring(0,1).equals("3")) {
					if(num.substring(1, 2).equals("1") || num.substring(1, 2).equals("2")) {
						System.out.println("���ͷ�Ƽ��̵�� �Դϴ�.");
					}
					else if(num.substring(1, 2).equals("3") || num.substring(1, 2).equals("4")) {
						System.out.println("���̵������� �Դϴ�.");
					}
					else if(num.substring(1, 2).equals("5") || num.substring(1, 2).equals("6")) {
						System.out.println("���̵��ַ�� �Դϴ�.");
					}
				}
				else {
			 if (num.substring(1,2).equals("3")  || num.substring(1,2).equals("4")) {
				 System.out.println("���̵�� ���ַ�� �Դϴ�.");
			 }
			 
			 else if (num.substring(1,2).equals("1")  || num.substring(1,2).equals("2")) {
					 System.out.println("���̵�� ����Ʈ���� �Դϴ�.");
				 }
			 
			 else if (num.substring(1,2).equals("5")  || num.substring(1,2).equals("6")) {
					 System.out.println("���̵�� ������ �Դϴ�.");
				 }
		}
		}
	}
	}
