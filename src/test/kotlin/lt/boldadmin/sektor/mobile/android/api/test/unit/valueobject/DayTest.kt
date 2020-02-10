package lt.boldadmin.sektor.mobile.android.api.test.unit.valueobject

import lt.boldadmin.sektor.mobile.android.api.valueobject.Day
import lt.boldadmin.sektor.mobile.android.api.valueobject.DayOfWeek.TUESDAY
import lt.boldadmin.sektor.mobile.android.api.valueobject.MinuteRange
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class DayTest {

    @Test
    fun `Contains day of week`() {
        assertEquals(TUESDAY, Day(TUESDAY).dayOfWeek)
    }

    @Test
    fun `Contains enabled state`() {
        assertTrue(Day(enabled = true).enabled)
    }

    @Test
    fun `Contains minute range`() {
        assertEquals(MinuteRange(12, 34), Day(minuteRange = MinuteRange(12, 34)).minuteRange)
    }
}
