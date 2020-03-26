package com.example.beehyr;

import android.media.Image;

public class product {
    private String text1,text2,text3;
    private int im;

    public product(String text1, String text2, String text3, int im) {
        this.text1 = text1;
        this.text2 = text2;
        this.text3 = text3;
        this.im = im;
    }

    public String getText1() {
        return text1;
    }

    public String getText2() {
        return text2;
    }

    public String getText3() {
        return text3;
    }

    public int getIm() {
        return im;
    }
}
