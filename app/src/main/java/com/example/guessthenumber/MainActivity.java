package com.example.guessthenumber;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    int result;
    static int getRandomNumber( int max, int min)
    {
        return ( int )((Math.random()
                * (max - min)) + min);
    }
    public void makeToast(String str)
    {
        Toast.makeText(
                        MainActivity. this ,
                        str,
                        Toast.LENGTH_SHORT)
                .show();
    }
    public void clickFunction(View view)
    {
        int userGuessing;
        EditText variable = findViewById(R.id.editId);
        userGuessing = Integer.parseInt(
                variable
                        .getText()
                        .toString());
        if (userGuessing < result) {
            makeToast("Предложенное число больше. Попробуйте снова!");
        }
        else if (userGuessing > result) {
            makeToast("Предложенное число меньше. Попробуйте снова!");
        }
        else {
            makeToast(
                    "Поздравляем! Вы угадали число!" );
        }
    }
    @Override
    protected void onCreate(
            Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int min = 1 ;
        int max = 100 ;
        result = getRandomNumber(min, max);
    }
}