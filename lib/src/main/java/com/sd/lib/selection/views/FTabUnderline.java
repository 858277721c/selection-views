package com.sd.lib.selection.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class FTabUnderline extends LinearLayout
{
    public TextView tv_text;
    public View view_underline;

    public FTabUnderline(Context context, AttributeSet attrs)
    {
        super(context, attrs);
        setGravity(Gravity.CENTER);
        LayoutInflater.from(getContext()).inflate(R.layout.lib_selection_views_view_tab_underline, this, true);
        tv_text = findViewById(R.id.tv_text);
        view_underline = findViewById(R.id.view_underline);
    }
}
