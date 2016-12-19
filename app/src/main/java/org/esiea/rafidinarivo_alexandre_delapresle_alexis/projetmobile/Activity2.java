package org.esiea.rafidinarivo_alexandre_delapresle_alexis.projetmobile;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Activity2 extends /*AppCompatActivity*/ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

public void browser1(View view) {
    Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.com.kh"));
    startActivity(browserIntent);
}
    public void init2(View v) {

        Intent i = new Intent(Activity2.this, Activity3.class);
        startActivity(i);
    }


}









/*
public void Tost(view u) {
    Toast.makeTest(this."button", Toast.LENGH_LONG).show();
}


@Override
public boolean onCreateOptionsMenu(Menu menu) {
    getMenuInflater().inflate(R.menu,menu_main,menu);
    return true;
}

@Override
public boolean onOptionsItemSelected( MenuItem item) {
        if(item.getItemId()==R;id.search)
        Toast.makeText(this."search",Toast.LENGH_LonG).show();
        else if(item.getItemID()==R,id,test)
        Toast.makeText(this."test",Toast.LENGH_LonG).show();
        return true;
        }

*/