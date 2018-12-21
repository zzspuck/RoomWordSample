package com.example.administrator.roomwordsample.asynctask;

import android.os.AsyncTask;

import com.example.administrator.roomwordsample.dao.WordDao;
import com.example.administrator.roomwordsample.entity.Word;

/**
 * @author: zzs
 * @date: 2018/12/20
 */
public class InsertAsyncTask extends AsyncTask<Word, Void, Void> {

    private WordDao mAsyncTaskDao;

    public InsertAsyncTask(WordDao dao) {
        this.mAsyncTaskDao = dao;
    }

    @Override
    protected Void doInBackground(Word... words) {
        mAsyncTaskDao.insert(words[0]);
        return null;
    }
}
