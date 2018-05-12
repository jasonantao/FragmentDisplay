package jasonantao.testappmock1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class DisplayCalc extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_calc);

        Intent intent = getIntent();
        String message = intent.getStringExtra(DataEntry.EXTRA_MESSAGE);


        TextView textViewA = (TextView) findViewById(R.id.text_calc);

        TextView textView = new TextView(this);
        textViewA.setTextSize(40);
        textViewA.setText(message);

        //Why does this change the data displayed in the activity
        //Line below:
        // setContentView(textView);
    }
}



//package jasonantao.testappmock1;
//
//import android.content.Intent;
//import android.support.v7.app.AppCompatActivity;


//import android.os.Bundle;
//import android.widget.Button;
//import android.widget.TextView;
//
//public class DisplayCalc extends AppCompatActivity {
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_display_calc);
//
//        Intent intent = getIntent();
//        String message = intent.getStringExtra(DataEntry.EXTRA_MESSAGE);
//
//
//        TextView textViewA = (TextView) findViewById(R.id.text_calc);
//
//        TextView textView = new TextView(this);
//        textViewA.setTextSize(40);
//        textViewA.setText(message);
//
//        //Why does this change the data displayed in the activity
//        //Line below:
//       // setContentView(textView);
//    }
//}
