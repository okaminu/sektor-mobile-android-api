package lt.boldadmin.sektor.mobile.android.api.test.unit.valueobject

import lt.boldadmin.sektor.mobile.android.api.valueobject.Day
import lt.boldadmin.sektor.mobile.android.api.valueobject.MinuteRange
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class DayComparisonTest {

    @Test
    fun `Returns 0 when same days of week are compared`() {
        assertEquals(0, Day(minuteRange = MinuteRange(10, 20), dayOfWeekIndex = 2).compareTo(Day(dayOfWeekIndex = 2)))
    }

    @Test
    fun `Returns 1 when day is compared to the previous day`() {
        assertEquals(1, Day(dayOfWeekIndex = 3).compareTo(Day(dayOfWeekIndex = 2)))
    }

    @Test
    fun `Returns -1 when day is compared to the following day`() {
        assertEquals(-1, Day(dayOfWeekIndex = 2).compareTo(Day(dayOfWeekIndex = 3)))
    }
}
