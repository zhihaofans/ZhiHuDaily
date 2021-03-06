package com.marktony.zhihudaily.search;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.SearchView;
import android.support.v7.widget.Toolbar;
import android.util.Log;

import com.marktony.zhihudaily.R;

/**
 * Created by lizhaotailang on 2016/12/22.
 */

public class SearchActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.frame);

        SearchFragment fragment = SearchFragment.newInstance();

        getSupportFragmentManager().beginTransaction()
                .add(R.id.container, fragment)
                .commit();

        new SearchPresenter(this, fragment);

    }
}
