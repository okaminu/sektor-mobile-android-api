package lt.boldadmin.sektor.mobile.android.api.gateway

import lt.boldadmin.sektor.mobile.android.api.type.entity.WorkLogIntervalEndpoints

interface WorklogGateway {
    fun getIntervalIdsByCollaborator(): Collection<String>
    fun getProjectNameOfStartedWork(): String
    fun hasWorkStarted(): Boolean
    fun getIntervalEndpoints(intervalId: String): WorkLogIntervalEndpoints
}
