package com.opashstudio.app.soundboard;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class SliderAdapter extends PagerAdapter {

    Context context;
    LayoutInflater layoutInflater;

    public SliderAdapter(Context context){
            this.context = context;

    }

        public int[] slide_images = {
            R.drawable.stronglanguage2,
            R.drawable.information2,
            R.drawable.warning_errors,
        };

    public String[] slide_heading = {
            "Strong Language",
            "Streamer Information",
            "MainActivity warning"
    };


    public String[] slide_descs = {

            "WARNING: THE FOLLOWING CONTENT MAY CONTAIN ELEMENTS THAT ARE NOT SUITABLE FOR SOME AUDIENCES, ACCORDINGLY VIEWER DISCRETION IS ADVISED",
            "Twitch.tv streamer by the handle Sweet_Anita that suffers from tourette's syndrome",
            "This app is still in its early stage, some bugs may occur, please notify the developers of such. Some bugs get fixed just by restarting the app."+
                    "Sounds may stop working if pressed too many times, but gets fixed with a restart"
    };






    @Override
    public int getCount() {
        return slide_heading.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {
        return view == (RelativeLayout) o;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {

        layoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.slide_layout,container,false );

        ImageView slideImageView = (ImageView) view.findViewById(R.id.slide_image);
        TextView slideHeading = (TextView) view.findViewById(R.id.slide_heading);
        TextView slideDescription = (TextView) view.findViewById(R.id.slide_desc);

        slideImageView.setImageResource(slide_images[position]);
        slideHeading.setText(slide_heading[position]);
        slideDescription.setText(slide_descs[position]);

        container.addView(view);

        return view;

    }


    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {

        container.removeView((RelativeLayout)object);

    }
}
