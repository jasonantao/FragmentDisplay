package jasonantao.testappmock1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

import jasonantao.testappmock1.fragments.WebViewFrag;
//Called BackupDisplay for activity name

public class BackupDisplay extends AppCompatActivity {

    Bundle bundle = new Bundle();
    private String mParam1;
    private String mParam2;

    //Webview Added Below
    private WebView mWebView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_backup_display);
        String url = this.getIntent().getExtras().getString("url");




        }


    }
//Need to create fragment in onCreate


}