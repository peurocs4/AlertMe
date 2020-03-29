package com.peurocs4.alertme.time

import org.junit.Assert.assertEquals
import org.junit.Test

class TimeTest {
    @Test
    fun dayInHours() {
        assertEquals(24, Time.DAY.inHours().toInt())
    }

    @Test
    fun dayInMinutes() {
        assertEquals(24 * 60, Time.DAY.inMinutes().toInt())
    }

    @Test
    fun dayInSeconds() {
        assertEquals(24 * 60 * 60, Time.DAY.inSeconds().toInt())
    }

    @Test
    fun hourInDays() {
        assertEquals(1.0 / 24, Time.HOUR.inDays(), 0.00001)
    }

    @Test
    fun hourInMinutes() {
        assertEquals(60, Time.HOUR.inMinutes().toInt())
    }

    @Test
    fun hourInSeconds() {
        assertEquals(60 * 60, Time.HOUR.inSeconds().toInt())
    }

    @Test
    fun minuteInDays() {
        assertEquals(1.0 / 60 / 24, Time.MINUTE.inDays(), 0.00001)
    }

    @Test
    fun minuteInHours() {
        assertEquals(1.0 / 60, Time.MINUTE.inHours(), 0.00001)
    }

    @Test
    fun minuteInSeconds() {
        assertEquals(60, Time.MINUTE.inSeconds().toInt())
    }

    @Test
    fun secondInDays() {
        assertEquals(1.0 / 60 / 60 / 24, Time.SECOND.inDays(), 0.00001)
    }

    @Test
    fun secondInHours() {
        assertEquals(1.0 / 60 / 60, Time.SECOND.inHours(), 0.00001)
    }

    @Test
    fun secondsInMinutes() {
        assertEquals(1.0 / 60, Time.SECOND.inMinutes(), 0.00001)
    }
}