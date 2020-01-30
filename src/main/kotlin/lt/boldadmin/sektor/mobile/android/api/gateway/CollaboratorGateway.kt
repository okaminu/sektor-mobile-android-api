package lt.boldadmin.sektor.mobile.android.api.gateway

import lt.boldadmin.sektor.mobile.android.api.valueobject.DayTime
import lt.boldadmin.sektor.mobile.android.api.valueobject.GpsCoordinates
import java.util.*

interface CollaboratorGateway {

    fun updateCoordinates(gpsCoordinates: GpsCoordinates)

    fun getWorkTime(): SortedSet<DayTime>
}
