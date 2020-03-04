package lt.boldadmin.sektor.mobile.android.api.gateway

import lt.boldadmin.sektor.mobile.android.api.valueobject.DayMinuteInterval
import lt.boldadmin.sektor.mobile.android.api.valueobject.GpsCoordinates
import java.util.*

interface CollaboratorGateway {

    fun updateCoordinates(gpsCoordinates: GpsCoordinates)

    fun getWorkWeek(): SortedSet<DayMinuteInterval>
}
