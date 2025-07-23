package com.plcoding.navigation3guide.note

import androidx.compose.ui.graphics.Color
import kotlin.random.Random

data class Note(
	val id: Int,
	val title: String,
	val content: String,
	val color: Color
)

val sampleNotes = List(100) { index ->
	val number = index + 1
	Note(
		id = number,
		title = "Note $number",
		content = "Content $number",
		color = Color(Random.nextLong(0xFFFFFFFF))
	)
}
