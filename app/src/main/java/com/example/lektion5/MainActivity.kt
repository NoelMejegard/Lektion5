package com.example.lektion5

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.lektion5.ui.theme.Lektion5Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Lektion5Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    //Greeting("Android")


                } //Hej
                var i by remember {
                    mutableStateOf(0)
                }
                var imageSize by remember {
                    mutableStateOf(150)
                }
                val imageModifier = Modifier.size(imageSize.dp)
                Column(modifier = Modifier
                    .fillMaxSize()
                    .padding(16.dp),
                    horizontalAlignment = Alignment.CenterHorizontally) {


                    if (i % 2 == 0) {
                        Icon(
                            painter = painterResource(id = R.drawable.icons8_face_50),
                            contentDescription = "Face"
                        )
                    } else {
                        Icon(painter = painterResource(id = R.drawable.icons8_face_50__1_), contentDescription = "Face")
                    }
                    Button(onClick = { i++; imageSize+=10 }) {
                        Text(
                            text = "Click"
                        )

                    }
                    Image(
                        painter = painterResource(id = R.drawable.peter_steiner_1973_txktp5n133c_unsplash),
                        contentDescription = "Elefant",
                        contentScale = ContentScale.Fit,
                        modifier = imageModifier
                    )
                }

            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier

    )

}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Lektion5Theme {
        //Greeting("Android")
    }
}
