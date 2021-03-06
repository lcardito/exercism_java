package me.lcardito.hackerrank.code.eight;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Solution {

    public static void main(String[] argh) {
        Map<String, Integer> phoneBook = new HashMap<>();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for (int i = 0; i < n; i++) {
            String name = in.next();
            int phone = in.nextInt();
            phoneBook.put(name, phone);

        }
        while (in.hasNext()) {
            String s = in.next();
            Integer phoneRequested = phoneBook.get(s);
            if (phoneRequested != null) {
                System.out.printf("%s=%d\n", s, phoneRequested);
            } else {
                System.out.println("Not found");
            }
        }
        in.close();
    }
}
