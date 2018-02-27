package lt.tlistas.loginn.mobile.android.api.gateway

interface AuthenticationGateway {
    fun registerMobileNumber(mobileNumber: String)

    fun confirmCode(confirmationCode: String): String
}