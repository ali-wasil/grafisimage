package com.example.soal7_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.opengl.GLSurfaceView;
import android.os.Bundle;
import android.view.Menu;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button tekan;
    private GLSurfaceView grafik1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tekan=(Button)findViewById(R.id.button1);
        grafik1 = new HelloESSurfaceView (this);
        setContentView(grafik1);
    }

    @Override
    protected void onPause() {
        super.onPause();
        grafik1.onPause();
    }

    @Override
    protected void onResume() {
        super.onResume();
        grafik1.onResume();
    }
    class HelloESSurfaceView extends GLSurfaceView {
        public HelloESSurfaceView(Context context){
            super(context);
            setRenderer(new segitiga());
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.mainactivity,menu);
        return true;
    }
}
