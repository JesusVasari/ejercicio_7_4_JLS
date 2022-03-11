// Copyright 2000-2021 JetBrains s.r.o. and contributors. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application


@Composable
@Preview
fun App() {

    val image = painterResource("runaT.jpg")
    val img = painterResource("runaP.jpg")
    val imagn = painterResource("runaO.jpg")
    var pulsado = remember { mutableStateOf(false) }
    var acertado = remember { mutableStateOf(false) }
    var texto = remember { mutableStateOf("incorrecto") }





    Column(

        modifier = Modifier.fillMaxSize(),

        horizontalAlignment = Alignment.CenterHorizontally
    ) {


        // Text("¿Cuál es la letra T?", color = Color.DarkGray, fontSize = 30.sp)
        Box(
            modifier = Modifier.height(100.dp)
                .fillMaxWidth()
                .background(color = Color.LightGray)
                .border(width = 5.dp, Color.Gray, RoundedCornerShape(10))
                .align(Alignment.CenterHorizontally)


        ) {
            Text(
                text = "¿Cuál es la letra T?",
                style = MaterialTheme.typography.h5,
                modifier = Modifier.wrapContentSize()
                    .align(alignment = Alignment.Center)


            )
        }

        Button(onClick = {
            pulsado.value = !pulsado.value
            acertado.value = true
        }) {
            if (pulsado.value) {
                if (acertado.value)
                    texto.value = "correcto"

                Text(texto.value)
            } else {
                Image(

                    painter = image,
                    contentDescription = "Logo T",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .size(128.dp)
                        .clip(RoundedCornerShape(10))
                        .border(width = 5.dp, Color.Gray, RoundedCornerShape(10)))
            }
        }

        //segundo boton
        Button(onClick = {
            pulsado.value = !pulsado.value
            acertado.value = true
        }) {
            if (pulsado.value) {
                if (acertado.value)
                    texto.value = "incorrecto"
                Text(texto.value)
            } else {
                Image(

                    painter = img,
                    contentDescription = "Logo P",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .size(128.dp)
                        .clip(RoundedCornerShape(10))
                        .border(width = 5.dp, Color.Gray, RoundedCornerShape(10)))
            }
        }
        Button(onClick = {
            pulsado.value = !pulsado.value
            acertado.value = true
        }) {
            if (pulsado.value) {
                if (acertado.value)
                    texto.value = "incorrecto"
                Text(texto.value)
            } else {
                Image(

                    painter = imagn,
                    contentDescription = "Logo O",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .size(128.dp)
                        .clip(RoundedCornerShape(10))
                        .border(width = 5.dp, Color.Gray, RoundedCornerShape(10)))
            }
        }
    }
}

fun main() = application {
    Window(onCloseRequest = ::exitApplication) {

        App()


    }
}


