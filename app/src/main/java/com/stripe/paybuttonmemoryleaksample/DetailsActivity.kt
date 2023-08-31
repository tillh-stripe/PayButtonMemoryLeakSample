package com.stripe.paybuttonmemoryleaksample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import com.google.pay.button.PayButton

private val allowedPaymentMethods = """
    [
      {
        "type": "CARD",
        "parameters": {
          "allowedAuthMethods": ["PAN_ONLY","CRYPTOGRAM_3DS"],
          "allowedCardNetworks": ["AMEX", "DISCOVER", "INTERAC", "JCB", "MASTERCARD", "VISA"]
        }
      }
    ]
""".trimIndent()

class DetailsActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            Column {
                PayButton(
                    onClick = {
                        // Nothing to do here
                    },
                    allowedPaymentMethods = allowedPaymentMethods,
                    modifier = Modifier.fillMaxWidth(),
                )

                Button(onClick = this@DetailsActivity::finish) {
                    Text("Close me")
                }
            }
        }
    }
}
