package lt.boldadmin.sektor.mobile.android.api.test.unit.valueobject

import lt.boldadmin.sektor.mobile.android.api.valueobject.DayMinuteInterval
import lt.boldadmin.sektor.mobile.android.api.valueobject.DayOfWeek.TUESDAY
import lt.boldadmin.sektor.mobile.android.api.valueobject.MinuteInterval
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class DayMinuteIntervalTest {

    @Test
    fun `Contains day of week`() {
        assertEquals(TUESDAY, DayMinuteInterval(TUESDAY).dayOfWeek)
    }

    @Test
    fun `Contains enabled state`() {
        assertTrue(DayMinuteInterval(enabled = true).enabled)
    }

    @Test
    fun `Contains minute interval`() {
        assertEquals(MinuteInterval(12, 34), DayMinuteInterval(interval = MinuteInterval(12, 34)).interval)
    }
}
