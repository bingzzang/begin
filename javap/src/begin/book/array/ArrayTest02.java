package begin.book.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayTest02 {
	public static void main(String[] args) {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int[] num = { 3, 6, 2, 10, 22, 10 };

		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < i; j++) {
				if (num[i] == num[j]) {
					try {
						System.out.println("중복");
						num[j] = Integer.parseInt(br.readLine());

					} catch (IOException e) {
						// TODO: handle exception
					}

				}
			}
			for (int z = 0; z < num.length; z++) {
				System.out.println(num[z]);
			}
		}
	}
}
