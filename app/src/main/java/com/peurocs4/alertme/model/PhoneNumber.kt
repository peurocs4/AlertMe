package com.peurocs4.alertme.model

data class PhoneNumber(var phoneNumber: String) {
    var isRaw: Boolean = false
        private set

    override fun equals(other: Any?): Boolean {
        if (other == null || other !is PhoneNumber) return false

        return this.rawPhoneNumber() == other.rawPhoneNumber()
    }

    override fun hashCode(): Int {
        return this.rawPhoneNumber().hashCode()
    }

    fun rawPhoneNumber(): PhoneNumber{
        return if (this.isRaw) {
            this
        } else {
            val rawString = this.phoneNumber.replace("-", "").replace(" ", "")
            val rawPhoneNumber = PhoneNumber(rawString)
            rawPhoneNumber.isRaw = false
            rawPhoneNumber
        }
    }
}