package com.joma.mvpcounter.data;

public class CounterModel {
    private int count = 0;
    private boolean isFive = false;
    private boolean isTen = false;

    public void increment() {
        ++count;
        switch (count) {
            case 5:
                isFive = true;
                break;
            case 10:
                isTen = true;
                break;
            default:
                isFive = false;
                isTen = false;
                break;
        }
    }

    public void decrement() {
        --count;
        switch (count) {
            case 5:
                isFive = true;
                break;
            case 10:
                isTen = true;
                break;
            default:
                isFive = false;
                isTen = false;
                break;
        }
    }

    public int getCount() {
        return count;
    }

    public boolean isFive() {
        return isFive;
    }

    public boolean isTen() {
        return isTen;
    }
}
