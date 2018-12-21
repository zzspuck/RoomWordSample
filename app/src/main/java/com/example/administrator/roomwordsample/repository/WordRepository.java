package com.example.administrator.roomwordsample.repository;

import android.app.Application;
import android.arch.lifecycle.LiveData;

import com.example.administrator.roomwordsample.asynctask.InsertAsyncTask;
import com.example.administrator.roomwordsample.dao.WordDao;
import com.example.administrator.roomwordsample.database.WordRoomDatabase;
import com.example.administrator.roomwordsample.entity.Word;

import java.util.List;

/**
 * @author: zzs
 * @date: 2018/12/20
 */
public class WordRepository {

    private WordDao mWordDao;

    private LiveData<List<Word>> mAllWords;

    public WordRepository(Application application) {
        WordRoomDatabase db = WordRoomDatabase.getDatabase(application);
        mWordDao = db.wordDao();
        mAllWords = mWordDao.getAllWords();
    }

    public LiveData<List<Word>> getAllWords() {
        return mAllWords;
    }

    public void insert(Word word) {
        new InsertAsyncTask(mWordDao).execute(word);
    }
}
