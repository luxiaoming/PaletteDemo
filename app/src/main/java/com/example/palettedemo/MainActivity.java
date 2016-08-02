package com.example.palettedemo;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.support.v4.graphics.ColorUtils;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.graphics.Palette;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView Vibrant;
    private TextView Vibrantdark;
    private TextView Vibrantlight;
    private TextView Muted;
    private TextView Muteddark;
    private TextView Mutedlight;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Palette palette =
                Palette.from(BitmapFactory.decodeResource(getResources(), R.drawable.demo))
                        .generate();

//        Palette.from(BitmapFactory.decodeResource(getResources(), R.drawable.demo))
//                .generate(new Palette.PaletteAsyncListener() {
//                    @Override
//                    public void onGenerated(Palette palette) {
//
//                    }
//                });


        Vibrant = (TextView) findViewById(R.id.Vibrant);
        Vibrantdark = (TextView) findViewById(R.id.Vibrantdark);
        Vibrantlight = (TextView) findViewById(R.id.Vibrantlight);
        Muted = (TextView) findViewById(R.id.Muted);
        Muteddark = (TextView) findViewById(R.id.Muteddark);
        Mutedlight = (TextView) findViewById(R.id.Mutedlight);

        Palette.Swatch swatch=palette.getVibrantSwatch();

        if(swatch!=null) {

            Vibrant.setBackgroundColor(swatch.getRgb());
            Vibrant.setTextColor(swatch.getBodyTextColor());
        }

        swatch=palette.getLightVibrantSwatch();
        if(swatch!=null) {
            Vibrantlight.setBackgroundColor(swatch.getRgb());
            Vibrantlight.setTextColor(swatch.getBodyTextColor());
        }
        swatch=palette.getDarkVibrantSwatch();
        if(swatch!=null) {
            Vibrantdark.setBackgroundColor(swatch.getRgb());
            Vibrantdark.setTextColor(swatch.getBodyTextColor());
        }
        swatch=palette.getMutedSwatch();
        if(swatch!=null) {
            Muted.setBackgroundColor(swatch.getRgb());
            Muted.setTextColor(swatch.getBodyTextColor());
        }
        swatch=palette.getLightMutedSwatch();
        if(swatch!=null) {
            Mutedlight.setBackgroundColor(swatch.getRgb());
            Mutedlight.setTextColor(swatch.getBodyTextColor());
        }

        swatch=palette.getDarkMutedSwatch();
        if(swatch!=null) {
            Muteddark.setBackgroundColor(swatch.getRgb());
            Muteddark.setTextColor(swatch.getBodyTextColor());
        }
    }
}
