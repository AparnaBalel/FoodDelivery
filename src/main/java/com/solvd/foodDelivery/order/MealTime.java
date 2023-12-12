package com.solvd.foodDelivery.order;

import java.time.LocalTime;
public enum MealTime {
    BREAKFAST(LocalTime.of(7, 0), LocalTime.of(11, 0)),
    LUNCH(LocalTime.of(11, 0), LocalTime.of(15, 0)),
    DINNER(LocalTime.of(17, 0), LocalTime.of(23, 56)),
    FAST_FOOD(LocalTime.MIN, LocalTime.MAX);
    private final LocalTime startTime;
    private final LocalTime endTime;
    MealTime(LocalTime startTime, LocalTime endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }
    public LocalTime getStartTime() {
        return startTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }
    public boolean isInTimeRange(LocalTime CurrentTime) {
        return CurrentTime.isAfter(startTime) && CurrentTime.isBefore(endTime);
    }

}
