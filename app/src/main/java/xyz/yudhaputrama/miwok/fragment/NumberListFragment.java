package xyz.yudhaputrama.miwok.fragment;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import xyz.yudhaputrama.miwok.R;
import xyz.yudhaputrama.miwok.adapter.WordAdapter;
import xyz.yudhaputrama.miwok.model.Word;

/**
 * Created by Chevalier on 11/18/2016.
 */

public class NumberListFragment extends Fragment {
    private RecyclerView mRecyclerView;
    private RecyclerView.LayoutManager mLayoutManager;
    private MediaPlayer mediaPlayer;

    public NumberListFragment(){

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);

        View rootView = inflater.inflate(R.layout.list_word, container, false);
        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word(R.string.number_one, R.string.miwok_number_one,
                R.drawable.number_one, R.raw.number_one));
        words.add(new Word(R.string.number_two, R.string.miwok_number_two,
                R.drawable.number_two, R.raw.number_two));
        words.add(new Word(R.string.number_three, R.string.miwok_number_three,
                R.drawable.number_three, R.raw.number_three));
        words.add(new Word(R.string.number_four, R.string.miwok_number_four,
                R.drawable.number_four, R.raw.number_four));
        words.add(new Word(R.string.number_five, R.string.miwok_number_five,
                R.drawable.number_five, R.raw.number_five));
        words.add(new Word(R.string.number_six, R.string.miwok_number_six,
                R.drawable.number_six, R.raw.number_six));
        words.add(new Word(R.string.number_seven, R.string.miwok_number_seven,
                R.drawable.number_seven, R.raw.number_seven));
        words.add(new Word(R.string.number_eight, R.string.miwok_number_eight,
                R.drawable.number_eight, R.raw.number_eight));
        words.add(new Word(R.string.number_nine, R.string.miwok_number_nine,
                R.drawable.number_nine, R.raw.number_nine));
        words.add(new Word(R.string.number_ten, R.string.miwok_number_ten,
                R.drawable.number_ten, R.raw.number_ten));

        mRecyclerView = (RecyclerView) rootView.findViewById(R.id.recycler_view);
        WordAdapter adapter = new WordAdapter(getActivity(), words);

        mLayoutManager = new LinearLayoutManager(getActivity());
        mRecyclerView.setLayoutManager(mLayoutManager);

        mRecyclerView.setAdapter(adapter);

        return rootView;
    }

    @Override
    public void onStop() {
        super.onStop();
        releaseMediaPlayer();
    }

    private void releaseMediaPlayer(){
        if (mediaPlayer!=null){
            mediaPlayer.release();
            mediaPlayer = null;
        }
    }
}
