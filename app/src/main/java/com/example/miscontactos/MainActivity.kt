package com.example.miscontactos

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.miscontactos.ui.theme.MisContactosTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Scaffold(
                modifier = Modifier.statusBarsPadding().navigationBarsPadding()
            ) { innerPadding ->
                View(innerPadding)
            }
        }
    }
}


@Composable
fun View(padding: PaddingValues) {
    Column (modifier = Modifier.fillMaxSize()) {
        TextField(
            modifier = Modifier
                .fillMaxWidth()
                .padding(all = 5.dp)
                .padding(start = 10.dp)
                .padding(end = 10.dp),
            value = "Nombre de contacto",
            onValueChange = {},
            placeholder = { Text(text = "Nombre de contacto") }
        )
        TextField(
            modifier = Modifier
                .fillMaxWidth()
                .padding(all = 5.dp)
                .padding(start = 10.dp)
                .padding(end = 10.dp),
            value = "mail",
            onValueChange = {},
            placeholder = { Text(text = "mail") }
        )
        Button(
            modifier = Modifier
                .fillMaxWidth()
                .padding(all = 5.dp)
                .padding(start = 10.dp)
                .padding(end = 10.dp),
            onClick = {  },
            colors = ButtonColors(Color(0xFF742FE3), Color.White, Color.Gray, Color.LightGray),
            enabled = true
        ) {
            Text(text = "Agregar")
        }
    }
}

@Composable
fun mostrarContactos() {

}

data class Contacto(val nombre: String, val correo: String)