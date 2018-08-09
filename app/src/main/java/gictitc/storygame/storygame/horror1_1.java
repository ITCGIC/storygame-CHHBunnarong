package gictitc.storygame.storygame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class horror1_1 extends BaseGameActivity {
    Button back,keep;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_horror1_1);
    }

    public void go_back1(View view) {
        back=(Button)view;
        Intent i= new Intent(getApplicationContext(),horror2_1.class);
        startActivity(i);
        finish();
    }

    public void keep_going1(View view) {
    }
}
