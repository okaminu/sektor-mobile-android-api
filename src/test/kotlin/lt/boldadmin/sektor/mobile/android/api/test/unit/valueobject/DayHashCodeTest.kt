package lt.boldadmin.sektor.mobile.android.api.test.unit.valueobject

import lt.boldadmin.sektor.mobile.android.api.valueobject.Day
import lt.boldadmin.sektor.mobile.android.api.valueobject.MinuteRange
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class DayHashCodeTest {

    @Test
    fun `Generates hash code`() {
        assertEquals(1, Day(MinuteRange(100, 200), false, 1).hashCode())
    }

    @Test
    fun `Equal days have equal hash code`() {
        val firstDay = Day(dayOfWeekIndex = 2)
        val secondDay = Day(dayOfWeekIndex = 2)

        assertTrue(firstDay == secondDay)
        assertTrue(firstDay.hashCode() == secondDay.hashCode())
    }

    @Test
    fun `Is consistent`() {
        val day = Day(dayOfWeekIndex = 2)

        assertTrue(day.hashCode() == day.hashCode())
        assertTrue(day.hashCode() == day.hashCode())
    }
}
