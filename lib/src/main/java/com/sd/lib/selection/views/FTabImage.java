package com.sd.lib.selection.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.ImageView;

public class FTabImage extends FrameLayout
{
    public FTabImage(Context context)
    {
        super(context);
        init();
    }

    public FTabImage(Context context, AttributeSet attrs)
    {
        super(context, attrs);
        init();
    }

    public ImageView iv_image;

    protected void init()
    {
        LayoutInflater.from(getContext()).inflate(R.layout.lib_selection_views_view_tab_image, this, true);
        iv_image = findViewById(R.id.iv_image);
    }
}
