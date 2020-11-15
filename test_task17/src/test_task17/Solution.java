package test_task17;

import java.io.*;
import java.util.*;

public class Solution {

	public static void main(String[] args) {

		ArrayList<Integer> numL = new ArrayList<>();
		Scanner scan = new Scanner(System.in);
		int numElem = Integer.parseInt(scan.nextLine());

		for (int i = 0; i < numElem; i++) {
			numL.add(scan.nextInt());
		}

		int numQuer = scan.nextInt();

		scan.nextLine();

		for (int i = 0; i < numQuer; i++) {

			String queryType = scan.nextLine();
			if (queryType.equals("Insert")) {

				String[] queryArr = scan.nextLine().split(" ");
				numL.add(Integer.parseInt(queryArr[0]), Integer.parseInt(queryArr[1]));

			} else {

				int remove = Integer.parseInt(scan.nextLine());
				numL.remove(remove);

			}
		}

		for (Integer n : numL) {
			System.out.print(n + " ");
		}

	}
}