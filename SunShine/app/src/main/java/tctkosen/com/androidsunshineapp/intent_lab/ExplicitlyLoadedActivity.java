package tctkosen.com.androidsunshineapp.intent_lab;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import tctkosen.com.androidsunshineapp.R;

public class ExplicitlyLoadedActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explicitly_loaded);
    }
}
