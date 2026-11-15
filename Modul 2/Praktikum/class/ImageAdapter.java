package com.example.modul2;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class ImageAdapter extends BaseAdapter {

    private Context mContext;

    // Array 15 warna berbeda (menggunakan kode hex / warna sistem)
    public Integer[] mColors = {
            Color.parseColor("#F44336"), // 1. Red
            Color.parseColor("#E91E63"), // 2. Pink
            Color.parseColor("#9C27B0"), // 3. Purple
            Color.parseColor("#673AB7"), // 4. Deep Purple
            Color.parseColor("#3F51B5"), // 5. Indigo
            Color.parseColor("#2196F3"), // 6. Blue
            Color.parseColor("#03A9F4"), // 7. Light Blue
            Color.parseColor("#00BCD4"), // 8. Cyan
            Color.parseColor("#009688"), // 9. Teal
            Color.parseColor("#4CAF50"), // 10. Green
            Color.parseColor("#8BC34A"), // 11. Light Green
            Color.parseColor("#FFEB3B"), // 12. Yellow
            Color.parseColor("#FF9800"), // 13. Orange
            Color.parseColor("#FF5722"), // 14. Deep Orange
            Color.parseColor("#795548")  // 15. Brown
    };

    // Constructor
    public ImageAdapter(Context c) {
        mContext = c;
    }

    @Override
    public int getCount() {
        return mColors.length;
    }

    @Override
    public Object getItem(int position) {
        return mColors[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView;

        if (convertView == null) {
            imageView = new ImageView(mContext);
            imageView.setLayoutParams(new GridView.LayoutParams(200, 200));
            imageView.setPadding(8, 8, 8, 8);
        } else {
            imageView = (ImageView) convertView;
        }

        // Menanti warna background kotak sesuai urutan array
        imageView.setBackgroundColor(mColors[position]);
        return imageView;
    }
}