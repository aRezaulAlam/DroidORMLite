package com.agroho.droidormlite;

import android.content.Context;

import com.j256.ormlite.dao.Dao;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by rezaul on 2016-09-04.
 * arezaulalam@gmail.com
 * www.agroho.com
 */
public class ItemDao {

    DatabaseHelper helper;
    Dao<Item,Integer> itemDao = null;

    public ItemDao(DatabaseHelper helper){
    this.helper = helper;

    }

    public void createItem(Item item){



        try {
            itemDao = helper.getItemDao();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        try {
            itemDao.create(item);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public List<Item> getAllItems(){

        try {
            itemDao = helper.getItemDao();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            final List<Item> itemList = itemDao.queryForAll();
            return itemList;
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }
}
