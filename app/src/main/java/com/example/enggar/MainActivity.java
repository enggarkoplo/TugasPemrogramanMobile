package com.example.enggar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }


    public void cobabrowser(View view){
        String url= "https://www.youtube.com/";
        Intent bukaBrowser = new Intent(Intent.ACTION_VIEW);
        bukaBrowser.setData(Uri.parse(url));
        startActivity(bukaBrowser);
    }
    public void krosa(View view){
        String url= "https://doujindesu.xxx/";
        Intent biasaBrowser = new Intent(Intent.ACTION_VIEW);
        biasaBrowser.setData(Uri.parse(url));
        startActivity(biasaBrowser);
    }

    public void fb(View view){
        String url= "https://www.facebook.com/";
        Intent bukanBrowser = new Intent(Intent.ACTION_VIEW);
        bukanBrowser.setData(Uri.parse(url));
        startActivity(bukanBrowser);
    }


}