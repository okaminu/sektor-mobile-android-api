package lt.boldadmin.sektor.mobile.android.api.gateway

import lt.boldadmin.sektor.mobile.android.api.type.entity.WorkLogIntervalEndpoints
import lt.boldadmin.sektor.mobile.android.api.valueobject.GpsCoordinates

interface WorkLogGateway {
    fun getIntervalIdsByCollaborator(): List<String>
    fun getProjectNameOfStartedWork(): String
    fun hasWorkStarted(): Boolean
    fun getIntervalEndpoints(intervalId: String): WorkLogIntervalEndpoints
    fun getDescription(intervalId: String): String
    fun getDurationsSum(intervalIds: Collection<String>): Long
    fun logByLocation(gpsCoordinates: GpsCoordinates)
    fun updateDescription(intervalId: String, description: String)
}
