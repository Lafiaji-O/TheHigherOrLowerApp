package com.example.thehigherorlowerapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int randomNumber, guessNumber;
    String name;

    public void makeText (String string) {

        Toast.makeText(MainActivity.this, name + string, Toast.LENGTH_LONG).show();
    }

    public void guess (View view) {

        EditText nameText = (EditText) findViewById(R.id.nameText);
        EditText guessText = (EditText) findViewById(R.id.guessText);

        name = nameText.getText().toString();
        guessNumber = Integer.parseInt(guessText.getText().toString());

        if (guessNumber < 1) {

            makeText(", enter a number between 1 and 20");

        } else if (guessNumber > 20) {

            makeText(", enter a number between 1 and 20");

        } else if (guessNumber > randomNumber) {

            makeText(", try a lower number :)");

        } else  if (guessNumber < randomNumber) {

            makeText(", try a higher number :)");

        } else {

            makeText(", yes!! that's it!! Let's try that again :D");

            ImageView imageView = (ImageView) findViewById(R.id.imageView);
            imageView.setImageResource(R.drawable.cat2);

            Random random = new Random();

            randomNumber = random.nextInt(21);

        }

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Random random = new Random();
        randomNumber = random.nextInt(21);
    }
}
