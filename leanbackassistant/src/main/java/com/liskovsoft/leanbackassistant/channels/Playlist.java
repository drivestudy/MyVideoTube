/*
 * Copyright (C) 2017 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */

package com.liskovsoft.leanbackassistant.channels;

import java.util.List;

public final class Playlist {
    private final String mName;
    private final String mDescription;
    private final String mVideoUri;
    private final String mBgImage;
    private final String mTitle;
    private final String mPlaylistId;
    private List<Clip> mClips;
    private boolean mChannelPublished;
    private long mChannelId;

    Playlist(String name, List<Clip> clip, String playlistId) {
        mName = name;
        mTitle = "playlist title";
        mDescription = "playlist description";
        mVideoUri = "dsf";
        mBgImage = "asdf";
        mClips = clip;
        mPlaylistId = playlistId;
    }

    public String getName() {
        return mName;
    }

    List<Clip> getClips() {
        return mClips;
    }

    public String getDescription() {
        return mDescription;
    }

    String getPlaylistId() {
        return mPlaylistId;
    }

    public boolean isChannelPublished() {
        return mChannelPublished;
    }

    public void setChannelPublished(boolean channelPublished) {
        mChannelPublished = channelPublished;
    }

    void setChannelPublishedId(long id) {
        mChannelPublished = true;
        mChannelId = id;
    }

    long getChannelId() {
        return mChannelId;
    }

    public String toString() {
        return "Playlist { mName = '" + mName + "' mDescription = '" + mDescription
                + "' mVideoUri = '" + mVideoUri + "' mBgImage = '" + mBgImage + "' mTitle = '"
                + mTitle + "' mList = '" + mClips + "' mId = '" + mPlaylistId
                + "' mChannelPublished" + mChannelPublished + "'";
    }
}
