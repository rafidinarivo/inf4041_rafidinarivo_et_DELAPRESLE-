package org.esiea.rafidinarivo_alexandre_delapresle_alexis.projetmobile;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
//add the import statements here to import the Button, TextView and View classes
import android.widget.Button;
import android.widget.TextView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    String myString2 ="Vous etes dans notre présentation du personnage";
    String myString = "Merci d'être passé";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void init(View v) {

        Intent i = new Intent(MainActivity.this, Activity2.class);
        startActivity(i);
        Toast.makeText(getApplicationContext(),myString2,Toast.LENGTH_LONG).show();
    }

    public void browser2(View view) {
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.esiea.fr"));
        startActivity(browserIntent);
    }



    public void dialogevent(View view){
        Toast.makeText(getApplicationContext(),myString,Toast.LENGTH_LONG).show();
        new AlertDialog.Builder(this)
                .setTitle("Exit")
                .setMessage("Voulez vous vraiment quitter l'appli?")
                .setNegativeButton("Non",null)

                //Toast.makeText(getApplicationContext(),myString2,Toast.LENGTH_LONG).show();


                .setPositiveButton("Oui", new DialogInterface.OnClickListener(){

                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        int p = android.os.Process.myPid();
                        android.os.Process.killProcess(p);
                    }


                }).create().show();

    }




}


