package com.example.android.myappsportfolio.app;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // The following lines of code  is how I managed to
    // display the message when a button is clicked. The code reviewer from Audacity suggested
    // that I use a Toast method that displays the appropriate strings stored in each button
    // in the string.xml file. In a second commit, I will change to code to incorporate
    // these suggestions. This represents my best effort on my first submission. :-)
    // Also, he suggested to use colors.xml for the button background colors. I will do that
    // on the second commit.

    // Button 1

    public void sendMessageButton1(View view){
        displayMessageButton1("This button will launch SPOTIFY STREAMER");
    }

    private void displayMessageButton1(String message1){
        TextView quantityTextView = (TextView) findViewById(R.id.button1);
        quantityTextView.setText("" + message1);
    }

    // Button 2

    public void sendMessageButton2(View view){
        displayMessageButton2("This button will launch SCORES APP");
    }

    private void displayMessageButton2(String message2){
        TextView quantityTextView = (TextView) findViewById(R.id.button2);
        quantityTextView.setText("" + message2);
    }

    // Button 3

    public void sendMessageButton3(View view){
        displayMessageButton3("This button will launch LIBRARY APP!");
    }

    private void displayMessageButton3(String message3){
        TextView quantityTextView = (TextView) findViewById(R.id.button3);
        quantityTextView.setText("" + message3);
    }

    // Button 4

    public void sendMessageButton4(View view){
        displayMessageButton4("This button will launch BUILD IT BIGGER");
    }

    private void displayMessageButton4(String message4){
        TextView quantityTextView = (TextView) findViewById(R.id.button4);
        quantityTextView.setText("" + message4);
    }

    // Button 5

    public void sendMessageButton5(View view){
        displayMessageButton5("This button will launch XYZ READER");
    }

    private void displayMessageButton5(String message5){
        TextView quantityTextView = (TextView) findViewById(R.id.button5);
        quantityTextView.setText("" + message5);
    }

    // Button 6

    public void sendMessageButton6(View view){
        displayMessageButton6("This button will launch MY CAPSTONE APP!");
    }

    private void displayMessageButton6(String message6){
        TextView quantityTextView = (TextView) findViewById(R.id.button6);
        quantityTextView.setText("" + message6);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
