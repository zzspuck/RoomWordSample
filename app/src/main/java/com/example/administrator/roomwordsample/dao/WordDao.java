package com.example.administrator.roomwordsample.dao;

import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import com.example.administrator.roomwordsample.entity.Word;

import java.util.List;

/**
 * @author: zzs
 * @date: 2018/12/20
 */
@Dao
public interface WordDao {

    @Insert
    void insert(Word word);

    @Query("DELETE FROM word_table")
    void deleteAll();

    @Query("SELECT * from WORD_TABLE ORDER BY word ASC")
    LiveData<List<Word>> getAllWords();
}
