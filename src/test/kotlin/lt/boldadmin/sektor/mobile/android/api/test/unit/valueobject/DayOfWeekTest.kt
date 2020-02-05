package lt.boldadmin.sektor.mobile.android.api.test.unit.valueobject

import lt.boldadmin.sektor.mobile.android.api.valueobject.DayOfWeek
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertThrows
import org.junit.jupiter.api.Test
import java.time.DateTimeException

class DayOfWeekTest {

    @Test
    fun `Creates by index`() {
        assertEquals(DayOfWeek.MONDAY, DayOfWeek.of(1))
        assertEquals(DayOfWeek.TUESDAY, DayOfWeek.of(2))
        assertEquals(DayOfWeek.WEDNESDAY, DayOfWeek.of(3))
        assertEquals(DayOfWeek.THURSDAY, DayOfWeek.of(4))
        assertEquals(DayOfWeek.FRIDAY, DayOfWeek.of(5))
        assertEquals(DayOfWeek.SATURDAY, DayOfWeek.of(6))
        assertEquals(DayOfWeek.SUNDAY, DayOfWeek.of(7))
    }

    @Test
    fun `Throws exception when index is out of upper bound`() {
        assertThrows(DateTimeException::class.java) {
            DayOfWeek.of(8)
        }
    }

    @Test
    fun `Throws exception when index is out of lower bound`() {
        assertThrows(DateTimeException::class.java) {
            DayOfWeek.of(0)
        }
    }
}
