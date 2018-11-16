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
            sound31, sound32,

    //new soundpool
            sound33, sound34, sound35, sound36, sound37, sound38, sound39, sound40, sound41,
            sound42, sound43, sound44,sound45, sound46, sound47, sound48, sound49, sound50,
            sound51, sound52, sound53, sound54, sound55,sound56, sound57, sound58, sound59,
            sound60, sound61,sound62;

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


        //new sounds below version 3.1
        sound33 = soundPool.load(this, R.raw.a33vegans, 1);
        sound34 = soundPool.load(this, R.raw.a34adorable, 1);
        sound35 = soundPool.load(this, R.raw.a35becky, 1);
        sound36 = soundPool.load(this, R.raw.a36beckyplease, 1);
        sound37 = soundPool.load(this, R.raw.a37belly, 1);
        sound38 = soundPool.load(this, R.raw.a38butt, 1);
        sound39 = soundPool.load(this, R.raw.a39cactus, 1);
        sound40 = soundPool.load(this, R.raw.a40ccccombo, 1);
        sound41 = soundPool.load(this, R.raw.a41deck, 1);
        sound42 = soundPool.load(this, R.raw.a42explicit, 1);
        sound43 = soundPool.load(this, R.raw.a43fkyeah, 1);
        sound44= soundPool.load(this, R.raw.a44frog2, 1);
        sound45 = soundPool.load(this, R.raw.a45goat, 1);
        sound46 = soundPool.load(this, R.raw.a46hai, 1);
        sound47 = soundPool.load(this, R.raw.a47ilike, 1);
        sound48 = soundPool.load(this, R.raw.a48kitten, 1);
        sound49 = soundPool.load(this, R.raw.a49kittenhey, 1);
        sound50 = soundPool.load(this, R.raw.a50lick, 1);
        sound51 = soundPool.load(this, R.raw.a51noron, 1);
        sound52 = soundPool.load(this, R.raw.a52owl, 1);
        sound53 = soundPool.load(this, R.raw.a53peck, 1);
        sound54 = soundPool.load(this, R.raw.a54salladd, 1);
        sound55 = soundPool.load(this, R.raw.a55screaming, 1);
        sound56 = soundPool.load(this, R.raw.a56slap, 1);
        sound57 = soundPool.load(this, R.raw.a57smaesh, 1);
        sound58 = soundPool.load(this, R.raw.a58smash, 1);
        sound59 = soundPool.load(this, R.raw.a59smorc, 1);
        sound60 = soundPool.load(this, R.raw.a60soap, 1);
        sound61 = soundPool.load(this, R.raw.a61sticks, 1);
        sound62 = soundPool.load(this, R.raw.a62touchx, 1);



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
                /// version 3.1 sounds

            case R.id.button_sound33:
                soundPool.play(sound33, 1, 1, 0, 0, 1);
                break;
            case R.id.button_sound34:
                soundPool.play(sound34, 1, 1, 0, 0, 1);
                break;
            case R.id.button_sound35:
                soundPool.play(sound35, 1, 1, 0, 0, 1);
                break;
            case R.id.button_sound36:
                soundPool.play(sound36, 1, 1, 0, 0, 1);
                break;
            case R.id.button_sound37:
                soundPool.play(sound37, 1, 1, 0, 0, 1);
                break;
            case R.id.button_sound38:
                soundPool.play(sound38, 1, 1, 0, 0, 1);
                break;
            case R.id.button_sound39:
                soundPool.play(sound39, 1, 1, 0, 0, 1);
                break;
            case R.id.button_sound40:
                soundPool.play(sound40, 1, 1, 0, 0, 1);
                break;
            case R.id.button_sound41:
                soundPool.play(sound41, 1, 1, 0, 0, 1);
                break;
            case R.id.button_sound42:
                soundPool.play(sound42, 1, 1, 0, 0, 1);
                break;
            case R.id.button_sound43:
                soundPool.play(sound43, 1, 1, 0, 0, 1);
                break;
            case R.id.button_sound44:
                soundPool.play(sound44, 1, 1, 0, 0, 1);
                break;
            case R.id.button_sound45:
                soundPool.play(sound45, 1, 1, 0, 0, 1);
                break;
            case R.id.button_sound46:
                soundPool.play(sound46, 1, 1, 0, 0, 1);
                break;
            case R.id.button_sound47:
                soundPool.play(sound47, 1, 1, 0, 0, 1);
                break;
            case R.id.button_sound48:
                soundPool.play(sound48, 1, 1, 0, 0, 1);
                break;
            case R.id.button_sound49:
                soundPool.play(sound49, 1, 1, 0, 0, 1);
                break;
            case R.id.button_sound50:
                soundPool.play(sound50, 1, 1, 0, 0, 1);
                break;
            case R.id.button_sound51:
                soundPool.play(sound51, 1, 1, 0, 0, 1);
                break;
            case R.id.button_sound52:
                soundPool.play(sound52, 1, 1, 0, 0, 1);
                break;
            case R.id.button_sound53:
                soundPool.play(sound53, 1, 1, 0, 0, 1);
                break;
            case R.id.button_sound54:
                soundPool.play(sound54, 1, 1, 0, 0, 1);
                break;
            case R.id.button_sound55:
                soundPool.play(sound55, 1, 1, 0, 0, 1);
                break;
            case R.id.button_sound56:
                soundPool.play(sound56, 1, 1, 0, 0, 1);
                break;
            case R.id.button_sound57:
                soundPool.play(sound57, 1, 1, 0, 0, 1);
                break;
            case R.id.button_sound58:
                soundPool.play(sound58, 1, 1, 0, 0, 1);
                break;
            case R.id.button_sound59:
                soundPool.play(sound59, 1, 1, 0, 0, 1);
                break;
            case R.id.button_sound60:
                soundPool.play(sound60, 1, 1, 0, 0, 1);
                break;
            case R.id.button_sound61:
                soundPool.play(sound61, 1, 1, 0, 0, 1);
                break;
            case R.id.button_sound62:
                soundPool.play(sound62, 1, 1, 0, 0, 1);
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