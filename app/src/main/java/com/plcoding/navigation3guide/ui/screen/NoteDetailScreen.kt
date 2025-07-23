package com.plcoding.navigation3guide.ui.screen

import androidx.navigation3.runtime.NavKey
import kotlinx.serialization.Serializable

@Serializable
data class NoteDetailScreen(val id: Int) : NavKey
