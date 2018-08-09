package gictitc.storygame.storygame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button horror, Sci, Dra;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void horor(View view) {
        horror = (Button)view;
        Intent i = new Intent(getApplicationContext(), horor.class);
        startActivity(i);
        finish();
    }

    public void science(View view) {
        Sci = (Button)view;
        Intent i = new Intent(getApplicationContext(), science_fi.class);
        startActivity(i);
        finish();
    }

    public void drama(View view) {
        Dra = (Button)view;
        Intent i = new Intent(getApplicationContext(), drama_story.class);
        startActivity(i);
        finish();
    }
}
