package lt.boldadmin.sektor.mobile.android.api.test.unit.valueobject

import lt.boldadmin.sektor.mobile.android.api.valueobject.DayMinuteInterval
import lt.boldadmin.sektor.mobile.android.api.valueobject.DayOfWeek.TUESDAY
import lt.boldadmin.sektor.mobile.android.api.valueobject.DayOfWeek.WEDNESDAY
import lt.boldadmin.sektor.mobile.android.api.valueobject.MinuteInterval
import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class DayMinuteIntervalEqualityTest {

    @Test
    fun `Returns true when same days of week are compared`() {
        assertTrue(DayMinuteInterval(TUESDAY, MinuteInterval(10, 20)) == DayMinuteInterval(TUESDAY))
    }

    @Test
    fun `Returns false when different days are compared`() {
        assertFalse(DayMinuteInterval(TUESDAY) == DayMinuteInterval(WEDNESDAY))
    }

    @Test
    @Suppress("ReplaceCallWithBinaryOperator")
    fun `Returns false when comparing with other types`() {
        assertFalse(DayMinuteInterval().equals(Pair("", "")))
    }

    @Test
    fun `Is reflexive`() {
        val day = DayMinuteInterval(TUESDAY)

        assertTrue(day == day)
    }

    @Test
    fun `Is symmetric`() {
        val firstDay = DayMinuteInterval(TUESDAY)
        val secondDay = DayMinuteInterval(TUESDAY)

        assertTrue(firstDay == secondDay)
        assertTrue(secondDay == firstDay)
    }

    @Test
    fun `Is transitive`() {
        val firstDay = DayMinuteInterval(TUESDAY)
        val secondDay = DayMinuteInterval(TUESDAY)
        val thirdDay = DayMinuteInterval(TUESDAY)

        assertTrue(firstDay == secondDay)
        assertTrue(firstDay == thirdDay)
    }

    @Test
    fun `Is consistent`() {
        val firstDay = DayMinuteInterval(TUESDAY)
        val secondDay = DayMinuteInterval(TUESDAY)

        assertTrue(firstDay == secondDay)
        assertTrue(firstDay == secondDay)
    }

    @Test
    @Suppress("SENSELESS_COMPARISON")
    fun `Never equal to null`() {
        assertFalse(DayMinuteInterval(TUESDAY) == null)
    }

}
