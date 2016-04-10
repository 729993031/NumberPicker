package com.example.NumberPicker;

import android.app.Activity;
import android.os.Bundle;
import android.widget.NumberPicker;
import android.widget.Toast;

import java.util.Map;

public class MyActivity extends Activity {
    NumberPicker np1,np2;
    int minPrice=25,maxPrice=75;
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        np1=(NumberPicker)findViewById(R.id.np1);
        np1.setMinValue(10);
        np1.setMaxValue(50);
        np1.setValue(minPrice);
        np1.setOnValueChangedListener(new NumberPicker.OnValueChangeListener() {
            @Override
            public void onValueChange(NumberPicker numberPicker, int oldVal, int newVal) {
                minPrice=newVal;
                showSelectedPrice();
            }
        });
        np2=(NumberPicker)findViewById(R.id.np2);
        np2.setMinValue(60);
        np2.setMaxValue(100);
        np2.setValue(maxPrice);
        np2.setOnValueChangedListener(new NumberPicker.OnValueChangeListener() {
            @Override
            public void onValueChange(NumberPicker numberPicker, int newVal, int oldVal) {
                maxPrice=newVal;
                showSelectedPrice();
            }
        });
    }
    private void showSelectedPrice()
    {
        Toast.makeText(this, "您选择最低价格为：" + minPrice
                + ",最高价格为：" + maxPrice, Toast.LENGTH_SHORT)
                .show();
    }
}
