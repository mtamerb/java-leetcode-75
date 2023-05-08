package com.tamerb;


public class ReverseWordsInAString {
    public static void main(String[] args) {
        System.out.println(reverseWords("the sky is blue"));

    }

    public static String reverseWords(String s) {

        String[] words = s.split(" ");

        String result = "";

        for (int i = words.length - 1; i >= 0; i--) {

            result += words[i] + " ";
        }

        return result.trim().replaceAll("\\s+", " ");

    }
}

