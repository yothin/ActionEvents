package com.dizcode.events;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // ตัวแปรแบบ global
    private ImageView mImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // ตัวแปรแบบ local
        // Textview click
        // จะพักมาเก็บแบบตัวแปร แบบ local ก่อนก็ได้
        TextView textView = findViewById(R.id.textview);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplication(), "TextView clicked", Toast.LENGTH_LONG).show();
            }
        });

        // Button click
        // หรือใช้แบบ Chain ห่วงโซ่ไปเลยก็ได้ แบบนี้จะสั้น แต่ถ้าเราต้องการตัวแปรไปใช้ต่อในอนาคต
        // จำทำไม่ได้ ต้องเอามาพักเก็บไว้ก่อน แบบ global ของ ImageView
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplication(), "Button clicked", Toast.LENGTH_LONG).show();
            }
        });

        // ImageView click
        // ใช้พักเก็บแบบตัวแปร global
        mImageView = findViewById(R.id.imageview);
        mImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplication(), "ImageView clicked", Toast.LENGTH_LONG).show();
            }
        });

        // ImageButton
        findViewById(R.id.imagebutton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplication(), "ImageButton clicked", Toast.LENGTH_LONG).show();
            }
        });

        // Switch click
        Switch switchView = findViewById(R.id.switchcontrol);
        switchView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // เราเช็คได้ว่า User กด true หรือ false เพื่อใช้ในการคำนวนต่อไป
                Boolean isChecked = switchView.isChecked();
                Toast.makeText(getApplication(), "Switch is check : " +(isChecked ? "true" : "false"), Toast.LENGTH_LONG).show();
            }
        });

        // Checkbox click
        CheckBox checkBox = findViewById(R.id.checkbox);
        checkBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Boolean isChecked = checkBox.isChecked();
                Toast.makeText(getApplication(), "CheckBox is check : " +(isChecked ? "true" : "false"), Toast.LENGTH_LONG).show();
            }
        });



    }
}