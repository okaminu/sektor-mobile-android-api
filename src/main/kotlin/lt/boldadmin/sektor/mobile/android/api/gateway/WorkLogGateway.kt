package lt.boldadmin.sektor.mobile.android.api.gateway

import lt.boldadmin.sektor.mobile.android.api.valueobject.GpsCoordinates

interface WorkLogGateway {
    fun getIntervalIdsByCollaborator(): List<String>
    fun getProjectNameOfStartedWork(): String
    fun hasWorkStarted(): Boolean
    fun getDescription(intervalId: String): String
    fun getDurationsSum(intervalIds: Collection<String>): Long
    fun logByLocation(gpsCoordinates: GpsCoordinates)
    fun updateDescription(intervalId: String, description: String)
}
