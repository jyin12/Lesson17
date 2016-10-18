package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //It compares to other objects
        //Returns: if variables (letter) preceeding a letter, returns negetive int
        //if variables (letter) comes after a letter, returns positive int
        //If variable (letter) is equal to a letter, returns 0

        String a = "what is this?";
        String b = new String ("what is this?");
        int x = a.compareTo(b);
        System.out.println(x);
        //prints out 0

        String c = "what is this?";
        String d = new String ("what color is this?");
        int y = c.compareTo(d);
        System.out.println(y);
        //prints out positive 6


    }
}
