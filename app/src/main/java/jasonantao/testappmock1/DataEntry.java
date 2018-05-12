package jasonantao.testappmock1;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.AbsListView;

public class DataEntry extends AppCompatActivity {

    public final static String EXTRA_MESSAGE="com.example.testAppMock1.MESSAGE";
    //NOT SURE IF THE GREEN TEXT ABOVE IS CORRECT

    //Declaring Button
    float finalval = 0;
    float number;
    Button button;
    EditText edittext;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_data_entry);
        button = (Button) findViewById(R.id.button_calc);
        edittext = (EditText) findViewById(R.id.text_input);

//        button.setOnClickListener(new View.OnClickListener(){
//            public void onClick(View v){
//                //Take action for when button is clicked.
//                String input  = edittext.getText().toString();
//                number = Integer.parseInt(input);
//                finalval = 0.18f*number;
//                //Using intent to connect via an extra.
//                Intent intent = new Intent(DataEntry.this, RecipeDetailActivity.class);
//                String display = String.valueOf(finalval);
//                intent.putExtra(EXTRA_MESSAGE, display);
//                startActivity(intent);
//            }
//        });

        mListView = (ListView) findViewById(R.id.recipe_list_view);
// 1
//        final ArrayList<Recipe> recipeList = Recipe.getRecipesFromFile("recipes.json", this);
// 2
        final ArrayList<Recipe> recipeList = Recipe.getRecipesFromFile("recipes.json", this);
        RecipeAdapter adapter = new RecipeAdapter(this, recipeList);
        mListView.setAdapter(adapter);


        final Context context = this;
        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Recipe selectedRecipe = recipeList.get(position);

                Intent detailIntent = new Intent(context, BackupDisplay.class);

                detailIntent.putExtra("url", selectedRecipe.instructionUrl);

                startActivity(detailIntent);
            }

        });
    }

    private ListView mListView;


//    protected void sendMessage (View view) {
//
//        //Do something in response to the button being pressed.
//        Intent intent = new Intent(this, calc_view.class);
//        String display = String.valueOf(finalval);
//        intent.putExtra(EXTRA_MESSAGE, display);
//        startActivity(intent);
//    }
}



//package jasonantao.testappmock1;
//
//import android.content.Context;
//import android.content.Intent;
//import android.support.v7.app.AppCompatActivity;
//import android.os.Bundle;
//import android.view.View;
//import android.widget.AdapterView;
//import android.widget.ArrayAdapter;
//import android.widget.Button;
//import android.widget.EditText;
//import android.widget.ListView;
//
//import java.util.ArrayList;
//import android.os.Bundle;
//import android.view.Menu;
//import android.view.MenuItem;
//import android.widget.ArrayAdapter;
//import android.widget.ListAdapter;
//import android.widget.ListView;
//import android.widget.AbsListView;
//
//public class DataEntry extends AppCompatActivity {
//
//    public final static String EXTRA_MESSAGE="com.example.testAppMock1.MESSAGE";
//    //NOT SURE IF THE GREEN TEXT ABOVE IS CORRECT
//
//    //Declaring Button
//    float finalval = 0;
//    float number;
//    Button button;
//    EditText edittext;
//
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//
//        setContentView(R.layout.activity_data_entry);
//        button = (Button) findViewById(R.id.button_calc);
//        edittext = (EditText) findViewById(R.id.text_input);
//
//        button.setOnClickListener(new View.OnClickListener(){
//            public void onClick(View v){
//                //Take action for when button is clicked.
//                String input  = edittext.getText().toString();
//                number = Integer.parseInt(input);
//                finalval = 0.18f*number;
//                //Using intent to connect via an extra.
//                Intent intent = new Intent(DataEntry.this, DisplayCalc.class);
//                String display = String.valueOf(finalval);
//                intent.putExtra(EXTRA_MESSAGE, display);
//                startActivity(intent);
//            }
//        });
//
//        mListView = (ListView) findViewById(R.id.recipe_list_view);
//// 1
////        final ArrayList<Recipe> recipeList = Recipe.getRecipesFromFile("recipes.json", this);
//// 2
//        final ArrayList<Recipe> recipeList = Recipe.getRecipesFromFile("recipes.json", this);
//        RecipeAdapter adapter = new RecipeAdapter(this, recipeList);
//        mListView.setAdapter(adapter);
//
//
//        final Context context = this;
//        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//
//                Recipe selectedRecipe = recipeList.get(position);
//
//                Intent detailIntent = new Intent(context, RecipeDetailActivity.class);
//
//                detailIntent.putExtra("url", selectedRecipe.instructionUrl);
//
//                startActivity(detailIntent);
//            }
//
//        });
//    }
//
//    private ListView mListView;
//
//
////    protected void sendMessage (View view) {
////
////        //Do something in response to the button being pressed.
////        Intent intent = new Intent(this, calc_view.class);
////        String display = String.valueOf(finalval);
////        intent.putExtra(EXTRA_MESSAGE, display);
////        startActivity(intent);
////    }
//}
