package io.freetubeapp.android;

import android.os.Bundle;
import android.service.media.MediaBrowserService;
import android.media.browse.MediaBrowser.MediaItem;
import java.util.List;
import java.util.ArrayList;

public class MediaPlaybackService extends MediaBrowserService {
    @Override
    public BrowserRoot onGetRoot(String clientPackageName, int clientUid, Bundle rootHints) {
        // Returns an empty root so Android Auto sees the app but finds no audio files
        return new BrowserRoot("root", null);
    }

    @Override
    public void onLoadChildren(final String parentMediaId, final Result<List<MediaItem>> result) {
        result.sendResult(new ArrayList<>());
    }
}
