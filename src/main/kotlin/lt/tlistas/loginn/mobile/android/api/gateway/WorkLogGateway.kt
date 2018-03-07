package lt.tlistas.loginn.mobile.android.api.gateway

import lt.tlistas.loginn.mobile.android.api.type.valueobject.GpsCoordinates

interface WorkLogGateway {
    fun logByLocation(gpsCoordinates: GpsCoordinates)
}
