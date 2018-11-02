package intro_to_array_lists;

import java.util.ArrayList;

public class IntroToArrayLists {
	public static void main(String[] args) {
		// 1. Create an array list of Strings

		ArrayList<String> strings = new ArrayList<String>();

		// Don't forget to import the ArrayList class

		// 2. Add five Strings to your list
		strings.add("trash");
		strings.add("garbage");
		strings.add("waste");
		strings.add("refuse");
		strings.add("rubbish");
		// 3. Print all the Strings using a standard for-loop
		for (int i = 0; i < strings.size(); i++) {
			String s = strings.get(i);
			System.out.println(s);
		}
		System.out.println("----------------------------------");
		// 4. Print all the Strings using a for-each loop
		for (String a : strings) {
			System.out.println(a);

		}
		System.out.println("----------------------------------");
		// 5. Print only the even numbered elements in the list.
		for (int j = 0; j < strings.size(); j++) {
			String t = strings.get(j);
			if (j % 2 == 0) {
				System.out.println(t);
			}
		}
			System.out.println("----------------------------------");
			// 6. Print all the Strings in reverse order.
			for (int k = 4; k >= 0; k--) {
				String u = strings.get(k);
				System.out.println(u);
			}
			System.out.println("----------------------------------");
			// 7. Print only the Strings that have the letter 'e' in them.
			for (int l = 0; l < strings.size(); l++) {
				String x = strings.get(l);
				if (strings.get(l).contains("e")) {
					System.out.println(x);
				}
				
			}
			System.out.println("----------------------------------");
		}
	}

