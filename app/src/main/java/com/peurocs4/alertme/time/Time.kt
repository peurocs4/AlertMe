package com.peurocs4.alertme.time

enum class Time {
    DAY {
        override fun inHours(): Double {
            return 24.0
        }

        override fun inMinutes(): Double {
            return this.inHours() * HOUR.inMinutes()
        }

        override fun inSeconds(): Double {
            return this.inMinutes() * MINUTE.inSeconds()
        }
    },
    HOUR {
        override fun inDays(): Double {
            return 1 / DAY.inHours()
        }

        override fun inMinutes(): Double {
            return 60.0
        }

        override fun inSeconds(): Double {
            return this.inMinutes() * MINUTE.inSeconds()
        }
    },
    MINUTE {
        override fun inDays(): Double {
            return 1 / DAY.inMinutes()
        }

        override fun inHours(): Double {
            return 1 / HOUR.inMinutes()
        }

        override fun inSeconds(): Double {
            return 60.0
        }
    },
    SECOND {
        override fun inDays(): Double {
            return 1 / DAY.inSeconds()
        }

        override fun inHours(): Double {
            return 1 / HOUR.inSeconds()
        }

        override fun inMinutes(): Double {
            return 1 / MINUTE.inSeconds()
        }
    };

    open fun inDays(): Double {
        return 1.0
    }

    open fun inHours(): Double {
        return 1.0
    }

    open fun inMinutes(): Double {
        return 1.0
    }

    open fun inSeconds(): Double {
        return 1.0
    }
}