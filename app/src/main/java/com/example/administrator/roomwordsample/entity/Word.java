package com.example.administrator.roomwordsample.entity;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

/**
 * @author: zzs
 * @date: 2018/12/20
 */
@Entity(tableName = "word_table")
public class Word {

    @PrimaryKey
    @NonNull
    @ColumnInfo(name = "word")
    private String mWord;

    public Word(String mWord) {
        this.mWord = mWord;
    }

    public String getWord() {
        return mWord == null ? "" : mWord;
    }
}
