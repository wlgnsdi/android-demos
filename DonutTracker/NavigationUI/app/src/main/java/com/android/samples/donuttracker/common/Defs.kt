package com.android.samples.donuttracker.common

import androidx.annotation.StringDef

@Retention(AnnotationRetention.SOURCE)
@StringDef(EditState.NEW, EditState.EXISTING)
annotation class EditState {
    companion object {
        const val NEW = "NEW"
        const val EXISTING = "EXISTING"

    }
}