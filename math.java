import java.util.Scanner;

public class math {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		System.out.print("Enter x:");
		double x = reader.nextDouble();
		double n = 1.0;
		double sum = 1.0;
		double factorial = n;
		double term = Math.pow(x, n) / n;

		while (term > Math.pow(10.0, -12.0)) {
			term = Math.pow(x, n) / factorial;
			sum = sum + term;
			System.out.println(sum);
			n++;
			factorial *= n;
		}
	}
}