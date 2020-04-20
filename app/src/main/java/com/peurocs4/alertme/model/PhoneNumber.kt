package com.peurocs4.alertme.model

import java.util.regex.Pattern

class PhoneNumber {
    companion object {
        private val INVALID_EXCEPTION_MESSAGE =
            { phone: String -> "$phone is not a valid phone number. REGEX: $REGEX" }
        private const val REGEX = "(\\d{3,4}-?)?\\d{3,4}-?\\d{4}"

        fun isValid(phoneNumber: String): Boolean {
            val phonePattern = Pattern.compile(REGEX)
            return phonePattern.matcher(phoneNumber).find()
        }
    }

    var phoneNumber: String
        set(value) {
            check(isValid(value)) { INVALID_EXCEPTION_MESSAGE(value) }

            field = value
        }

    var validationCheck: Boolean
        set(value) {
            check(!value || isValid(phoneNumber)) { INVALID_EXCEPTION_MESSAGE(phoneNumber) }

            field = value
        }

    constructor(phoneNumber: String, validationCheck: Boolean = true) {
        this.phoneNumber = phoneNumber
        this.validationCheck = validationCheck
    }
}