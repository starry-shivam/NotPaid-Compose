/**
 *  DO WHAT THE FUCK YOU WANT TO PUBLIC LICENSE
 *  Version 2, December 2004
 *
 *  Copyright (C) 2024 Stɑrry Shivɑm <starry@krsh.dev>
 *
 *  Everyone is permitted to copy and distribute verbatim or modified
 *  copies of this license document, and changing it is allowed as long
 *  as the name is changed.
 *
 *  DO WHAT THE FUCK YOU WANT TO PUBLIC LICENSE
 *  TERMS AND CONDITIONS FOR COPYING, DISTRIBUTION AND MODIFICATION
 *
 *  0. You just DO WHAT THE FUCK YOU WANT TO.
 */

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.tooling.preview.Preview
import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.time.temporal.ChronoUnit

@Composable
fun EnsurePayment(
    dueDate: String,
    gracePeriod: Int,
    content: @Composable () -> Unit
) {
    val formatter = remember { DateTimeFormatter.ofPattern("yyyy-MM-dd") }
    val parsedDueDate = remember(dueDate) { LocalDate.parse(dueDate, formatter) }
    val currentDate = remember { LocalDate.now() }

    // Calculate the number of days past the due date
    val daysPastDue = remember(parsedDueDate, currentDate) {
        ChronoUnit.DAYS.between(parsedDueDate, currentDate).toInt()
    }

    // Calculate opacity based on days past due date
    val opacity = remember(daysPastDue, gracePeriod) {
        when {
            // Fully visible until due date
            daysPastDue <= 0 -> 1f
            // Fully invisible after grace period
            daysPastDue >= gracePeriod -> 0f
            // Gradually decrease opacity
            else -> 1 - (daysPastDue / gracePeriod.toFloat())
        }
    }

    Box(modifier = Modifier.graphicsLayer(alpha = opacity)) {
        content()
    }
}

@Preview(showBackground = true)
@Composable
private fun NeverGonnaPayYouUpPreview() {
    EnsurePayment(
        dueDate = "2024-08-24",
        gracePeriod = 14
    ) {
        Text("Meow >~<")
    }
}
