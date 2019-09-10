package lt.boldadmin.sektor.mobile.android.api.gateway

import lt.boldadmin.sektor.mobile.android.api.valueobject.GpsCoordinates

interface WorklogGateway {
    fun getProjectNameOfStartedWork(): String
    fun hasWorkStarted(): Boolean
    fun logByLocation(gpsCoordinates: GpsCoordinates)
}
