package com.example.flashfeedshow.Util

import android.annotation.SuppressLint
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.time.format.FormatStyle
import java.util.Locale

@SuppressLint("NewApi")
fun dataFormatter(inputDataTime: String?): String {
    val inputFormatter = DateTimeFormatter.ISO_OFFSET_DATE_TIME
    val outputFormatter = DateTimeFormatter
        .ofLocalizedDate(FormatStyle.LONG)
        .withLocale(Locale.getDefault())
    val dataString = try {
        val dataTime = OffsetDateTime.parse(inputDataTime, inputFormatter)
        dataTime.format(outputFormatter)
    } catch (e: Exception) {
        ""
    }
    return dataString
}