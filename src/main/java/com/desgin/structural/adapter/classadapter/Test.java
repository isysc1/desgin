package com.desgin.structural.adapter.classadapter;

/**
 * Created by geely
 */
public class Test {
    public static void main(String[] args) {
        MediaPlayer mediaPlayer = new OldMediaPlayer();
        mediaPlayer.play();

        MediaPlayer adapterMediaPlayer = new Adapter();
        adapterMediaPlayer.play();
    }
}
