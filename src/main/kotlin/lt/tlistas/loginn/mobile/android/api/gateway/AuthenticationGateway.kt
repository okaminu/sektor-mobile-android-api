package lt.tlistas.loginn.mobile.android.api.gateway

interface AuthenticationGateway {
    fun requestConfirmationCode(mobileNumber: String)

    fun confirmCode(confirmationCode: String): String
}