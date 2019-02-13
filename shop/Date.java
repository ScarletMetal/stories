package com.company.stories.shop;

public class Date {
    private int day, month, year;

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public boolean laterThan(Date other) {
        if (year > other.year) return true;
        if (month > other.month) return true;
        return day > other.day;
    }

    public boolean earlierThan(Date other) {
        return !laterThan(other);
    }

    public boolean equals(Date other) {
        return year == other.year & month == other.month & day == other.day;
    }
}

