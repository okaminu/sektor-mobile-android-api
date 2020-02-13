package lt.boldadmin.sektor.mobile.android.api.test.unit.valueobject

import lt.boldadmin.sektor.mobile.android.api.valueobject.DayMinuteInterval
import lt.boldadmin.sektor.mobile.android.api.valueobject.DayOfWeek.TUESDAY
import lt.boldadmin.sektor.mobile.android.api.valueobject.DayOfWeek.WEDNESDAY
import lt.boldadmin.sektor.mobile.android.api.valueobject.MinuteInterval
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class DayMinuteIntervalComparisonTest {

    @Test
    fun `Returns 0 when same days of week are compared`() {
        assertEquals(0, DayMinuteInterval(TUESDAY, MinuteInterval(10, 20)).compareTo(DayMinuteInterval(TUESDAY)))
    }

    @Test
    fun `Returns 1 when day is compared to the previous day`() {
        assertEquals(1, DayMinuteInterval(WEDNESDAY).compareTo(DayMinuteInterval(TUESDAY)))
    }

    @Test
    fun `Returns -1 when day is compared to the following day`() {
        assertEquals(-1, DayMinuteInterval(TUESDAY).compareTo(DayMinuteInterval(WEDNESDAY)))
    }
}
