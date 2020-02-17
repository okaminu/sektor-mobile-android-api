package lt.boldadmin.sektor.mobile.android.api.test.unit.valueobject

import lt.boldadmin.sektor.mobile.android.api.valueobject.DayMinuteInterval
import lt.boldadmin.sektor.mobile.android.api.valueobject.DayOfWeek
import lt.boldadmin.sektor.mobile.android.api.valueobject.DayOfWeek.*
import lt.boldadmin.sektor.mobile.android.api.valueobject.MinuteInterval
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test

class DayMinuteIntervalTest {

    @Test
    fun `Contains day of week`() {
        assertEquals(TUESDAY, createDayMinuteInterval(TUESDAY).dayOfWeek)
    }

    @Test
    fun `Contains enabled state`() {
        assertTrue(createDayMinuteInterval(enabled = true).enabled)
    }

    @Test
    fun `Contains minute interval`() {
        assertEquals(MinuteInterval(12, 34), createDayMinuteInterval(interval = MinuteInterval(12, 34)).interval)
    }

    @Nested
    inner class ComparisonTests {
        @Test
        fun `Returns 0 when same days of week are compared`() {
            val firstDay = createDayMinuteInterval(TUESDAY, MinuteInterval(10, 20))
            val secondDay = createDayMinuteInterval(TUESDAY)

            val compareResult = firstDay.compareTo(secondDay)

            assertEquals(0, compareResult)
        }

        @Test
        fun `Returns 1 when day is compared to the previous day`() {
            assertEquals(1, createDayMinuteInterval(WEDNESDAY).compareTo(createDayMinuteInterval(TUESDAY)))
        }

        @Test
        fun `Returns -1 when day is compared to the following day`() {
            assertEquals(-1, createDayMinuteInterval(TUESDAY).compareTo(createDayMinuteInterval(WEDNESDAY)))
        }
    }

    @Nested
    inner class EqualityTests {
        @Test
        fun `Returns true when same days of week are compared`() {
            assertTrue(createDayMinuteInterval(TUESDAY, MinuteInterval(10, 20)) == createDayMinuteInterval(TUESDAY))
        }

        @Test
        fun `Returns false when different days are compared`() {
            assertFalse(createDayMinuteInterval(TUESDAY) == createDayMinuteInterval(WEDNESDAY))
        }

        @Test
        @Suppress("ReplaceCallWithBinaryOperator")
        fun `Returns false when comparing with other types`() {
            assertFalse(createDayMinuteInterval().equals(Pair("", "")))
        }

        @Test
        fun `Is reflexive`() {
            val day = createDayMinuteInterval(TUESDAY)

            assertTrue(day == day)
        }

        @Test
        fun `Is symmetric`() {
            val firstDay = createDayMinuteInterval(TUESDAY)
            val secondDay = createDayMinuteInterval(TUESDAY)

            assertTrue(firstDay == secondDay)
            assertTrue(secondDay == firstDay)
        }

        @Test
        fun `Is transitive`() {
            val firstDay = createDayMinuteInterval(TUESDAY)
            val secondDay = createDayMinuteInterval(TUESDAY)
            val thirdDay = createDayMinuteInterval(TUESDAY)

            assertTrue(firstDay == secondDay)
            assertTrue(firstDay == thirdDay)
        }

        @Test
        fun `Is consistent`() {
            val firstDay = createDayMinuteInterval(TUESDAY)
            val secondDay = createDayMinuteInterval(TUESDAY)

            assertTrue(firstDay == secondDay)
            assertTrue(firstDay == secondDay)
        }

        @Test
        @Suppress("SENSELESS_COMPARISON")
        fun `Never equal to null`() {
            assertFalse(createDayMinuteInterval(TUESDAY) == null)
        }

    }

    @Nested
    inner class HashCodeTests {

        @Test
        fun `Generates hash code`() {
            assertEquals(1, createDayMinuteInterval(TUESDAY, MinuteInterval(100, 200), false).hashCode())
        }

        @Test
        fun `Equal days have equal hash code`() {
            val firstDay = createDayMinuteInterval(TUESDAY)
            val secondDay = createDayMinuteInterval(TUESDAY)

            assertTrue(firstDay == secondDay)
            assertTrue(firstDay.hashCode() == secondDay.hashCode())
        }

        @Test
        fun `Is consistent`() {
            val day = createDayMinuteInterval(TUESDAY)

            assertTrue(day.hashCode() == day.hashCode())
            assertTrue(day.hashCode() == day.hashCode())
        }

    }

    private fun createDayMinuteInterval(
        dayOfWeek: DayOfWeek = MONDAY,
        interval: MinuteInterval = MinuteInterval(0, 0),
        enabled: Boolean = false
    ) = DayMinuteInterval(dayOfWeek, interval, enabled)

}
