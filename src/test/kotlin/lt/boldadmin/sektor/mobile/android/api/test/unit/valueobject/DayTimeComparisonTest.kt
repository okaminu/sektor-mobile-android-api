package lt.boldadmin.sektor.mobile.android.api.test.unit.valueobject

import lt.boldadmin.sektor.mobile.android.api.valueobject.DayTime
import lt.boldadmin.sektor.mobile.android.api.valueobject.TimeRange
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class DayTimeComparisonTest {

    @Test
    fun `Returns 0 when same day time are compared`() {
        assertEquals(0, DayTime(
                time = TimeRange(
                        10,
                        20
                ), dayOfWeekIndex = 2
        ).compareTo(DayTime(dayOfWeekIndex = 2)))
    }

    @Test
    fun `Returns 1 when day time is compared to the previous day's`() {
        assertEquals(1, DayTime(dayOfWeekIndex = 3).compareTo(
                DayTime(dayOfWeekIndex = 2)
        ))
    }

    @Test
    fun `Returns -1 when day time is compared to the following day's`() {
        assertEquals(-1, DayTime(dayOfWeekIndex = 2).compareTo(
                DayTime(dayOfWeekIndex = 3)
        ))
    }
}
