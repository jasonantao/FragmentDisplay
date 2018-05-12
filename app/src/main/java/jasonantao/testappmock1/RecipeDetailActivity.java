package jasonantao.testappmock1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by ANTAOJ8 on 5/4/2018.
 */

public class RecipeDetailActivity extends AppCompatActivity {

    Bundle bundle = new Bundle();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String url = this.getIntent().getExtras().getString("url");


    }
//Need to create fragment in onCreate


}




//package jasonantao.testappmock1;


//
//import android.os.Bundle;
//import android.support.v7.app.AppCompatActivity;
//
///**
// * Created by ANTAOJ8 on 5/4/2018.
// */
//
//public class RecipeDetailActivity extends AppCompatActivity {
//
//    Bundle bundle = new Bundle();
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        String url = this.getIntent().getExtras().getString("url");
//
//
//    }
////Need to create fragment in onCreate
//
//
//}
