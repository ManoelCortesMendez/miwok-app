package com.example.android.miwok;

public class Word {
    private String mDefaultTranslation = "defaultTranslation";
    private String mMiwokTranslation = "miwokTranslation";

    public Word(String aDefaultTranslation, String aMiwokTranslation) {
        mDefaultTranslation = aDefaultTranslation;
        mMiwokTranslation = aMiwokTranslation;
    }

    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }
}