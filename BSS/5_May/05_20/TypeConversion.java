// 자료형 확장, 축소 2
public class TypeConversion {
	public static void main(String[] args) {
		int i;
		double f; 
		
		f = 5 / 4; // 5 / 4의 연산이 먼저 이기때문에 1의 값이 f로 들어감 
		System.out.println(f); // 1.0
		
		f = (double) 5 / 4;
		System.out.println(f); // 1.25
		
		f = 5 / (double) 4;
		System.out.println(f); // 1.25
		
		f = (double) 5 / (double) 4;
		System.out.println(f); // 1.25
		
		i = (int) 1.3 + (int) 1.8;
		System.out.println(i); // 2
		
		i = (int) (1.3 + 1.8);
		System.out.println(i); // 3
	}
}