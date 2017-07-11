package com.example.asus_pc.popudwindowsdemo21;

import android.animation.ObjectAnimator;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.ContextMenu;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupWindow;
import android.widget.Toast;

import static android.os.Build.VERSION_CODES.M;
import static android.view.View.inflate;

public class MainActivity extends AppCompatActivity {

    private Button button4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button4 = (Button) findViewById(R.id.button4);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add("添加");
        menu.add("杀出");
        return super.onCreateOptionsMenu(menu);

    }
}