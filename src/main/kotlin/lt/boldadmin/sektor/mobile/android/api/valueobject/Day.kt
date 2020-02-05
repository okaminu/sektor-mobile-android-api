package lt.boldadmin.sektor.mobile.android.api.valueobject

import lt.boldadmin.sektor.mobile.android.api.valueobject.DayOfWeek.MONDAY

data class Day(
    val dayOfWeek: DayOfWeek = MONDAY,
    val minuteRange: MinuteRange = MinuteRange(),
    val enabled: Boolean = false
): Comparable<Day> {

    override fun compareTo(other: Day): Int = this.dayOfWeek.compareTo(other.dayOfWeek)

    override fun equals(other: Any?): Boolean = other is Day && this.compareTo(other) == 0

    override fun hashCode(): Int = dayOfWeek.ordinal
}
