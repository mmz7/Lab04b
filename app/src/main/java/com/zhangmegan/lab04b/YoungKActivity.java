package com.zhangmegan.lab04b;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;

public class YoungKActivity extends Activity {
    MediaPlayer mp;
    AppCompatButton play;
    final int[] count = new int[0];
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.notgonna_layout);

        mp = MediaPlayer.create(YoungKActivity.this, R.raw.notgonnalove);
        play = findViewById(R.id.button);
        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(count[0] == 0) {
                    mp.start();
                    play.setText("pause");
                    count[0]++;
                }
                else {
                    mp.pause();
                    play.setText("play");
                    count[0]--;
                }
            }
        });
    }
}
