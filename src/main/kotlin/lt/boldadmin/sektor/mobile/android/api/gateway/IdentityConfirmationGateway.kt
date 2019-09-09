package lt.boldadmin.sektor.mobile.android.api.gateway

interface IdentityConfirmationGateway {
    fun requestCode(mobileNumber: String)

    fun confirmCode(confirmationCode: String): String
}
