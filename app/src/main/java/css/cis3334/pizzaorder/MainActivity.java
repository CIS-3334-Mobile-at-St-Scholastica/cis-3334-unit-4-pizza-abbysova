package css.cis3334.pizzaorder;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements updateViewInterface {

    PizzaOrderInterface PizzaSystem;
    RadioButton rbSmall;
    RadioButton rbMedium;
    RadioButton rbLarge;
    CheckBox chkbxCheese;
    CheckBox chkbxDelivery;
    TextView txtTotal;
    TextView txtStatus;
    TextView txtPizzasOrdered;
    Spinner spinnerToppings;
    TextView price;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        PizzaSystem = new PizzaOrder(this);
        // Set up our radio buttons
        rbSmall = (RadioButton) findViewById(R.id.radioButtonSmall);
        rbMedium = (RadioButton) findViewById(R.id.radioButtonMedium);
        rbLarge = (RadioButton) findViewById(R.id.radioButtonLarge);

        // Set up the Check Boxes
        chkbxCheese = (CheckBox) findViewById(R.id.checkBoxCheese);
        chkbxDelivery = (CheckBox) findViewById(R.id.checkBoxDeluvery);

        // Set up the TextViews
        txtTotal = (TextView) findViewById(R.id.textViewTotal);
        txtStatus = (TextView) findViewById(R.id.textViewStatus);
        txtPizzasOrdered = (TextView) findViewById(R.id.textViewPizzasOrdered);
        // Set up the Spinner
        spinnerToppings = (Spinner) findViewById(R.id.spinnerToppings);
       rbSmall.setText("Price $" +price);}
    @Override
    public void updateOrderStatusInView(String orderStatus) {

        txtStatus.setText("Order Status: " + orderStatus);
    }

    public void onClickOrder(View view) {

        String orderDescription = "No orders yet";
        private String sizePizza
        private boolean extraCheese
        //orderDescription = PizzaSystem.OrderPizza("Peperoni", sizePizza(), extraCheese());
        spinnerToppings.getSelectedItem().toString();
        txtPizzasOrdered.setText(orderDescription);
        PizzaSystem.getDelivery();
        // ****** For the Practice Activity, students need to call to OrderPizza here
        // ****** For the Assignment, students will modify the order to fit the type of pizza the user selects using the UI widgets

        //display a pop up message for a long period of time
        Toast.makeText(getApplicationContext(), "You have ordered a " + orderDescription, Toast.LENGTH_LONG).show();
        // add this pizza to the textview the lists the pizzas
        txtPizzasOrdered.append(orderDescription + "\n");




    }

    private boolean extraCheese() {
        boolean cheese;
        if (chkbxCheese.isChecked()) {
            cheese = true;
        } else {
            cheese = false;
        }

        return cheese;
    }


    private String sizePizza() {
        String strSize;
        if (rbLarge.isChecked()) {
            strSize = "Large";
        } else if (rbMedium.isChecked()) {
            strSize = "Medium";
        } else {
            strSize = "Small";
        }
        return strSize;
    }
}
