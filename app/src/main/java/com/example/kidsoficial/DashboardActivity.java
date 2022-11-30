package com.example.kidsoficial;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class DashboardActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_dashboard );

        Intent in = new Intent(DashboardActivity.this, DashboardActivity.class);
        startActivity(in);

    }

}
