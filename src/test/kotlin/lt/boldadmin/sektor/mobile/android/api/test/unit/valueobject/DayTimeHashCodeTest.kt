package lt.boldadmin.sektor.mobile.android.api.test.unit.valueobject

import lt.boldadmin.sektor.mobile.android.api.valueobject.DayTime
import lt.boldadmin.sektor.mobile.android.api.valueobject.TimeRange
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class DayTimeHashCodeTest {

    @Test
    fun `Generates hash code`() {
        assertEquals(1, DayTime(
                TimeRange(
                        100,
                        200
                ), false, 1
        ).hashCode())
    }

    @Test
    fun `Equal day times have equal hash code`() {
        val firstWorkDay = DayTime(dayOfWeekIndex = 2)
        val secondWorkDay = DayTime(dayOfWeekIndex = 2)

        assertTrue(firstWorkDay == secondWorkDay)
        assertTrue(firstWorkDay.hashCode() == secondWorkDay.hashCode())
    }

    @Test
    fun `Is consistent`() {
        val workDay = DayTime(dayOfWeekIndex = 2)

        assertTrue(workDay.hashCode() == workDay.hashCode())
        assertTrue(workDay.hashCode() == workDay.hashCode())
    }
}
