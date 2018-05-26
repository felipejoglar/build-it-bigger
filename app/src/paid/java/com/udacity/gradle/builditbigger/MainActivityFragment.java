package com.udacity.gradle.builditbigger;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.VisibleForTesting;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.fjoglar.jokescreen.JokeActivity;

import butterknife.ButterKnife;
import butterknife.OnClick;


/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    private boolean mIsTesting = false;
    private String mJoke;

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_main, container, false);

        ButterKnife.bind(this, root);

        return root;
    }

    @OnClick(R.id.button_main_get_joke)
    public void tellJoke() {
        new GetJokeAsyncTask().execute(this);
    }

    public void onJokeRetrieved(String joke) {
        mJoke = joke;
        if (!mIsTesting) {
            startJokeScreen();
        }
    }

    private void startJokeScreen() {
        Intent jokeIntent = new Intent(getActivity(), JokeActivity.class);
        jokeIntent.putExtra(JokeActivity.EXTRA_JOKE, mJoke);

        startActivity(jokeIntent);
    }

    @VisibleForTesting
    public String getJoke() {
        return mJoke;
    }

    @VisibleForTesting
    public void setTesting() {
        mIsTesting = true;
    }
}
