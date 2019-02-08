package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String q;
	do {
        System.out.println("Good day. What is your problem? Enter your response here or Q to quit:");
        q = sc.nextLine();
        System.out.println(q);
    }while (!q.equalsIgnoreCase("q"));

    }
}
