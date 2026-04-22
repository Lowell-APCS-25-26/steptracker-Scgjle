package org.APCSLowell;

public class StepTracker {
    private int day = 0;
    private double steps = 0.0;
    private int activeday = 0; 
    private int minsteps = 0;
    
    public StepTracker(int activityThreshold) {
        minsteps = activityThreshold;
    }
    void addDailySteps(int stepCount) {
        steps += stepCount;
        day++;
        if (stepCount >= minsteps){
            activeday++;
        }
    }
    int activeDays() {
        return activeday;
    }
    double averageSteps() {
        if (day == 0){
            return 0;
        }
        return steps/day;
    }
}
