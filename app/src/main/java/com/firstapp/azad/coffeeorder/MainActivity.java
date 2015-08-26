package com.firstapp.azad.coffeeorder;

import android.app.Activity;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupWindow;
import android.widget.TextView;

public class MainActivity extends Activity {
    int quantity=0;
    int price;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void plusClick(View v)
    {
        quantity++;
        TextView quantityTextView =(TextView) findViewById(R.id.amounttextview);
        quantityTextView.setText(quantity + "");
    }
    public void plusClick1(View v)
    {
        if(quantity>0){
            quantity--;
        }

        TextView quantityTextView =(TextView) findViewById(R.id.amounttextview);
        quantityTextView.setText(quantity+"");


    }
    public void orderClick(View v)
    {
        price=quantity*5;
        TextView quantityTextView1 =(TextView) findViewById(R.id.totalPricetextView);
        quantityTextView1.setText(price + "");
    }

}
