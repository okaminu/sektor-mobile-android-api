package lt.boldadmin.sektor.mobile.android.api.test.unit.valueobject

import lt.boldadmin.sektor.mobile.android.api.valueobject.Day
import lt.boldadmin.sektor.mobile.android.api.valueobject.MinuteRange
import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class DayEqualityTest {

    @Test
    fun `Returns true when same days of week are compared`() {
        assertTrue(Day(minuteRange = MinuteRange(10, 20), dayOfWeekIndex = 2) == Day(dayOfWeekIndex = 2))
    }

    @Test
    fun `Returns false when different days are compared`() {
        assertFalse(Day(dayOfWeekIndex = 2) == Day(dayOfWeekIndex = 3))
    }

    @Test
    @Suppress("ReplaceCallWithBinaryOperator")
    fun `Returns false when comparing with other types`() {
        assertFalse(Day().equals(Pair("", "")))
    }

    @Test
    fun `Is reflexive`() {
        val day = Day(dayOfWeekIndex = 2)

        assertTrue(day == day)
    }

    @Test
    fun `Is symmetric`() {
        val firstDay = Day(dayOfWeekIndex = 2)
        val secondDay = Day(dayOfWeekIndex = 2)

        assertTrue(firstDay == secondDay)
        assertTrue(secondDay == firstDay)
    }

    @Test
    fun `Is transitive`() {
        val firstDay = Day(dayOfWeekIndex = 2)
        val secondDay = Day(dayOfWeekIndex = 2)
        val thirdDay = Day(dayOfWeekIndex = 2)

        assertTrue(firstDay == secondDay)
        assertTrue(firstDay == thirdDay)
    }

    @Test
    fun `Is consistent`() {
        val firstDay = Day(dayOfWeekIndex = 2)
        val secondDay = Day(dayOfWeekIndex = 2)

        assertTrue(firstDay == secondDay)
        assertTrue(firstDay == secondDay)
    }

    @Test
    @Suppress("SENSELESS_COMPARISON")
    fun `Never equal to null`() {
        assertFalse(Day(dayOfWeekIndex = 2) == null)
    }

}
