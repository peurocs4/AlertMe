package com.peurocs4.alertme.model

import java.time.DayOfWeek

class DaysOfWeekSelector {

    private val daysOfWeekStates = hashMapOf<DayOfWeek, Boolean>(
        DayOfWeek.SUNDAY to false,
        DayOfWeek.MONDAY to false,
        DayOfWeek.TUESDAY to false,
        DayOfWeek.WEDNESDAY to false,
        DayOfWeek.THURSDAY to false,
        DayOfWeek.FRIDAY to false,
        DayOfWeek.SATURDAY to false
    )

    private val weekdaysEnums: ArrayList<DayOfWeek> = arrayListOf(
        DayOfWeek.MONDAY,
        DayOfWeek.TUESDAY,
        DayOfWeek.WEDNESDAY,
        DayOfWeek.THURSDAY,
        DayOfWeek.FRIDAY
    )

    private val weekendsEnums: ArrayList<DayOfWeek> = arrayListOf(
        DayOfWeek.SATURDAY,
        DayOfWeek.SUNDAY
    )

    fun selectAllDays() {
        selectWeekdays()
        selectWeekends()
    }

    fun deselectAllDays() {
        deselectWeekdays()
        deselectWeekends()
    }

    fun selectOnlyWeekdays() {
        selectWeekdays()
        deselectWeekends()
    }

    fun selectOnlyWeekends() {
        selectWeekends()
        deselectWeekdays()
    }

    fun selectWeekdays() {
        weekdaysEnums.forEach { selectDayOfWeek(it) }
    }

    fun deselectWeekdays() {
        weekdaysEnums.forEach { deselectDayOfWeek(it) }
    }

    fun selectWeekends() {
        weekendsEnums.forEach { selectDayOfWeek(it) }
    }

    fun deselectWeekends() {
        weekendsEnums.forEach { deselectDayOfWeek(it) }
    }

    fun selectDayOfWeek(dayOfWeek: DayOfWeek) {
        daysOfWeekStates[dayOfWeek] = true
    }

    fun deselectDayOfWeek(dayOfWeek: DayOfWeek) {
        daysOfWeekStates[dayOfWeek] = false
    }
}