package com.example.user.bottomnavg;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomNavigationView b= (BottomNavigationView)findViewById(R.id.navigation);
        b.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch(menuItem.getItemId())
                {
                    case R.id.home:
                        Toast.makeText(MainActivity.this,"home is press",Toast.LENGTH_LONG).show();
                        break;
                    case R.id.forum:
                        Toast.makeText(MainActivity.this,"forum is press",Toast.LENGTH_LONG).show();
                        break;
                    case R.id.battle:
                        Toast.makeText(MainActivity.this,"battle is press",Toast.LENGTH_LONG).show();
                        break;
                    case R.id.learn:
                        Toast.makeText(MainActivity.this,"learn is press",Toast.LENGTH_LONG).show();
                        break;
                    case R.id.profile:
                        Toast.makeText(MainActivity.this,"profile is press",Toast.LENGTH_LONG).show();
                        break;

                }
                return false;
            }
        });


    }
}
