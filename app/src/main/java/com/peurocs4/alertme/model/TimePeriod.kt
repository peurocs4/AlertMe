package com.peurocs4.alertme.model

import com.peurocs4.alertme.time.Time
import java.time.Duration
import java.time.LocalDate
import java.time.LocalTime

class TimePeriod {
    private var startTime: LocalTime = LocalTime.MIN
    private var endTime: LocalTime = LocalTime.MAX

    fun set24Hours() {
        this.startTime = LocalTime.MIN
        this.endTime = LocalTime.MAX
    }

    fun is24Hours(): Boolean {
        val isAroundMinutes = getDurationInMinutes() == Time.DAY.inMinutes().toLong() - 1L
        val isZeroMinutes = getDurationInMinutes() == 0L
        return isAroundMinutes || isZeroMinutes
    }

    fun getDurationInMinutes(): Long {
        val startDateTime = this.startTime.atDate(LocalDate.now())
        val endDateTime = this.endTime.atDate(LocalDate.now().plusDays(1))
        val differenceInMinutes = Duration.between(startDateTime, endDateTime).toMinutes()

        return differenceInMinutes % Time.DAY.inMinutes().toLong()
    }

}