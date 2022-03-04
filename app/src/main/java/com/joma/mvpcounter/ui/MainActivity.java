package com.joma.mvpcounter.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.os.Bundle;
import android.widget.Toast;

import com.joma.mvpcounter.R;
import com.joma.mvpcounter.data.Injector;
import com.joma.mvpcounter.databinding.ActivityMainBinding;
import com.joma.mvpcounter.presenter.CounterPresenter;
import com.joma.mvpcounter.presenter.PresenterContracts;

public class MainActivity extends AppCompatActivity implements PresenterContracts.CounterView {
    private ActivityMainBinding binding;
    private CounterPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        presenter = Injector.getPresenter();
        presenter.attachView(this);
        initListeners();
    }

    private void initListeners() {
        binding.btnPlus.setOnClickListener(view -> {
            presenter.increment();
        });
        binding.btnMinus.setOnClickListener(view -> {
            presenter.decrement();
        });
    }

    @Override
    public void updateCounter(int counter, boolean isFive, boolean isTen) {
        binding.tvCount.setText(String.valueOf(counter));
        if (isFive) {
            Toast.makeText(this, "Ураа вы дошли до 5", Toast.LENGTH_SHORT).show();
        }
        if (isTen) {
            binding.tvCount
                    .setTextColor(this.getResources().getColor(R.color.red, getTheme()));
        }
    }
}