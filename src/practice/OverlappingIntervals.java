package practice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

class TimeInterval {
    long startDate;
    long endDate;

    public TimeInterval(long startDate, long endDate) {
        this.startDate = startDate;
        this.endDate = endDate;
    }
}

public class OverlappingIntervals {

    public static boolean hasOverlappingIntervals(Collection<TimeInterval> intervals) {
        List<TimeInterval> intervalList = new ArrayList<>(intervals);

        for (int i = 0; i < intervalList.size(); i++) {
            TimeInterval currentInterval = intervalList.get(i);

            for (int j = i + 1; j < intervalList.size(); j++) {
                TimeInterval otherInterval = intervalList.get(j);

                // Check for overlap
                if (currentInterval.endDate > otherInterval.startDate &&
                        otherInterval.endDate > currentInterval.startDate) {
                    return true; // Overlapping intervals found
                }
            }
        }

        return false; // No overlapping intervals found
    }

    public static void main(String[] args) {
        // Example usage:
        List<TimeInterval> intervals = new ArrayList<>();
        intervals.add(new TimeInterval(100, 200));
        intervals.add(new TimeInterval(150, 250));
        intervals.add(new TimeInterval(300, 400));

        boolean hasOverlap = hasOverlappingIntervals(intervals);
        System.out.println("Does the collection have overlapping intervals? " + hasOverlap);
    }
}

