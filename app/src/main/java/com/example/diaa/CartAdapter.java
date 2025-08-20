package com.example.diaa;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class CartAdapter extends BaseAdapter {

    private Context context;
    private String[] productNames;
    private int[] productImages;

    public CartAdapter(Context context, String[] productNames, int[] productImages) {
        this.context = context;
        this.productNames = productNames;
        this.productImages = productImages;
    }

    @Override
    public int getCount() {
        return productNames.length;
    }

    @Override
    public Object getItem(int position) {
        return productNames[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.item_cart8, parent, false);
        }

        TextView textName = convertView.findViewById(R.id.text_name);
        ImageView imageProduct = convertView.findViewById(R.id.image_product);
        TextView textCount = convertView.findViewById(R.id.text_count);
        Button buttonPlus = convertView.findViewById(R.id.button_plus);
        Button buttonMinus = convertView.findViewById(R.id.button_minus);
        ImageButton buttonConfirm = convertView.findViewById(R.id.button_confirm);

        textName.setText(productNames[position]);
        imageProduct.setImageResource(productImages[position]);
        textCount.setText("1");

        buttonPlus.setOnClickListener(v -> {
            int count = Integer.parseInt(textCount.getText().toString());
            textCount.setText(String.valueOf(count + 1));
        });

        buttonMinus.setOnClickListener(v -> {
            int count = Integer.parseInt(textCount.getText().toString());
            if (count > 1) {
                textCount.setText(String.valueOf(count - 1));
            }
        });

        buttonConfirm.setOnClickListener(v -> {
            Toast.makeText(context, productNames[position] + " تم تأكيده", Toast.LENGTH_SHORT).show();
        });

        return convertView;
    }
}
