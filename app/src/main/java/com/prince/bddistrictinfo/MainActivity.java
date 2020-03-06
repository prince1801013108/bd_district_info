package com.prince.bddistrictinfo;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.navigation.NavigationView;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    LinearLayout barisal,chittagong,dhaka,khulna,mymensing,rajshahi,rongpur,sylet;
    Intent intent;

    private AppBarConfiguration mAppBarConfiguration;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        mAppBarConfiguration = new AppBarConfiguration.Builder(
                R.id.nav_home, R.id.nav_gallery, R.id.nav_slideshow,
                R.id.nav_tools, R.id.nav_share, R.id.nav_send)
                .setDrawerLayout(drawer)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration);
        NavigationUI.setupWithNavController(navigationView, navController);

        barisal=findViewById(R.id.barisalDivisionId);
        chittagong=findViewById(R.id.chitagongDivisionId);
        dhaka=findViewById(R.id.dhakaDivisionId);
        khulna=findViewById(R.id.khulnaDivisionId);
        mymensing=findViewById(R.id.mymensingDivisionId);
        rajshahi=findViewById(R.id.rajshahiDivisionId);
        rongpur=findViewById(R.id.rongpurDivisionId);
        sylet=findViewById(R.id.syletDivisionId);

        barisal.setOnClickListener(this);
        chittagong.setOnClickListener(this);
        dhaka.setOnClickListener(this);
        khulna.setOnClickListener(this);
        mymensing.setOnClickListener(this);
        rajshahi.setOnClickListener(this);
        rongpur.setOnClickListener(this);
        sylet.setOnClickListener(this);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId()==R.id.action_settings){

        }


        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        return NavigationUI.navigateUp(navController, mAppBarConfiguration)
                || super.onSupportNavigateUp();
    }

    @Override
    public void onClick(View v) {
        if (v.getId()==R.id.barisalDivisionId){
            intent=new Intent(MainActivity.this,DistrictList.class);
            intent.putExtra("division","barisal");
            startActivity(intent);
        }
if (v.getId()==R.id.chitagongDivisionId){
            intent=new Intent(MainActivity.this,DistrictList.class);
            intent.putExtra("division","chittagong");
            startActivity(intent);
        }
if (v.getId()==R.id.dhakaDivisionId){
            intent=new Intent(MainActivity.this,DistrictList.class);
            intent.putExtra("division","dhaka");
            startActivity(intent);
        }
if (v.getId()==R.id.khulnaDivisionId){
            intent=new Intent(MainActivity.this,DistrictList.class);
            intent.putExtra("division","khulna");
            startActivity(intent);
        }
if (v.getId()==R.id.mymensingDivisionId){
            intent=new Intent(MainActivity.this,DistrictList.class);
            intent.putExtra("division","mymensing");
            startActivity(intent);
        }
if (v.getId()==R.id.rajshahiDivisionId){
            intent=new Intent(MainActivity.this,DistrictList.class);
            intent.putExtra("division","rajshahi");
            startActivity(intent);
        }
if (v.getId()==R.id.rongpurDivisionId){
            intent=new Intent(MainActivity.this,DistrictList.class);
            intent.putExtra("division","rongpur");
            startActivity(intent);
        }

        if (v.getId()==R.id.syletDivisionId){
            intent=new Intent(MainActivity.this,DistrictList.class);
            intent.putExtra("division","sylet");
            startActivity(intent);
        }

    }
}
