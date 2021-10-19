package com.example.jetnote.data.database.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class NoteDbModel(
  @PrimaryKey(autoGenerate = true) val id: Long = 0,
  @ColumnInfo(name = "title") val title: String,
  @ColumnInfo(name = "content") val content: String,
  @ColumnInfo(name = "can_be_checked_off") val canBeCheckedOff: Boolean,
  @ColumnInfo(name = "is_checked_off") val isCheckedOff: Boolean,
  @ColumnInfo(name = "color_id") val colorId: Long,
  @ColumnInfo(name = "in_trash") val isInTrash: Boolean
) {

  companion object {
    val DEFAULT_NOTES = listOf(
      NoteDbModel(1, "Bài tập 1", "Prepare sample project", false, false, 1, false),
      NoteDbModel(2, "Bài tập 2", "Pay by tomorrow", false, false, 2, false),
      NoteDbModel(3, "Bài tập 3", "Milk, eggs, salt, flour...", false, false, 3, false),
      NoteDbModel(4, "Workout", "Running, push ups, pull ups, squats...", false, false, 4, false)
    )
  }
}
