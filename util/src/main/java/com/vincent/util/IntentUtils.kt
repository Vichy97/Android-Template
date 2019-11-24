package com.vincent.util

import android.content.Intent
import android.net.Uri

object IntentUtils {

    fun getDialIntent(phoneNumber: String) =
        Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", phoneNumber, null))
}
