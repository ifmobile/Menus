package com.example.professor.menus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.PopupMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, PopupMenu.OnMenuItemClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton imageButton = findViewById(R.id.imageButton);
        imageButton.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.action_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.action_previous){
            //Toast.makeText(this, R.string.previous, Toast.LENGTH_SHORT).show();
            startActivity(new Intent(this, Tela1Activity.class));

        } else if (item.getItemId() == R.id.action_next){
            //Toast.makeText(this, R.string.next, Toast.LENGTH_SHORT).show();
            startActivity(new Intent(this, Tela2Activity.class));

        } else if (item.getItemId() == R.id.act_settings){
            Toast.makeText(this, R.string.settings, Toast.LENGTH_SHORT).show();

        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        PopupMenu popupMenu = new PopupMenu(this, v);
        popupMenu.inflate(R.menu.popup);
        popupMenu.setOnMenuItemClickListener(this);
        popupMenu.show();
    }

    @Override
    public boolean onMenuItemClick(MenuItem menuItem) {
        if (menuItem.getItemId() == R.id.action_zoomin){
            Toast.makeText(this, R.string.zoom_in, Toast.LENGTH_SHORT).show();
            return true;
        }
        else if (menuItem.getItemId() == R.id.action_zoomout){
            Toast.makeText(this, R.string.zoom_out, Toast.LENGTH_SHORT).show();
            return true;
        }
        return false;
    }
}
