package lt.boldadmin.sektor.mobile.android.api.test.unit.valueobject

import lt.boldadmin.sektor.mobile.android.api.valueobject.Day
import lt.boldadmin.sektor.mobile.android.api.valueobject.DayOfWeek.TUESDAY
import lt.boldadmin.sektor.mobile.android.api.valueobject.DayOfWeek.WEDNESDAY
import lt.boldadmin.sektor.mobile.android.api.valueobject.MinuteRange
import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class DayEqualityTest {

    @Test
    fun `Returns true when same days of week are compared`() {
        assertTrue(Day(TUESDAY, MinuteRange(10, 20)) == Day(TUESDAY))
    }

    @Test
    fun `Returns false when different days are compared`() {
        assertFalse(Day(TUESDAY) == Day(WEDNESDAY))
    }

    @Test
    @Suppress("ReplaceCallWithBinaryOperator")
    fun `Returns false when comparing with other types`() {
        assertFalse(Day().equals(Pair("", "")))
    }

    @Test
    fun `Is reflexive`() {
        val day = Day(TUESDAY)

        assertTrue(day == day)
    }

    @Test
    fun `Is symmetric`() {
        val firstDay = Day(TUESDAY)
        val secondDay = Day(TUESDAY)

        assertTrue(firstDay == secondDay)
        assertTrue(secondDay == firstDay)
    }

    @Test
    fun `Is transitive`() {
        val firstDay = Day(TUESDAY)
        val secondDay = Day(TUESDAY)
        val thirdDay = Day(TUESDAY)

        assertTrue(firstDay == secondDay)
        assertTrue(firstDay == thirdDay)
    }

    @Test
    fun `Is consistent`() {
        val firstDay = Day(TUESDAY)
        val secondDay = Day(TUESDAY)

        assertTrue(firstDay == secondDay)
        assertTrue(firstDay == secondDay)
    }

    @Test
    @Suppress("SENSELESS_COMPARISON")
    fun `Never equal to null`() {
        assertFalse(Day(TUESDAY) == null)
    }

}
