package lt.boldadmin.sektor.mobile.android.api.test.unit.valueobject

import lt.boldadmin.sektor.mobile.android.api.valueobject.Day
import lt.boldadmin.sektor.mobile.android.api.valueobject.DayOfWeek.TUESDAY
import lt.boldadmin.sektor.mobile.android.api.valueobject.DayOfWeek.WEDNESDAY
import lt.boldadmin.sektor.mobile.android.api.valueobject.MinuteRange
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class DayComparisonTest {

    @Test
    fun `Returns 0 when same days of week are compared`() {
        assertEquals(0, Day(TUESDAY, MinuteRange(10, 20)).compareTo(Day(TUESDAY)))
    }

    @Test
    fun `Returns 1 when day is compared to the previous day`() {
        assertEquals(1, Day(WEDNESDAY).compareTo(Day(TUESDAY)))
    }

    @Test
    fun `Returns -1 when day is compared to the following day`() {
        assertEquals(-1, Day(TUESDAY).compareTo(Day(WEDNESDAY)))
    }
}
