package tctkosen.com.androidsunshineapp;

import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class FindByIdSample extends AppCompatActivity {
    TextView textView;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_by_id_sample);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        textView = (TextView) findViewById(R.id.textView);
        editText = (EditText) findViewById(R.id.editText);

        textView.setText("EditText set color with old style");
        editText.setTextColor(getResources().getColor(R.color.colorPrimary));

        textView.setText("TextView set color with new style");
        textView.setTextColor(ContextCompat.getColor(getApplicationContext(),R.color.colorAccent));

    }

    public void btn_click(View v){
        Toast.makeText(getApplicationContext(),"Button  clicked",Toast.LENGTH_SHORT).show();
    }

    public void btn_click2(View v){
        Snackbar.make(v, "Button2 clicked", Snackbar.LENGTH_LONG).setAction("Action", null).show();
    }
}
