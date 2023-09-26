package com.bryle_sanico.mobdevanimation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void actionBtn(View view) {
        String buttonText = ((Button) view).getText().toString();
        switch (buttonText){
            case "Clockwise":
                clockwise(view);
                Toast.makeText(this, "Clockwise", Toast.LENGTH_SHORT).show();
                break;
            case "Zoom":
                zoom(view);
                Toast.makeText(this, "Zoom", Toast.LENGTH_SHORT).show();
                break;
            case "Fade":
                fade(view);
                Toast.makeText(this, "Fade", Toast.LENGTH_SHORT).show();
                break;
            case "Blink":
                blink(view);
                Toast.makeText(this, "Blink", Toast.LENGTH_SHORT).show();
                break;
            case "Move":
                move(view);
                Toast.makeText(this, "Move", Toast.LENGTH_SHORT).show();
                break;
            case "Slide":
                slide(view);
                Toast.makeText(this, "Slide", Toast.LENGTH_SHORT).show();
                break;
            default:
                Toast.makeText(this, "Invalid!", Toast.LENGTH_SHORT).show();
                break;
        }
    }
    public void clockwise(View view) {
        ImageView image = (ImageView) findViewById(R.id.imageView);
        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.clockwise);
        image.startAnimation(animation);
    }

    public void zoom(View view) {
        ImageView image = (ImageView) findViewById(R.id.imageView);
        Animation animation1 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.zoom);
        image.startAnimation(animation1);
    }

    public void fade(View view) {
        ImageView image = (ImageView) findViewById(R.id.imageView);
        Animation animation1 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade);
        image.startAnimation(animation1);
    }

    public void blink(View view) {
        ImageView image = (ImageView) findViewById(R.id.imageView);
        Animation animation1 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.blink);
        image.startAnimation(animation1);
    }

    public void move(View view) {
        ImageView image = (ImageView) findViewById(R.id.imageView);
        Animation animation1 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.move);
        image.startAnimation(animation1);
    }

    public void slide(View view) {
        ImageView image = (ImageView) findViewById(R.id.imageView);
        Animation animation1 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.slide);
        image.startAnimation(animation1);
    }

}