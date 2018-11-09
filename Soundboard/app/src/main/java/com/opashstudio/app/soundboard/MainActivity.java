package com.opashstudio.app.soundboard;

import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private ViewPager mSlideViewPager;
    private LinearLayout mDotLayout;

    private TextView[] mDots;

    private SliderAdapter sliderAdapter;

    private Button mNextBtn;
    private Button mBackBtn;
    private Button mFinishBtn;


    private int mCurrentPage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mSlideViewPager = (ViewPager) findViewById(R.id.slideViewPager);
        mDotLayout = (LinearLayout) findViewById(R.id.dotsLayout);

        mNextBtn = (Button) findViewById(R.id.nextbtn);
        mBackBtn = (Button) findViewById(R.id.backbtn);
        mFinishBtn = (Button) findViewById(R.id.finishbtn);


        sliderAdapter = new SliderAdapter(this);

        mSlideViewPager.setAdapter(sliderAdapter);
        addDotsIndicator(0);

        mSlideViewPager.addOnPageChangeListener(viewListener);



        //buttonclicks

        mNextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mSlideViewPager.setCurrentItem(mCurrentPage +1);

            }
        });

        mBackBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mSlideViewPager.setCurrentItem(mCurrentPage -1);
            }
        });

        mFinishBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMainApp();
            }

            private void openMainApp() {
                Intent myintent = new Intent(MainActivity.this, MainApp.class);
                startActivity(myintent);

            }
        });

    }






    public void addDotsIndicator(int position) {

        mDots = new TextView[3];
        mDotLayout.removeAllViews();

        for (int i = 0; i < mDots.length; i++) {
            mDots[i] = new TextView(this);
            mDots[i].setText(Html.fromHtml("&#8226;"));
            mDots[i].setTextSize(35);
            mDots[i].setTextColor(getResources().getColor(R.color.colorGrey));

            mDotLayout.addView(mDots[i]);

        }

        if (mDots.length >0){

            mDots[position].setTextColor(getResources().getColor(R.color.colorWhite ));

        }

    }


ViewPager.OnPageChangeListener viewListener = new ViewPager.OnPageChangeListener() {
    @Override
    public void onPageScrolled(int i, float v, int i1) {

    }

    @Override
    public void onPageSelected(int i) {

        addDotsIndicator(i);

        mCurrentPage = i;

        if (i == 0) {

            mNextBtn.setEnabled(true);
            mBackBtn.setEnabled(false);
            mFinishBtn.setEnabled(false);
            mBackBtn.setVisibility(View.INVISIBLE);
            mFinishBtn.setVisibility(View.INVISIBLE);

            mFinishBtn.setText("");
            mNextBtn.setText("Next");
            mBackBtn.setText("");
        } else if (i == mDots.length - 1) {

            mNextBtn.setEnabled(false);
            mBackBtn.setEnabled(true);
            mFinishBtn.setEnabled(true);
            mBackBtn.setVisibility(View.VISIBLE);
            mFinishBtn.setVisibility(View.VISIBLE);
            mNextBtn.setVisibility(View.INVISIBLE);

            mNextBtn.setText("");
            mFinishBtn.setText("Finish");
            mBackBtn.setText("Back");
        } else {
            mNextBtn.setEnabled(true);
            mBackBtn.setEnabled(true);
            mFinishBtn.setEnabled(false);

            mBackBtn.setVisibility(View.VISIBLE);
            mFinishBtn.setVisibility(View.INVISIBLE);


            mFinishBtn.setText("");
            mNextBtn.setText("Next");
            mBackBtn.setText("Back");

    }
}

    @Override
    public void onPageScrollStateChanged(int i) {

    }
};

}