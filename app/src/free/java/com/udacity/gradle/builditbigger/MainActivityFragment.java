package com.udacity.gradle.builditbigger;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.VisibleForTesting;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.fjoglar.jokescreen.JokeActivity;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;


/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    private boolean mIsTesting = false;
    private String mJoke;
    private InterstitialAd mInterstitialAd;

    @BindView(R.id.adView)
    AdView mAdView;

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_main, container, false);

        MobileAds.initialize(getActivity(), BuildConfig.ADMOB_APP_ID);

        ButterKnife.bind(this, root);

        mInterstitialAd = new InterstitialAd(getActivity());
        mInterstitialAd.setAdUnitId(getString(R.string.intersticial_ad_unit_id));
        mInterstitialAd.setAdListener(new AdListener() {
            @Override
            public void onAdClosed() {
                if (!mIsTesting) {
                    startJokeScreen();
                }
            }
        });

        return root;
    }

    @Override
    public void onResume() {
        super.onResume();
        AdRequest adRequest = new AdRequest.Builder()
                .addTestDevice(AdRequest.DEVICE_ID_EMULATOR)
                .build();

        mInterstitialAd.loadAd(adRequest);
        mAdView.loadAd(adRequest);
    }

    @OnClick(R.id.button_main_get_joke)
    public void tellJoke() {
        new GetJokeAsyncTask().execute(this);
    }

    public void onJokeRetrieved(String joke) {
        mJoke = joke;
        if (mInterstitialAd.isLoaded()) {
            mInterstitialAd.show();
        } else {
            Log.d("TAG", "The interstitial wasn't loaded yet.");
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
