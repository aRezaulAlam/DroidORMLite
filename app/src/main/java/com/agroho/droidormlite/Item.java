package com.agroho.droidormlite;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

/**
 * Created by rezaul on 2016-09-03.
 * arezaulalam@gmail.com
 * www.agroho.com
 */
@DatabaseTable(tableName = Item.TABLE_NAME_ITEM)
public class Item {

    public static final String TABLE_NAME_ITEM = "item";
    public static final String FIELD_NAME_ITEM_ID = "item_id";
    public static final String FIELD_NAME_ITEM_NAME = "item_name";
    public static final String FIELD_NAME_ITEM_DETAILS = "item_details";

    @DatabaseField(columnName = FIELD_NAME_ITEM_ID, generatedId = true)
    private int itemId;

    @DatabaseField(columnName = FIELD_NAME_ITEM_NAME)
    private String itemName;

    @DatabaseField(columnName = FIELD_NAME_ITEM_DETAILS)
    private String itemDetails;

    public Item(){

    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemDetails() {
        return itemDetails;
    }

    public void setItemDetails(String itemDetails) {
        this.itemDetails = itemDetails;
    }
}
