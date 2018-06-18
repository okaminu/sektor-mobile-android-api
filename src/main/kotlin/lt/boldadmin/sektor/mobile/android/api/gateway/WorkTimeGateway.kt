package lt.boldadmin.sektor.mobile.android.api.gateway

import lt.boldadmin.sektor.mobile.android.api.valueobject.WorkTime

interface WorkTimeGateway {
    fun getWorkTime(): WorkTime
}
