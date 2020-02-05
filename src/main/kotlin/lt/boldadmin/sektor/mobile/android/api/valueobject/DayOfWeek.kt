package lt.boldadmin.sektor.mobile.android.api.valueobject

import java.time.DateTimeException

enum class DayOfWeek {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;

    companion object {
        fun of(index: Int): DayOfWeek {
            if (index <= 0 || index >= 8 )
                throw DateTimeException("Given index $index is out of bounds")

            return values().toList()[index - 1]
        }
    }
}
