package com.superkookai.birthdayapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.superkookai.birthdayapp.ui.theme.BirthdayAppTheme

@Composable
fun ComposeArticleScreen(modifier: Modifier = Modifier) {
    Column() {
        Image(painter = painterResource(R.drawable.bg_compose_background),
            contentDescription = null,
            contentScale = ContentScale.FillWidth)

        Text("Jetpack Compose tutorial", fontSize = 24.sp,
            modifier = Modifier.padding(16.dp))

        Text("Jetpack Compose is a modern toolkit for building " +
                "native Android UI. Compose simplifies and accelerates UI " +
                "development on Android with less code, powerful tools, " +
                "and intuitive Kotlin APIs.", modifier = Modifier.padding(horizontal = 16.dp),
            textAlign = TextAlign.Justify)

        Text("In this tutorial, you build a simple UI component with " +
                "declarative functions. You call Compose functions to say what " +
                "elements you want and the Compose compiler does the rest. " +
                "Compose is built around Composable functions. These functions " +
                "let you define your app\'s UI programmatically because they " +
                "let you describe how it should look and provide data dependencies, " +
                "rather than focus on the process of the UI\'s construction, " +
                "such as initializing an element and then attaching it to a parent." +
                " To create a Composable function, you add the @Composable " +
                "annotation to the function name.",
            modifier = Modifier.padding(16.dp), textAlign = TextAlign.Justify
        )
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun PreviewArticle() {
    BirthdayAppTheme {
        ComposeArticleScreen()
    }
}