package com.example.android.miwok;

public class Word {
    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;
    private int mAudioResourceId;

    public Word(String aDefaultTranslation, String aMiwokTranslation, int anAudioResourceId) {
        mDefaultTranslation = aDefaultTranslation;
        mMiwokTranslation = aMiwokTranslation;
        mAudioResourceId = anAudioResourceId;
    }

    public Word(String aDefaultTranslation, String aMiwokTranslation, int anImageResourceId, int anAudioResourceId) {
        mDefaultTranslation = aDefaultTranslation;
        mMiwokTranslation = aMiwokTranslation;
        mImageResourceId = anImageResourceId;
        mAudioResourceId = anAudioResourceId;
    }

    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    public int getImageResourceId() { return mImageResourceId; }

    public boolean hasImage() { return mImageResourceId != NO_IMAGE_PROVIDED; }

    public int getmAudioResourceId() { return mAudioResourceId; }

    @Override
    public String toString() {
        return "Word{" +
                "mDefaultTranslation='" + mDefaultTranslation + '\'' +
                ", mMiwokTranslation='" + mMiwokTranslation + '\'' +
                ", mImageResourceId=" + mImageResourceId +
                ", mAudioResourceId=" + mAudioResourceId +
                '}';
    }
}