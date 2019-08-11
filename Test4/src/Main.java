import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkList l = new LinkList();
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < 5; i++) {
			System.out.print("Enter mark " +(i + 1)+ " :");
			l.insertFirst(sc.nextDouble());
		}
		
		l.diplayList();
		
		l.findMinimum();
	}
}
