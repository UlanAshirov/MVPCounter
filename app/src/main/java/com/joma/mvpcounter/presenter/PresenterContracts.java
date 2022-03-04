package com.joma.mvpcounter.presenter;

public class PresenterContracts {

   public interface CounterView {
       void updateCounter(int counter, boolean isFive, boolean isTen);
    }

    public interface CounterPresenter {
        void increment();
        void decrement();
        void attachView(CounterView view);
    }
}
