package lt.boldadmin.sektor.mobile.android.api.gateway

import lt.boldadmin.sektor.mobile.android.api.valueobject.GpsCoordinates
import lt.boldadmin.sektor.mobile.android.api.valueobject.WorkTime

interface CollaboratorGateway {

    fun updateCoordinates(gpsCoordinates: GpsCoordinates)

    fun getWorkTime(): WorkTime
}
