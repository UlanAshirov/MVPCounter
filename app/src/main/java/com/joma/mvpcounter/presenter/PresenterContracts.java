package com.joma.mvpcounter.presenter;

public class PresenterContracts {

   public interface CounterView {
       void updateCounter(int counter);
       void isFiveToast();
       void isTenColor();
       void setDefault();
    }

    public interface CounterPresenter {
        void increment();
        void decrement();
        void attachView(CounterView view);
    }
}
