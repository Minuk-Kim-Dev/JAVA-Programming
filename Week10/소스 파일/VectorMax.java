import java.util.Scanner;
import java.util.Vector;

public class VectorMax {
	
	public static void printBig(Vector<Integer> v) {
		int big = v.get(0);
		
		for(int i = 0; i < v.size(); i++) {
			if(big < v.get(i))
				big = v.get(i);
		}
		
		System.out.println("가장 큰 수는 " + big);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Vector<Integer> v = new Vector<Integer>();
		
		System.out.print("정수(-1이 입력될 때까지) >> ");
		
		while(true) {
			int n = sc.nextInt();
			
			if(n == -1) {
				break;
			}
			
			v.add(n);
		}
		
		if(v.size() == 0) {
			System.out.println("저장된 정수가 없습니다.");
			sc.close();
			return;
		}
		
		printBig(v);
		sc.close();
		
	}

}
