package exercise.stopWatch;

import exercise.stopWatch.StopWatch;

public class StopWatchMain {
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        System.out.println(stopWatch.getStartTime());
        System.out.println(stopWatch.getEndTime());
        System.out.println(stopWatch.getElapsedTime());
    }
}
