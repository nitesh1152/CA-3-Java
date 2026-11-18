import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[][] merge(int[][] intervals) {
        if (intervals.length <= 1) {
            return intervals;
        }

        // Step 1: Sort intervals by their start times
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        List<int[]> merged = new ArrayList<>();

        // Step 2: Start with the first interval
        int[] current = intervals[0];
        merged.add(current);

        // Step 3: Iterate through the remaining intervals and merge if overlapping
        for (int[] next : intervals) {
            int currentEnd = current[1];
            int nextStart = next[0];
            int nextEnd = next[1];

            if (currentEnd >= nextStart) {
                // Overlapping intervals: extend the end of the current interval
                current[1] = Math.max(currentEnd, nextEnd);
            } else {
                // Non-overlapping: move to the next interval and add it to the list
                current = next;
                merged.add(current);
            }
        }

        // Step 4: Convert the list back into a 2D array
        return merged.toArray(new int[merged.size()][]);
    }
}