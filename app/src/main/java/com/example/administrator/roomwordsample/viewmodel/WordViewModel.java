package com.example.administrator.roomwordsample.viewmodel;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.LiveData;
import android.support.annotation.NonNull;

import com.example.administrator.roomwordsample.entity.Word;
import com.example.administrator.roomwordsample.repository.WordRepository;

import java.util.List;

/**
 * @author: zzs
 * @date: 2018/12/20
 */
public class WordViewModel extends AndroidViewModel {

    private WordRepository mWordRepository;

    private LiveData<List<Word>> mAllWords;

    public WordViewModel(@NonNull Application application) {
        super(application);
        mWordRepository = new WordRepository(application);
        mAllWords = mWordRepository.getAllWords();
    }

    public LiveData<List<Word>> getAllWords() {
        return mAllWords;
    }

    public void insert(Word word) {
        mWordRepository.insert(word);
    }

}
