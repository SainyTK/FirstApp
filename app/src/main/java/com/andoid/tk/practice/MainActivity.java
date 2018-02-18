package com.andoid.tk.practice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    Button one,two,three,four,five,six,seven,eight,nine,sendBtn;
    TextView tvBuffer,tvOutput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        one = findViewById(R.id.one);
        two = findViewById(R.id.two);
        three = findViewById(R.id.three);
        four = findViewById(R.id.four);
        five = findViewById(R.id.five);
        six = findViewById(R.id.six);
        seven = findViewById(R.id.seven);
        eight = findViewById(R.id.eight);
        nine = findViewById(R.id.nine);
        sendBtn = findViewById(R.id.sendBtn);
        tvBuffer = findViewById(R.id.tvBuffer);
        tvOutput = findViewById(R.id.tvOutput);
    }

    public void sendNumberOne(View v)
    {
        tvBuffer.setText(tvBuffer.getText() + "" +one.getText());
    }
    public void sendNumberTwo(View v)
    {
        tvBuffer.setText(tvBuffer.getText() + "" +two.getText());
    }
    public void sendNumberThree(View v)
    {
        tvBuffer.setText(tvBuffer.getText() + "" +three.getText());
    }
    public void sendNumberFour(View v)
    {
        tvBuffer.setText(tvBuffer.getText() + "" +four.getText());
    }
    public void sendNumberFive(View v)
    {
        tvBuffer.setText(tvBuffer.getText() + "" +five.getText());
    }
    public void sendNumberSix(View v)
    {
        tvBuffer.setText(tvBuffer.getText() + "" +six.getText());
    }
    public void sendNumberSeven(View v)
    {
        tvBuffer.setText(tvBuffer.getText() + "" +seven.getText());
    }
    public void sendNumberEight(View v)
    {
        tvBuffer.setText(tvBuffer.getText() + "" + eight.getText());
    }
    public void sendNumberNine(View v)
    {
        tvBuffer.setText(tvBuffer.getText() + "" +nine.getText());
    }
    public void sendMessage(View v)
    {
        tvOutput.setText(tvOutput.getText() + " " + tvBuffer.getText());
    }
}
