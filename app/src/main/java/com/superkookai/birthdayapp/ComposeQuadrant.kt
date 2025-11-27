package com.superkookai.birthdayapp

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.superkookai.birthdayapp.ui.theme.BirthdayAppTheme

@Composable
fun QuarantView(
    title: String,
    detail: String,
    color: Color,
    modifier: Modifier = Modifier
) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
            .fillMaxSize()
            .background(color)
            .padding(16.dp)
    ) {
        Text(text = title, fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 16.dp))
        Text(text = detail, textAlign = TextAlign.Justify)
    }
}

@Composable
fun QuarantScreen(modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier.fillMaxWidth()
    ) {
        Row(
            modifier = Modifier.weight(1f)
        ) {
            QuarantView(
                "Text composable",
                "Displays text and follows the recommended Material Design " +
                        "guidelines.", Color(0xFFEADDFF),
                modifier = Modifier.weight(0.7f)
            )
            QuarantView(
                "Image composable",
                "Creates a composable that lays out and draws a given " +
                        "Painter class object.", Color(0xFFD0BCFF),
                modifier = Modifier.weight(0.3f)
            )
        }

        Row(
            modifier = Modifier.weight(2f)
        ) {
            QuarantView(
                "Row composable",
                "A layout composable that places its children in a " +
                        "horizontal sequence.", Color(0xFFB69DF8),
                modifier = Modifier.weight(1f)
            )
            QuarantView(
                "Column composable",
                "A layout composable that places its children in a " +
                        "vertical sequence.", Color(0xFFF6EDFF),
                modifier = Modifier.weight(1.5f)
            )
        }
    }
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun PreviewQuarantView() {
    BirthdayAppTheme {
        QuarantScreen()
    }
}