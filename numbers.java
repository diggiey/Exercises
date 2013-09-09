public class numbers {
	public static void main(String[] args) {
		System.out.println("12");
		int init = 12;

		while (init > 1) {

			if (init % 2 == 0) {
				init = init / 2;
				System.out.println(init);
			} else {
				init = init * 3 + 1;
				System.out.println(init);
			}
		}
		System.out.println("Stop calculation");
	}
}