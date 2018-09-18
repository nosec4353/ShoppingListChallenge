package informatika.id.android.shoppinglistchallenge;

import android.content.ClipData;
import android.content.Intent;
import android.media.MediaExtractor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class ItemList extends AppCompatActivity {
    private Button TomatoButton;
    private Button SaltButton;
    private Button RiceButton;
    private Button PineappleButton;
    private Button OnionButton;
    private Button VinegarButton;
    public static final String MESSAGE_ITEM = "informatika.id.android.ShoppingListChallenge.extra.MESSAGE";
    private ArrayList<String> ItemList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_list);
        TomatoButton = (Button) findViewById(R.id.list_one);
        SaltButton = (Button) findViewById(R.id.list_two);
        RiceButton = (Button) findViewById(R.id.list_three);
        PineappleButton = (Button) findViewById(R.id.list_four);
        OnionButton = (Button) findViewById(R.id.list_five);
        VinegarButton = (Button) findViewById(R.id.list_six);
    }


    public void addTomato(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra(MESSAGE_ITEM, "Tomato");
        //Bundle bundle = new Bundle();
        //bundle.putStringArrayList(MESSAGE_ITEM, ItemList);
        //intent.putExtras(bundle);
        //setResult(RESULT_OK, intent);
        //intent.putStringArrayListExtra(MESSAGE_ITEM, ItemList);
        startActivity(intent);
        finish();
    }

    public void addSalt(View view) {
        //ItemList.add("Salt");
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra(MESSAGE_ITEM, "Salt");
        //Bundle bundle = new Bundle();
        //bundle.putStringArrayList(MESSAGE_ITEM, ItemList);
        //intent.putStringArrayListExtra(MESSAGE_ITEM, ItemList);
        //setResult(RESULT_OK, intent);
        startActivity(intent);
        finish();
    }




}
