package org.ieselcaminas.pmdm.fragmentsstatic1;

import android.content.res.Configuration;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager fragmentManager = getSupportFragmentManager( );
        FragmentTransaction
                fragmentTransaction = fragmentManager.beginTransaction( );
        if (
                getResources().getConfiguration().orientation
                        ==
                        Configuration.ORIENTATION_LANDSCAPE) {   //---landscape mode---
            Fragment1 fragment1 = new Fragment1( );
            fragmentTransaction.replace(android.R.id.content, fragment1);
        } else {      //---portrait mode---
            Fragment2 fragment2 = new Fragment2( );
            fragmentTransaction.replace(android.R.id.content, fragment2);
        }
        fragmentTransaction.commit();
    }
}
