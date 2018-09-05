package com.sd.lib.selection.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.TextView;

public class FTabText extends FrameLayout
{
    public FTabText(Context context)
    {
        super(context);
        init();
    }

    public FTabText(Context context, AttributeSet attrs)
    {
        super(context, attrs);
        init();
    }

    public TextView tv_text;

    protected void init()
    {
        LayoutInflater.from(getContext()).inflate(R.layout.lib_selection_views_view_tab_text, this, true);
        tv_text = findViewById(R.id.tv_text);
    }
}
