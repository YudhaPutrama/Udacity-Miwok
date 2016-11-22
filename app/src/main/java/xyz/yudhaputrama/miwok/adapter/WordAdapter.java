package xyz.yudhaputrama.miwok.adapter;

import android.content.Context;
import android.media.MediaPlayer;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import xyz.yudhaputrama.miwok.R;
import xyz.yudhaputrama.miwok.model.Word;

/**
 * Created by Chevalier on 11/18/2016.
 */

public class WordAdapter extends RecyclerView.Adapter<WordAdapter.WordListHolder> {
    private Context mContext;
    private ArrayList<Word> mDataset;

    public WordAdapter(Context context, ArrayList<Word> dataset){
        mContext = context;
        mDataset = dataset;
    }
    @Override
    public WordListHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View viewItem = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list,
                parent, false);
        return new WordListHolder(viewItem);
    }

    @Override
    public void onBindViewHolder(WordListHolder holder, final int position) {
        Word data = mDataset.get(position);
        if (data.hasImage())
            holder.image.setImageResource(mDataset.get(position).getImage());
        else
            holder.image.setVisibility(View.GONE);
        holder.englishText.setText(mContext.getString(mDataset.get(position).getEnglish()));
        holder.mivokText.setText(mContext.getString(mDataset.get(position).getMiwok()));

        holder.play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mediaPlayer = MediaPlayer.create(mContext, mDataset.get(position).getSound());
                mediaPlayer.start(); // no need to call prepare(); create() does that for you
            }
        });
    }

    @Override
    public int getItemCount() {
        return mDataset.size();
    }

    public class WordListHolder extends RecyclerView.ViewHolder{
        public ImageView image;
        public TextView englishText, mivokText;
        public ImageButton play;
        public WordListHolder(View itemView) {
            super(itemView);
            image = (ImageView) itemView.findViewById(R.id.image);
            englishText = (TextView) itemView.findViewById(R.id.txt_english);
            mivokText = (TextView) itemView.findViewById(R.id.txt_mivok);
            play = (ImageButton) itemView.findViewById(R.id.play_btn);
        }
    }
}
