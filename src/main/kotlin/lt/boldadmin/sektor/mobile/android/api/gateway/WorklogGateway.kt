package lt.boldadmin.sektor.mobile.android.api.gateway

interface WorklogGateway {
    fun getProjectNameOfStartedWork(): String
    fun hasWorkStarted(): Boolean
}
