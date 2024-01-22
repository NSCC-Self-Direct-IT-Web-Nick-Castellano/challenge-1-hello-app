package com.example.helloappchallenge

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.helloappchallenge.ui.theme.HelloAppChallengeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HelloAppChallengeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    HelloWidget("Nick")
                }
            }
        }
    }
}

@Composable
fun HelloWidget(name: String, modifier: Modifier = Modifier) {

    Column (
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
            .fillMaxWidth()
            .fillMaxHeight()

    ) {
        Image(
            painter = painterResource(id = R.drawable.man_saying_hello),
            contentDescription = null,
            modifier = Modifier
                .width(100.dp)
        )

        Text(
            text = "Hello $name!",
            fontWeight = FontWeight.Bold,
            fontSize = 36.sp,
            modifier = Modifier
        )

        Text(
            text = "Nice to Meet You!",
            fontSize = 24.sp,

        )
    }
}

@Preview(showBackground = true)
@Composable
fun HelloAppPreview() {
    HelloAppChallengeTheme {
        HelloWidget("Nick")
    }
}