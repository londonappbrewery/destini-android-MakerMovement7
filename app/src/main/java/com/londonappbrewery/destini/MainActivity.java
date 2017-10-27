package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    private Button mButtonTop;
    private Button mButtonBottom;
    private TextView mStoryTextView;
    private int mStoryIndex = 0;

    private void updateStoryCard() {
        mStoryTextView.setText(storyCardArray[mStoryIndex].getStoryId());
        mButtonBottom.setText(storyCardArray[mStoryIndex].getAns2Id());
        mButtonTop.setText(storyCardArray[mStoryIndex].getAns1Id());
    }

    private void hideButtons() {
        mButtonTop.setVisibility(View.GONE);
        mButtonBottom.setVisibility(View.GONE);
    }

    StoryCard[] storyCardArray = {
            new StoryCard(R.string.T1_Story,R.string.T1_Ans1,R.string.T1_Ans2),
            new StoryCard(R.string.T2_Story,R.string.T2_Ans1,R.string.T2_Ans2),
            new StoryCard(R.string.T3_Story,R.string.T3_Ans1,R.string.T3_Ans2),
            new StoryCard(R.string.T4_End,R.string.T3_Ans1,R.string.T3_Ans2),
            new StoryCard(R.string.T5_End,R.string.T3_Ans1,R.string.T3_Ans2),
            new StoryCard(R.string.T6_End,R.string.T3_Ans1,R.string.T3_Ans2)
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // TODO: Step 5 - Find the 3 views from the layout by their id and store the views in their member variables:
        mButtonTop = (Button) findViewById(R.id.buttonTop);
        mButtonBottom = (Button) findViewById(R.id.buttonBottom);
        mStoryTextView = (TextView) findViewById(R.id.storyTextView);


        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:

        mButtonTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               System.out.println("Top Button Working!");
               if (mStoryIndex == 0 || mStoryIndex == 1) {
                   mStoryIndex = 2;
               } else if (mStoryIndex == 2) {
                   mStoryIndex = 5;
                   hideButtons();
               }
               updateStoryCard();
            }
        });

        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:

        mButtonBottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("Bottom Button Working!");
                if (mStoryIndex == 0) {
                    mStoryIndex = 1;
                } else if (mStoryIndex == 1) {
                    mStoryIndex = 3;
                    hideButtons();
                } else if (mStoryIndex == 2) {
                    mStoryIndex = 4;
                    hideButtons();
                }
                updateStoryCard();
            }
        });
    }
    }

