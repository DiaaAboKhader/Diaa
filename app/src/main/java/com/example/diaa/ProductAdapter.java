package com.example.diaa;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class ProductAdapter extends BaseAdapter {

    private Context context;
    private String[] names;
    private String[] prices;
    private int[] images;

    // Constructor
    public ProductAdapter(Context context, String[] names, String[] prices, int[] images) {
        this.context = context;
        this.names = names;
        this.prices = prices;
        this.images = images;
    }

    @Override
    public int getCount() {
        return names.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            LayoutInflater inflater = LayoutInflater.from(context);
            convertView = inflater.inflate(R.layout.product_card, parent, false);
        }

        ImageView img = convertView.findViewById(R.id.imageView5);
        TextView name = convertView.findViewById(R.id.textView9);
        TextView price = convertView.findViewById(R.id.button7);
        ImageButton btn = convertView.findViewById(R.id.button8);

        img.setImageResource(images[position]);
        name.setText(names[position]);
        price.setText(prices[position]);

        btn.setOnClickListener(v ->
                Toast.makeText(context, names[position] + " تم الاضافة للسلة", Toast.LENGTH_SHORT).show()
        );

        return convertView;
    }
}