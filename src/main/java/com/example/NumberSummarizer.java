package com.example;

import java.util.*;
import java.util.stream.Collectors;

public class NumberSummarizer implements NumberSummarizerInterface{

    @Override
    public Collection<Integer> collect(String input) {
        return Arrays.stream(input.split(","))
                .map(String::trim)
                .filter(s -> !s.isEmpty())
                .map(Integer::parseInt)
                .sorted()
                .collect(Collectors.toList());
    }

    @Override
    public String summarizeCollection(Collection<Integer> input) {
        if (input.isEmpty()) return "";

        List<Integer> sorted = new ArrayList<>(input);
        Collections.sort(sorted);

        StringBuilder result = new StringBuilder();
        int start = sorted.get(0);
        int prev = start;

        for (int i = 1; i < sorted.size(); i++) {
            int curr = sorted.get(i);
            if (curr == prev + 1) {
                prev = curr;
            } else {
                appendRange(result, start, prev);
                start = curr;
                prev = curr;
            }
        }
        appendRange(result, start, prev);
        return result.toString();
    }

    private void appendRange(StringBuilder result, int start, int end) {
        if (result.length() > 0) result.append(",");
        if (start == end)
            result.append(start);
        else
            result.append(start).append("-").append(end);
    }
}
