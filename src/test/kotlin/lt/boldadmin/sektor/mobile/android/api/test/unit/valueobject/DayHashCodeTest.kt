package lt.boldadmin.sektor.mobile.android.api.test.unit.valueobject

import lt.boldadmin.sektor.mobile.android.api.valueobject.Day
import lt.boldadmin.sektor.mobile.android.api.valueobject.DayOfWeek.TUESDAY
import lt.boldadmin.sektor.mobile.android.api.valueobject.MinuteRange
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class DayHashCodeTest {

    @Test
    fun `Generates hash code`() {
        assertEquals(1, Day(TUESDAY, MinuteRange(100, 200), false).hashCode())
    }

    @Test
    fun `Equal days have equal hash code`() {
        val firstDay = Day(TUESDAY)
        val secondDay = Day(TUESDAY)

        assertTrue(firstDay == secondDay)
        assertTrue(firstDay.hashCode() == secondDay.hashCode())
    }

    @Test
    fun `Is consistent`() {
        val day = Day(TUESDAY)

        assertTrue(day.hashCode() == day.hashCode())
        assertTrue(day.hashCode() == day.hashCode())
    }
}
