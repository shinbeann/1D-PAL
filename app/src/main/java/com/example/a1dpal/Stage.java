package com.example.a1dpal;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public interface Stage {

    void addData(String name, String path);

    void addData(String name, Bitmap bitmapImage, Context context);
    void removeData(int position);

    String getName(int i);

    String getPath(int i);
    void putImageOnImageView(int i, ImageView imageView);

    void putNameOnTextView(int i, TextView textView);

    int getSize();
}