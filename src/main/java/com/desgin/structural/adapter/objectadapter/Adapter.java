package com.desgin.structural.adapter.objectadapter;

/**
 * Created by geely
 */
public class Adapter implements MediaPlayer {

    private NewMediaPlayer newMediaPlayer = new NewMediaPlayer();

    @Override
    public void play() {
        newMediaPlayer.adapteePlay();
    }
}
