package com.joma.mvpcounter.presenter;

import com.joma.mvpcounter.data.CounterModel;

public class CounterPresenter implements PresenterContracts.CounterPresenter {
    private PresenterContracts.CounterView counterView;
    private CounterModel model;

    public CounterPresenter() {
        model = new CounterModel();
    }

    @Override
    public void increment() {
        model.increment();
        counterView.updateCounter(model.getCount(), model.isFive(), model.isTen());
    }

    @Override
    public void decrement() {
        model.decrement();
        counterView.updateCounter(model.getCount(), model.isFive(), model.isTen());
    }

    @Override
    public void attachView(PresenterContracts.CounterView view) {
        this.counterView = view;
    }
}
