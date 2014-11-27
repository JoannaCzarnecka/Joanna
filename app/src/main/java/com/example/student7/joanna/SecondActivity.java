package com.example.student7.joanna;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;



public class SecondActivity extends ActionBarActivity {

    private TextView powitanie;
    private TextView sila;
    private ProgressBar pasek;
    private EditText numer;

@Override

    protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_second);
    powitanie=(TextView) findViewById(R.id.powitanie);
    numer=(EditText) findViewById(R.id.numer);
    Bundle extras = getIntent().getExtras();
    String username = extras.getString("username");
    powitanie.setText("Cześć " + username + "!");
}

    public void zadzwonClicked(View view) {
        String tel = numer.getText().toString();
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:" + tel));
        startActivity(intent);
    }



    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
