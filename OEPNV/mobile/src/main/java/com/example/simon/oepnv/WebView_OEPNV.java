package com.example.simon.oepnv;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class WebView_OEPNV extends AppCompatActivity {
    WebView myWV;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view__oepnv);

            myWV = (WebView)findViewById(R.id.webView);
            myWV.loadUrl("http://maps.google.com/maps/api/staticmap?center=48.141423,11.567707&zoom=17&size=1024x1024&maptype=roadmap&markers=color:black|label:H|48.142654,11.568597&markers=color:green|label:S|48.139331,11.566018&markers=color:blue|label:U|48.140257,11.568051&markers=color:blue|label:U|48.139214,11.566429&markers=color:red|label:T|48.142271,11.567749&markers=color:red|label:T|48.140961,11.568210&sensor=false");


    }
}
