package com.example.jetnote.data.database.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class ColorDbModel(
  @PrimaryKey(autoGenerate = true) val id: Long = 0,
  @ColumnInfo(name = "hex") val hex: String,
  @ColumnInfo(name = "name") val name: String
) {

  companion object {

    val DEFAULT_COLORS = listOf(
      ColorDbModel(1, "#FFFFFF", "White"),
      ColorDbModel(2, "#FF0000", "Red"),
      ColorDbModel(3, "#0000FF", "Blue"),
      ColorDbModel(4, "#CDBE70", "LightGoldenrod3"),
      ColorDbModel(5, "#FFD39B", "Burlywood1")
    )

    val DEFAULT_COLOR = DEFAULT_COLORS[0]
  }
}
