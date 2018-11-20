package org.code_crew.diceroller;

import android.media.AudioAttributes;
import android.media.SoundPool;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import java.util.Random;


public class MainActivity extends AppCompatActivity {

    private ImageView randomImage;
    private Random random = new Random();
    private SoundPool soundPool;
    private int sound1;
    private int streamId1;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        randomImage = (ImageView)findViewById(R.id.diceView);
        AudioAttributes audioAttributes = new AudioAttributes.Builder()
                .setUsage(AudioAttributes.USAGE_ASSISTANCE_SONIFICATION)
                .setContentType(AudioAttributes.CONTENT_TYPE_SONIFICATION)
                .build();

        soundPool = new SoundPool.Builder()
                .setMaxStreams(6)
                .setAudioAttributes(audioAttributes)
                .build();

        sound1 = soundPool.load(this, R.raw.shake_dice, 1);


    }

    public void randomDice(View view)
    {
//        streamId1 = soundPool.play(sound1,1,1,0,0,1);


        switch (random.nextInt(6) + 1)
        {
            case 1:
                streamId1 = soundPool.play(sound1,1,1,0,0,1);
                randomImage.setImageResource(R.drawable.one);
                break;
            case 2:
                streamId1 = soundPool.play(sound1,1,1,0,0,1);
                randomImage.setImageResource(R.drawable.two);
                break;
            case 3:
                streamId1 = soundPool.play(sound1,1,1,0,0,1);
                randomImage.setImageResource(R.drawable.three);
                break;
            case 4:
                streamId1 = soundPool.play(sound1,1,1,0,0,1);
                randomImage.setImageResource(R.drawable.four);
                break;
            case 5:
                streamId1 = soundPool.play(sound1,1,1,0,0,1);
                randomImage.setImageResource(R.drawable.five);
                break;
            case 6:
                streamId1 = soundPool.play(sound1,1,1,0,0,1);
                randomImage.setImageResource(R.drawable.six);
                break;
            default:
        }
    }
}