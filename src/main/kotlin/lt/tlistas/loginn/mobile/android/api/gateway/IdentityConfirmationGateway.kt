package lt.tlistas.loginn.mobile.android.api.gateway

interface IdentityConfirmationGateway {
    fun requestCode(mobileNumber: String)

    fun confirmCode(confirmationCode: String): String
}