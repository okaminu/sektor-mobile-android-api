package lt.boldadmin.sektor.mobile.android.api.test.unit.valueobject

import lt.boldadmin.sektor.mobile.android.api.valueobject.DayTime
import lt.boldadmin.sektor.mobile.android.api.valueobject.TimeRange
import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class DayTimeEqualityTest {

    @Test
    fun `Returns true when same day time are compared`() {
        assertTrue(
                DayTime(
                        time = TimeRange(
                                10,
                                20
                        ), dayOfWeekIndex = 2
                ) == DayTime(dayOfWeekIndex = 2)
        )
    }

    @Test
    fun `Returns false when different day times are compared`() {
        assertFalse(
                DayTime(dayOfWeekIndex = 2) == DayTime(
                        dayOfWeekIndex = 3
                )
        )
    }

    @Test
    @Suppress("ReplaceCallWithBinaryOperator")
    fun `Returns false when comparing with other types`() {
        assertFalse(DayTime().equals(Pair("", "")))
    }

    @Test
    fun `Is reflexive`() {
        val workDay = DayTime(dayOfWeekIndex = 2)

        assertTrue(workDay == workDay)
    }

    @Test
    fun `Is symmetric`() {
        val firstWorkDay = DayTime(dayOfWeekIndex = 2)
        val secondWorkDay = DayTime(dayOfWeekIndex = 2)

        assertTrue(firstWorkDay == secondWorkDay)
        assertTrue(secondWorkDay == firstWorkDay)
    }

    @Test
    fun `Is transitive`() {
        val firstWorkDay = DayTime(dayOfWeekIndex = 2)
        val secondWorkDay = DayTime(dayOfWeekIndex = 2)
        val thirdWorkDay = DayTime(dayOfWeekIndex = 2)

        assertTrue(firstWorkDay == secondWorkDay)
        assertTrue(firstWorkDay == thirdWorkDay)
    }

    @Test
    fun `Is consistent`() {
        val firstWorkDay = DayTime(dayOfWeekIndex = 2)
        val secondWorkDay = DayTime(dayOfWeekIndex = 2)

        assertTrue(firstWorkDay == secondWorkDay)
        assertTrue(firstWorkDay == secondWorkDay)
    }

    @Test
    @Suppress("SENSELESS_COMPARISON")
    fun `Never equal to null`() {
        assertFalse(DayTime(dayOfWeekIndex = 2) == null)
    }

}
