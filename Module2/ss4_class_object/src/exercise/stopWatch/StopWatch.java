package exercise.stopWatch;


import java.util.Date;

public class StopWatch {
    long startTime,endTime;

    public long getStartTime() {
        return this.startTime = System.nanoTime();
    }

    public long getEndTime() {
        return this.endTime = System.nanoTime();
    }

    public void startTime() {
        this.startTime = System.currentTimeMillis();
    }

    public void stopTime() {
        this.endTime = System.currentTimeMillis();
    }

    public long getElapsedTime() {
        return this.endTime - this.startTime;
    }

}
