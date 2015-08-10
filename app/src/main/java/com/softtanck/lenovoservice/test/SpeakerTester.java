package com.softtanck.lenovoservice.test;

import android.content.Context;
import android.media.MediaPlayer;

import com.softtanck.lenovoservice.ConValue;
import com.softtanck.lenovoservice.ConValue.TestResult;
import com.softtanck.lenovoservice.R;

/**
 * @author : Tanck
 * @Description : TODO À®°È¼ì²â
 * @date 8/10/2015
 */
public class SpeakerTester implements HardwareTestHelper {

    private Context context;

    private MediaPlayer mediaPlayer;

    public SpeakerTester(Context context) {
        this.context = context;
        prepare();
    }

    @Override
    public void prepare() {
        mediaPlayer = new MediaPlayer();
        mediaPlayer.setVolume(100.0F, 100.0F);
//        mediaPlayer = MediaPlayer.create(context, R.ra);
        mediaPlayer.setLooping(false);
    }

    @Override
    public TestResult start() {
        return null;
    }

    @Override
    public TestResult stop() {
        return null;
    }

}