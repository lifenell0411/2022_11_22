class Main {
	public static void main(String[] args) {
		int n1 = 10;
		int n2 = 20;
		int n3 = 30;
		int n4 = 40;
		// 배열 생성
		int[] all = new int[] { n1, n2, n3, n4 };

		System.out.println("== 일반 반복 ==");
		for (int i = 0; i < all.length; i++) {
			System.out.println(all[i]);
		}

		System.out.println("== for each 사용 ==");

		for (int n : all) {
			System.out.println(n);
		}

	}
}
