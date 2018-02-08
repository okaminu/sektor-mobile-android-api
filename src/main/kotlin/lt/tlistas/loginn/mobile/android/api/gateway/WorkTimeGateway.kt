package lt.tlistas.loginn.mobile.android.api.gateway

import lt.tlistas.loginn.mobile.android.api.type.valueobject.WorkTime

interface WorkTimeGateway {
    fun getWorkTime(): WorkTime
}
