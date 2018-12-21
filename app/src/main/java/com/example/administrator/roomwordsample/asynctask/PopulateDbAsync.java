package com.example.administrator.roomwordsample.asynctask;

import android.os.AsyncTask;

import com.example.administrator.roomwordsample.dao.WordDao;
import com.example.administrator.roomwordsample.database.WordRoomDatabase;
import com.example.administrator.roomwordsample.entity.Word;

/**
 * @author: zzs
 * @date: 2018/12/20
 */
public class PopulateDbAsync extends AsyncTask<Void, Void, Void> {

    private final WordDao mDao;

    public PopulateDbAsync(WordRoomDatabase db) {
        this.mDao = db.wordDao();
    }

    @Override
    protected Void doInBackground(Void... voids) {
        mDao.deleteAll();
        Word word = new Word("Hello");
        mDao.insert(word);
        word = new Word("World");
        mDao.insert(word);
        return null;
    }
}
