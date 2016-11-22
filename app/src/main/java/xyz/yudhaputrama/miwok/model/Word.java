package xyz.yudhaputrama.miwok.model;

/**
 * Created by Chevalier on 11/18/2016.
 */

public class Word {

    private int mEnglish;
    private int mMiwok;
    private int mSound;
    private int mImage = -1;

    public Word(int defaultTranslation, int miwokTranslation, int sound){
        mEnglish = defaultTranslation;
        mMiwok = miwokTranslation;
        mSound = sound;
    }

    public Word(int defaultTranslation, int miwokTranslation, int image, int sound){
        mEnglish = defaultTranslation;
        mMiwok = miwokTranslation;
        mSound = sound;
        mImage = image;
    }

    public int getEnglish(){
        return mEnglish;
    }

    public int getMiwok(){
        return mMiwok;
    }

    public int getSound(){
        return mSound;
    }

    public boolean hasImage(){
        return mImage!=-1;
    }

    public int getImage(){
        return mImage;
    }
}
