package com.devexperto

import androidx.annotation.WorkerThread
import com.devexperto.MediaItem.Type

object MediaProvider{

    @WorkerThread
    fun getItems(): List<MediaItem> {
        Thread.sleep(2000)
        return (1..10).map {
            MediaItem(
                it,
                "Title $it",
                "https://placekitten.com/200/200?image=$it",
                if(it % 3 == 0) Type.VIDEO else Type.PHOTO
            )
        }
    }
}

