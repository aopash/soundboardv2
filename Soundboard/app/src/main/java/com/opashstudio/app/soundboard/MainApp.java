package com.opashstudio.app.soundboard;


import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;



public class MainApp extends AppCompatActivity {

    private SoundPool soundPool;
    private int sound1, sound2, sound3, sound4, sound5, sound6,
            sound7, sound8, sound9, sound10, sound11, sound12,sound13, sound14,
            sound15, sound16, sound17, sound18, sound19, sound20, sound21, sound22,
            sound23, sound24, sound25, sound26, sound27, sound28, sound29, sound30,
            sound31, sound32;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainapp_layout);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            AudioAttributes audioAttributes = new AudioAttributes.Builder()
                    .setUsage(AudioAttributes.USAGE_MEDIA)
                    .setContentType(AudioAttributes.CONTENT_TYPE_SONIFICATION)
                    .build();

            setVolumeControlStream(AudioManager.STREAM_MUSIC);


            soundPool = new SoundPool.Builder()
                    .setMaxStreams(2)
                    .setAudioAttributes(audioAttributes)
                    .build();
        } else {
            soundPool = new SoundPool(2, AudioManager.STREAM_MUSIC, 0);
        }

        sound1 = soundPool.load(this, R.raw.a1inlovefish, 1);
        sound2 = soundPool.load(this, R.raw.a2popwoo, 1);
        sound3 = soundPool.load(this, R.raw.a3whistle, 1);
        sound4 = soundPool.load(this, R.raw.a4whistle2, 1);
        sound5 = soundPool.load(this, R.raw.a5whistle3, 1);
        sound6 = soundPool.load(this, R.raw.a6whistlehey, 1);

        sound7 = soundPool.load(this, R.raw.a7whistlecunt, 1);
        sound8 = soundPool.load(this, R.raw.a8avoiddwarfs, 1);
        sound9 = soundPool.load(this, R.raw.a9isuckthedevil, 1);
        sound10 = soundPool.load(this, R.raw.a10tasteslikegod, 1);
        sound11 = soundPool.load(this, R.raw.a11canidickyourfriends, 1);
        sound12 = soundPool.load(this, R.raw.a12canidickyourfriends2, 1);

        sound13 = soundPool.load(this, R.raw.a13canifrackyourfriends, 1);
        sound14 = soundPool.load(this, R.raw.a14canipumpyourdick, 1);
        sound15 = soundPool.load(this, R.raw.a15canufuckmyfriends, 1);
        sound16 = soundPool.load(this, R.raw.a16canitouchyourkitten, 1);
        sound17 = soundPool.load(this, R.raw.a17kitten, 1);
        sound18 = soundPool.load(this, R.raw.a18ifitouchmysaussage, 1);

        sound19 = soundPool.load(this, R.raw.a19icanhearushitting, 1);
        sound20 = soundPool.load(this, R.raw.a20icanseemyflaps, 1);
        sound21 = soundPool.load(this, R.raw.a21goon, 1);
        sound22 = soundPool.load(this, R.raw.a22goon2, 1);
        sound23 = soundPool.load(this, R.raw.a23faptastic, 1);
        sound24 = soundPool.load(this, R.raw.a24comeon, 1);

        sound25 = soundPool.load(this, R.raw.a25biscuit, 1);
        sound26 = soundPool.load(this, R.raw.a26evergetthatfeeling, 1);
        sound27 = soundPool.load(this, R.raw.a27evergetthatfeeling2, 1);
        sound28 = soundPool.load(this, R.raw.a28canirestmyballs, 1);
        sound29 = soundPool.load(this, R.raw.a29ballsonbonnet, 1);
        sound30 = soundPool.load(this, R.raw.a30ballsonbonnet2, 1);

        sound31 = soundPool.load(this, R.raw.a31comeonmybiscuit, 1);
        sound32 = soundPool.load(this, R.raw.a32goddoesntloveyou, 1);


    }

    public void playSound(View v) {
        switch (v.getId()) {
            case R.id.button_sound1:
                soundPool.play(sound1, 1, 1, 0, 0, 1);
                break;
            case R.id.button_sound2:
                soundPool.play(sound2, 1, 1, 0, 0, 1);
                break;
            case R.id.button_sound3:
                soundPool.play(sound3, 1, 1, 0, 0, 1);
                break;
            case R.id.button_sound4:
                soundPool.play(sound4, 1, 1, 0, 0, 1);
                break;
            case R.id.button_sound5:
                soundPool.play(sound5, 1, 1, 0, 0, 1);
                break;
            case R.id.button_sound6:
                soundPool.play(sound6, 1, 1, 0, 0, 1);
                break;

            case R.id.button_sound7:
                soundPool.play(sound7, 1, 1, 0, 0, 1);
                break;
            case R.id.button_sound8:
                soundPool.play(sound8, 1, 1, 0, 0, 1);
                break;
            case R.id.button_sound9:
                soundPool.play(sound9, 1, 1, 0, 0, 1);
                break;
            case R.id.button_sound10:
                soundPool.play(sound10, 1, 1, 0, 0, 1);
                break;
            case R.id.button_sound11:
                soundPool.play(sound11, 1, 1, 0, 0, 1);
                break;
            case R.id.button_sound12:
                soundPool.play(sound12, 1, 1, 0, 0, 1);
                break;

            case R.id.button_sound13:
                soundPool.play(sound13, 1, 1, 0, 0, 1);
                break;
            case R.id.button_sound14:
                soundPool.play(sound14, 1, 1, 0, 0, 1);
                break;
            case R.id.button_sound15:
                soundPool.play(sound15, 1, 1, 0, 0, 1);
                break;
            case R.id.button_sound16:
                soundPool.play(sound16, 1, 1, 0, 0, 1);
                break;
            case R.id.button_sound17:
                soundPool.play(sound17, 1, 1, 0, 0, 1);
                break;
            case R.id.button_sound18:
                soundPool.play(sound18, 1, 1, 0, 0, 1);
                break;

            case R.id.button_sound19:
                soundPool.play(sound19, 1, 1, 0, 0, 1);
                break;
            case R.id.button_sound20:
                soundPool.play(sound20, 1, 1, 0, 0, 1);
                break;
            case R.id.button_sound21:
                soundPool.play(sound21, 1, 1, 0, 0, 1);
                break;
            case R.id.button_sound22:
                soundPool.play(sound22, 1, 1, 0, 0, 1);
                break;
            case R.id.button_sound23:
                soundPool.play(sound23, 1, 1, 0, 0, 1);
                break;
            case R.id.button_sound24:
                soundPool.play(sound24, 1, 1, 0, 0, 1);
                break;

            case R.id.button_sound25:
                soundPool.play(sound25, 1, 1, 0, 0, 1);
                break;
            case R.id.button_sound26:
                soundPool.play(sound26, 1, 1, 0, 0, 1);
                break;
            case R.id.button_sound27:
                soundPool.play(sound27, 1, 1, 0, 0, 1);
                break;
            case R.id.button_sound28:
                soundPool.play(sound28, 1, 1, 0, 0, 1);
                break;
            case R.id.button_sound29:
                soundPool.play(sound29, 1, 1, 0, 0, 1);
                break;


            case R.id.button_sound30:
                soundPool.play(sound30, 1, 1, 0, 0, 1);
                break;
            case R.id.button_sound31:
                soundPool.play(sound31, 1, 1, 0, 0, 1);
                break;
            case R.id.button_sound32:
                soundPool.play(sound32, 1, 1, 0, 0, 1);
                break;




























        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        soundPool.release();
        soundPool = null;
    }



}