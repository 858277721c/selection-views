package com.sd.lib.selection.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

public class FTabMenu extends FrameLayout
{
    public FTabMenu(Context context)
    {
        super(context);
        init();
    }

    public FTabMenu(Context context, AttributeSet attrs)
    {
        super(context, attrs);
        init();
    }

    public ImageView iv_image;
    public TextView tv_text;

    protected void init()
    {
        LayoutInflater.from(getContext()).inflate(R.layout.lib_selection_views_view_tab_menu, this, true);
        iv_image = findViewById(R.id.iv_image);
        tv_text = findViewById(R.id.tv_text);
    }
}
