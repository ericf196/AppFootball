package com.example.omega.appfooball.fragments;


import android.os.Handler;
import android.support.v4.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.omega.appfooball.R;


import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayer.OnInitializedListener;
import com.google.android.youtube.player.YouTubePlayer.Provider;
import com.google.android.youtube.player.YouTubePlayerSupportFragment;

import java.text.SimpleDateFormat;
import java.util.Date;


public class StreamingFragment extends Fragment /*implements View.OnClickListener, YouTubePlayer.OnInitializedListener*/{


    //Api Youtube

    private static final String API_KEY = "AIzaSyBDnx8srcY_np_M7BMnis74p1x1HRhE9Q0";

    private static String VIDEO_ID = "Wgj_mRJf6X8";

    private TextView viewDays, viewHours, viewMinutes, viewSeconds, tvEvent;
    private LinearLayout linearLayout1, linearLayout2;
    private Handler handler;
    private Runnable runnable;


    // TODO: Rename and change types and number of parameters
    public static StreamingFragment newInstance() {
        StreamingFragment fragment = new StreamingFragment();

        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v=inflater.inflate(R.layout.fragment_streaming, container, false);

        YouTubePlayerSupportFragment youTubePlayerFragment = YouTubePlayerSupportFragment.newInstance();

        FragmentTransaction transaction = getChildFragmentManager().beginTransaction();
        transaction.add(R.id.youtube_layout, youTubePlayerFragment).commit();

        youTubePlayerFragment.initialize(API_KEY, new OnInitializedListener() {

            @Override
            public void onInitializationSuccess(Provider provider, YouTubePlayer player, boolean wasRestored) {
                if (!wasRestored) {

                    player.setShowFullscreenButton(false);
                    //player.setFullscreenControlFlags(YouTubePlayer.FULLSCREEN_FLAG_CUSTOM_LAYOUT);
                    //player.setPlayerStyle(YouTubePlayer.PlayerStyle.DEFAULT);
                    player.cueVideo(VIDEO_ID);
                    //player.loadVideo(VIDEO_ID);


                }
            }

            @Override
            public void onInitializationFailure(Provider provider, YouTubeInitializationResult error) {
                // YouTube error
                String errorMessage = error.toString();
                Toast.makeText(getActivity(), errorMessage, Toast.LENGTH_LONG).show();
                Log.d("errorMessage:", errorMessage);
            }
        });

         viewDays=(TextView) v.findViewById(R.id.view_days);
         viewHours=(TextView) v.findViewById(R.id.view_hours);
         viewMinutes=(TextView) v.findViewById(R.id.view_minutes);
         viewSeconds=(TextView) v.findViewById(R.id.view_seconds);

        countDownStart();

        return v;
    }

    public void countDownStart() {
        handler = new Handler();
        runnable = new Runnable() {
            @Override
            public void run() {
                handler.postDelayed(this, 1000);
                try {
                    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                    // Here Set your Event Date
                    Date eventDate = dateFormat.parse("2017-04-14");
                    Date currentDate = new Date();
                    if (!currentDate.after(eventDate)) {
                        long diff = eventDate.getTime() - currentDate.getTime();
                        long days = diff / (24 * 60 * 60 * 1000);
                        diff -= days * (24 * 60 * 60 * 1000);
                        long hours = diff / (60 * 60 * 1000);
                        diff -= hours * (60 * 60 * 1000);
                        long minutes = diff / (60 * 1000);
                        diff -= minutes * (60 * 1000);
                        long seconds = diff / 1000;
                        viewDays.setText("" + String.format("%02d", days));
                        viewHours.setText("" + String.format("%02d", hours));
                        viewMinutes.setText("" + String.format("%02d", minutes));
                        viewSeconds.setText("" + String.format("%02d", seconds));
                    } else {
                        /*linearLayout1.setVisibility(View.VISIBLE);
                        linearLayout2.setVisibility(View.GONE);
                        tvEvent.setText("Android Event Start");
                        handler.removeCallbacks(runnable);
                        // handler.removeMessages(0);*/
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        };
        handler.postDelayed(runnable, 0);
    }


    /*@Override
    public void onStop() {
        super.onStop();

        Log.i("msg","onStop");
    }


    @Override
    public void onResume() {
        super.onResume();

        Log.i("msg","onResume");

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.i("msg","onDestroyView");


    }

    @Override
    public void onDestroy() {
        super.onDestroy();

        Log.i("msg","onDestroy");
    }*/
}
