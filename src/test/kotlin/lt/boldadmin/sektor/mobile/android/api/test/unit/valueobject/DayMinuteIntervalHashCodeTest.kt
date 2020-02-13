package lt.boldadmin.sektor.mobile.android.api.test.unit.valueobject

import lt.boldadmin.sektor.mobile.android.api.valueobject.DayMinuteInterval
import lt.boldadmin.sektor.mobile.android.api.valueobject.DayOfWeek.TUESDAY
import lt.boldadmin.sektor.mobile.android.api.valueobject.MinuteInterval
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class DayMinuteIntervalHashCodeTest {

    @Test
    fun `Generates hash code`() {
        assertEquals(1, DayMinuteInterval(TUESDAY, MinuteInterval(100, 200), false).hashCode())
    }

    @Test
    fun `Equal days have equal hash code`() {
        val firstDay = DayMinuteInterval(TUESDAY)
        val secondDay = DayMinuteInterval(TUESDAY)

        assertTrue(firstDay == secondDay)
        assertTrue(firstDay.hashCode() == secondDay.hashCode())
    }

    @Test
    fun `Is consistent`() {
        val day = DayMinuteInterval(TUESDAY)

        assertTrue(day.hashCode() == day.hashCode())
        assertTrue(day.hashCode() == day.hashCode())
    }
}
