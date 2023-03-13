package com.example.shopping;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomListAdapter extends ArrayAdapter<ShoppingItem> {

    private Context context;
    private ArrayList<ShoppingItem> itemList;

    public CustomListAdapter(Context context, ArrayList<ShoppingItem> itemList) {
        super(context, 0, itemList);
        this.context = context;
        this.itemList = itemList;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.shopping_item_layout, parent, false);
        }

        TextView itemTextView = convertView.findViewById(R.id.item_text_view);
        CheckBox itemCheckBox = convertView.findViewById(R.id.item_checkbox);

        ShoppingItem currentItem = itemList.get(position);

        itemTextView.setText(currentItem.getName());
        itemCheckBox.setChecked(currentItem.isBought());

        return convertView;
    }
}