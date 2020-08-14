package lt.boldadmin.sektor.mobile.android.api.gateway

import lt.boldadmin.sektor.mobile.android.api.type.valueobject.Coordinates
import lt.boldadmin.sektor.mobile.android.api.type.valueobject.DayMinuteInterval
import java.util.*

interface CollaboratorGateway {

    fun updateCoordinates(coordinates: Coordinates)

    fun getWorkWeek(): SortedSet<DayMinuteInterval>
}
