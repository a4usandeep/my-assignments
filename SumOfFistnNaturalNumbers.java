
public class SumOfFistnNaturalNumbers {
	public static void main(String[] args) {
		int sum = 0;
		int num = 100;
		for (int i = 1; i <= num; i++) {
			if (i % 3 == 0) {
				System.out.println(i + " ");
				sum=sum+ i;
			}
		}
		System.out.println("Sum" + sum);
	}
}
