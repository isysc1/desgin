package com.desgin.structural.adapter.classadapter;

/**
 * Created by geely
 */
public class Adapter extends NewMediaPlayer implements MediaPlayer {
    @Override
    public void play() {
        //...
        super.adapteePlay();
        //...
    }
}
