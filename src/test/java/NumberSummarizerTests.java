import org.junit.jupiter.api.Test;

import com.example.NumberSummarizer;
import com.example.NumberSummarizerInterface;

import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

public class NumberSummarizerTests {

    private final NumberSummarizerInterface summarizer = new NumberSummarizer();

    @Test
    public void testSummarizeCollection_basic() {
        Collection<Integer> input = Arrays.asList(1, 2, 3, 5, 6, 8, 9, 10);
        String result = summarizer.summarizeCollection(input);
        assertEquals("1-3,5-6,8-10", result);
    }

    @Test
    public void testSingleNumber() {
        Collection<Integer> input = Collections.singletonList(7);
        assertEquals("7", summarizer.summarizeCollection(input));
    }

    @Test
    public void testEmptyCollection() {
        Collection<Integer> input = Collections.emptyList();
        assertEquals("", summarizer.summarizeCollection(input));
    }

    @Test
    public void testNonSequentialNumbers() {
        Collection<Integer> input = Arrays.asList(1, 3, 5);
        assertEquals("1,3,5", summarizer.summarizeCollection(input));
    }
}
