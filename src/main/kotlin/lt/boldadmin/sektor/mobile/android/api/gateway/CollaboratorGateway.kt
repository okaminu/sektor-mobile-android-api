package lt.boldadmin.sektor.mobile.android.api.gateway

import lt.boldadmin.sektor.mobile.android.api.valueobject.GpsCoordinates

interface CollaboratorGateway {
    fun updateLocation(gpsCoordinates: GpsCoordinates)
}
