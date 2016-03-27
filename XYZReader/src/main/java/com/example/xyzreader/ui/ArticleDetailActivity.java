package com.example.xyzreader.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.xyzreader.R;

/**
 * An activity representing a single Article detail screen, letting you swipe between articles.
 */
public class ArticleDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_article_detail);
        if (savedInstanceState == null) {
            // Create the detail fragment and add it to the activity
            // using a fragment transaction.

            Bundle arguments = new Bundle();
            arguments.putParcelable(ArticleDetailFragment.ARG_ITEM_URI, getIntent().getData());

            ArticleDetailFragment fragment = new ArticleDetailFragment();
            fragment.setArguments(arguments);

            getSupportFragmentManager().beginTransaction()
                    .add(R.id.detailsHolder, fragment)
                    .commit();

            supportPostponeEnterTransition();
        }
    }
}
