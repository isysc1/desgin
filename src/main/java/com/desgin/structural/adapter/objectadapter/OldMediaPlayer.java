package com.desgin.structural.adapter.objectadapter;

/**
 * Created by geely
 */
public class OldMediaPlayer implements MediaPlayer {
    @Override
    public void play() {
        System.out.println("播放 Mp4 中");
    }

}
