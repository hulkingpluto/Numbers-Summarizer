package com.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NumberSummarizerInterface summarizer = new NumberSummarizer();

        System.out.println("Sample Input:");
        String input = scanner.nextLine().trim(); 

        Collection<Integer> collected = summarizer.collect(input);
        String summarized = summarizer.summarizeCollection(collected);

        System.out.println("Result: " + summarized);
    }
}
