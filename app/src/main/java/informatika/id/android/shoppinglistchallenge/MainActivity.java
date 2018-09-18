package informatika.id.android.shoppinglistchallenge;

import android.content.ClipData;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    private TextView one;
    private TextView two;
    private TextView three;
    private TextView four;
    private TextView five;
    private TextView six;
    private TextView seven;
    private TextView eight;
    private TextView nine;
    private TextView ten;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        one = (TextView) findViewById(R.id.tomato);
        two = (TextView) findViewById(R.id.salt);
        three = (TextView) findViewById(R.id.rice);
        four = (TextView) findViewById(R.id.vinegar);
        five = (TextView) findViewById(R.id.pineapple);
        six = (TextView) findViewById(R.id.cabbage);
        seven = (TextView) findViewById(R.id.onion);
        eight = (TextView) findViewById(R.id.egg);
        nine = (TextView) findViewById(R.id.zucchini);
        ten = (TextView) findViewById(R.id.item_ten);


       //ItemResult = intent.getStringArrayListExtra("ItemList");
        //GET INTENT AND DISPLAY IT
        Intent intent = getIntent();
        String result = intent.getStringExtra(ItemList.MESSAGE_ITEM);
        two.setText(result);
        two.setVisibility(View.VISIBLE);
        Log.d("INTENT","it worked!");


    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.d("Test",savedInstanceState.toString());
        boolean isVisible = savedInstanceState.getBoolean("previous_state");
        if(isVisible){
            Log.d("INTENT2","it worked!");
            one.setText(savedInstanceState.getString("previous_first_state"));
            one.setVisibility(View.VISIBLE);
            //two.setText(result);
            //two.setVisibility(View.VISIBLE);
        }

    }

    public void addItem(View view) {
        Intent intent = new Intent(this, ItemList.class);
        startActivity(intent);
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        if(two.getVisibility() == View.VISIBLE){
            Log.d("INTENT3","it worked!");
            outState.putBoolean("previous_state", true);
            outState.putString("previous_first_state", one.getText().toString());
        }
    }


}
