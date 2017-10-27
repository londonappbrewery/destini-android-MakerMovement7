package com.londonappbrewery.destini;

/**
 * Created by James on 10/26/17.
 */

public class StoryCard {
    private int mStoryId;
    private int mAns1Id;
    private int mAns2Id;

    public StoryCard(int storyResourceID, int ans1ResourceId, int ans2ResourceId) {
        mStoryId = storyResourceID;
        mAns1Id = ans1ResourceId;
        mAns2Id = ans2ResourceId;
    };

    public int getStoryId() {
        return mStoryId;
    }

    public void setStoryId(int storyId) {
        mStoryId = storyId;
    }

    public int getAns1Id() {
        return mAns1Id;
    }

    public void setAns1Id(int ans1Id) {
        mAns1Id = ans1Id;
    }

    public int getAns2Id() {
        return mAns2Id;
    }

    public void setAns2Id(int ans2Id) {
        mAns2Id = ans2Id;
    }
}
