package lt.boldadmin.sektor.mobile.android.api.valueobject

data class MinuteInterval(var start: Short, var end: Short) {

    companion object {
        const val MIN: Short = 0
        const val MAX: Short = 1440
    }

}
