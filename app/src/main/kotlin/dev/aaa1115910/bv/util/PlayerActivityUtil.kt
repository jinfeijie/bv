package dev.aaa1115910.bv.util

import android.content.Context
import dev.aaa1115910.bv.activities.video.VideoPlayerActivity
import dev.aaa1115910.bv.activities.video.VideoPlayerV3Activity
import dev.aaa1115910.bv.entity.proxy.ProxyArea

fun launchPlayerActivity(
    context: Context,
    avid: Int,
    cid: Int,
    title: String,
    partTitle: String,
    played: Int,
    fromSeason: Boolean,
    subType: Int? = null,
    epid: Int? = null,
    seasonId: Int? = null,
    isVerticalVideo: Boolean = false,
    proxyArea: ProxyArea = ProxyArea.MainLand
) {
    if (Prefs.useOldPlayer) {
        VideoPlayerActivity.actionStart(
            context, avid, cid, title, partTitle, played, fromSeason, subType, epid, seasonId
        )
    } else {
        VideoPlayerV3Activity.actionStart(
            context, avid, cid, title, partTitle, played, fromSeason, subType, epid, seasonId,
            isVerticalVideo, proxyArea
        )
    }
}