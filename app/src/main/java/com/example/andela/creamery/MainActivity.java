package com.example.andela.creamery;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.HorizontalScrollView;

public class MainActivity extends AppCompatActivity {

    private double totalPrice = 0.0;
    private final double[] flavourPrices = {6.45, 5.00, 6.00, 5.80, 6.99, 5.99};
    private final double[] toppingPrices = {2.50, 3.00, 3.99, 3.39, 2.89, 3.00 };
    private String message = "";

    private CheckBox cakeBatterCheckBox;
    private CheckBox chocolateCheckBox;
    private CheckBox frenchVanillaCheckBox;
    private CheckBox strawberryCheckBox;
    private CheckBox sweetCreamCheckBox;
    private CheckBox cheeseCakeCheckBox;
    private CheckBox chocolateToppingCheckBox;
    private CheckBox almondToppingCheckBox;
    private CheckBox kitkatToppingCheckBox;
    private CheckBox mnmsToppingCheckBox;
    private CheckBox cheeriesToppingCheckBox;
    private CheckBox browniesCheckBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        HorizontalScrollView flavourView = (HorizontalScrollView) findViewById(R.id.flavour_scroll_view);
        flavourView.setSmoothScrollingEnabled(true);
        flavourView.setHorizontalScrollBarEnabled(false);


        cakeBatterCheckBox = (CheckBox) findViewById(R.id.cake_batter_check_box);
        strawberryCheckBox = (CheckBox) findViewById(R.id.strawberry_check_box);
        frenchVanillaCheckBox = (CheckBox) findViewById(R.id.french_vanilla_check_box);
        chocolateCheckBox = (CheckBox) findViewById(R.id.chocolate_check_box);
        cheeseCakeCheckBox = (CheckBox) findViewById(R.id.cheese_cake_check_box);
        sweetCreamCheckBox = (CheckBox) findViewById(R.id.sweet_cream_check_box);
        chocolateToppingCheckBox = (CheckBox) findViewById(R.id.chocolate_topping);
        mnmsToppingCheckBox = (CheckBox) findViewById(R.id.mmns_topping);
        kitkatToppingCheckBox = (CheckBox) findViewById(R.id.kitkat_topping);
        cheeriesToppingCheckBox = (CheckBox) findViewById(R.id.cherries_topping);
        almondToppingCheckBox = (CheckBox) findViewById(R.id.almonds_topping);
        browniesCheckBox = (CheckBox) findViewById(R.id.brownies_topping);
    }

    public double getTotalPrice()
    {
        return totalPrice;
    }

    private void processToppings()
    {

        if(chocolateToppingCheckBox.isChecked())
        {
            totalPrice +=  toppingPrices[0];
        }

        if(almondToppingCheckBox.isChecked())
        {
            totalPrice +=  toppingPrices[1];
        }

        if(kitkatToppingCheckBox.isChecked())
        {
            totalPrice +=  toppingPrices[2];
        }

        if(mnmsToppingCheckBox.isChecked())
        {
            totalPrice +=  toppingPrices[3];
        }

        if(cheeriesToppingCheckBox.isChecked())
        {
            totalPrice +=  toppingPrices[4];
        }

        if(browniesCheckBox.isChecked())
        {
            totalPrice +=  toppingPrices[5];
        }

    }

    private void processFlavours()
    {

        if(cakeBatterCheckBox.isChecked())
        {
            totalPrice +=  flavourPrices[0];
        }

        if(chocolateCheckBox.isChecked())
        {
            totalPrice +=  flavourPrices[1];
        }

        if(frenchVanillaCheckBox.isChecked())
        {
            totalPrice +=  flavourPrices[2];
        }

        if(strawberryCheckBox.isChecked())
        {
            totalPrice +=  flavourPrices[3];
        }

        if(sweetCreamCheckBox.isChecked())
        {
            totalPrice +=  flavourPrices[4];
        }

        if(cheeseCakeCheckBox.isChecked())
        {
            totalPrice +=  flavourPrices[5];
        }

    }

    public void processOrder(View view)
    {
        Intent intent = new Intent(this, DisplayOrder.class);

        startActivity(intent);


    }

}
