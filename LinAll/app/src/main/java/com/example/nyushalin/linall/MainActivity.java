package com.example.nyushalin.linall;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private int mCount;
    private TextView mShowCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void showToast(View view) {
        mCount += 10;
        mShowCount = findViewById(R.id.show_count);
        if (mShowCount != null) {
            mShowCount.setText(Integer.toString(mCount));
        }
        Context context = getApplicationContext();
        Toast toast = Toast.makeText(context, R.string.toast_message, Toast.LENGTH_LONG);
        toast.show();
    }

    public void countUp(View view) {
        mCount += 1;
        mShowCount = findViewById(R.id.show_count);
        if (mShowCount != null) {
            mShowCount.setText(Integer.toString(mCount));
        }
    }

    public void clear(View view) {
        if (mCount%2 != 0) {
            mCount = 0;
        }
        else{
            Context context = getApplicationContext();
            Toast clear = Toast.makeText(context, R.string.clear_message, Toast.LENGTH_LONG / 5);
            clear.show();
        }
        mShowCount = findViewById(R.id.show_count);
        if (mShowCount != null) {
            mShowCount.setText(Integer.toString(mCount));
        }
    }
}
