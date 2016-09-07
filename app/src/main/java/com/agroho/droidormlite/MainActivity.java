package com.agroho.droidormlite;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.j256.ormlite.dao.Dao;

import java.sql.SQLException;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DatabaseHelper databaseHelper = new DatabaseHelper(this);
        ItemDao itemDao = new ItemDao(databaseHelper);


        for (int i=0; i<10; i++){
            Item item = new Item();
            item.setItemName("Potato"+i);
            item.setItemDetails("Potato is Vegetable"+i);
            itemDao.createItem(item);
        }

        List<Item> lists = itemDao.getAllItems();

        int j = 1;
        for (Item singleIitem : lists){
            Log.d("Items"+j+": ",singleIitem.getItemName());
            j++;
        }


    }
}
