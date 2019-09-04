package lt.boldadmin.sektor.mobile.android.api.gateway

import lt.boldadmin.sektor.mobile.android.api.valueobject.GpsCoordinates
import lt.boldadmin.sektor.mobile.android.api.valueobject.WorkTime

interface CollaboratorGateway {

    fun updateLocation(gpsCoordinates: GpsCoordinates)

    fun getWorkTime(): WorkTime
}
