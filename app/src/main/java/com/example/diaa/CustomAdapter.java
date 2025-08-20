package com.example.diaa;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
public class CustomAdapter extends BaseAdapter {
    private Context context;
    private int count;
    private int[] images = {R.drawable.home, R.drawable.secondhome, R.drawable.thirdhome, R.drawable.rectangler};
    private String[] texts = {"modern bedroom", "modern bedroom", "modern bedroom", "modern bedroom"};

    public CustomAdapter(Context context, int count) {
        this.context = context;
        this.count = count;
    }

    @Override
    public int getCount() {
        return count; // كم كارت
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
            convertView = inflater.inflate(R.layout.employee_persons_desgn, parent, false);
        }

        ImageView imageView = convertView.findViewById(R.id.imageView5);
        TextView textView = convertView.findViewById(R.id.textView9);

        if(position < images.length) {
            imageView.setImageResource(images[position]);
            textView.setText(texts[position]);
        }

        return convertView;
    }
}
