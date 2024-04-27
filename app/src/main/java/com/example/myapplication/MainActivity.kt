package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    App ();
                }
            }
        }
    }
}

@Composable
fun SimpleText() {
    Text("Cadastrar", fontSize = 25.sp)
}

@Composable
fun SimpleOutlinedTextFieldSample() {
    var nome by remember { mutableStateOf("") }

    OutlinedTextField(
        value = nome,
        onValueChange = { nome = it },
        label = { Text("Nome") }
    )
}

@Composable
fun SimpleOutlinedTextFieldSampleUm() {
    var endereco by remember { mutableStateOf("") }

    OutlinedTextField(
        value = endereco,
        onValueChange = { endereco = it },
        label = { Text("Endereço") }
    )
}

@Composable
fun SimpleOutlinedTextFieldSampleDois() {
    var bairro by remember { mutableStateOf("") }

    OutlinedTextField(
        value = bairro,
        onValueChange = { bairro = it },
        label = { Text("Bairro") }
    )
}
@Composable
fun SimpleOutlinedTextFieldSampleTres() {
    var cep by remember { mutableStateOf("") }

    OutlinedTextField(
        value = cep,
        onValueChange = { cep = it },
        label = { Text("CEP") }
    )
}

@Composable
fun SimpleOutlinedTextFieldSampleQuatro() {
    var cidade by remember { mutableStateOf("") }

    OutlinedTextField(
        value = cidade,
        onValueChange = { cidade = it },
        label = { Text("Cidade") }
    )
}

@Composable
fun SimpleOutlinedTextFieldSampleCinco() {
    var estado by remember { mutableStateOf("") }

    OutlinedTextField(
        value = estado,
        onValueChange = { estado = it },
        label = { Text("Estado") }
    )
}

@Composable
fun App(){
    Column (horizontalAlignment = Alignment.CenterHorizontally){
        Row {
            SimpleText()
        }
        Row (
            Modifier
                .padding(8.dp)
        ) {
        }
        Row (
            Modifier
                .fillMaxWidth()
                .background(Color.White),
                Arrangement.Absolute.Center
        ) {
            SimpleOutlinedTextFieldSample()
        }
        Row (
            Modifier
                .padding(8.dp)
        ) {
        }
        Row (
            Modifier
                .fillMaxWidth()
                .background(Color.White),
                Arrangement.Absolute.Center
        ) {
            SimpleOutlinedTextFieldSampleUm()
        }
        Row (
            Modifier
                .padding(8.dp)
        ) {
        }
        Row (
            Modifier
                .fillMaxWidth()
                .background(Color.White),
                Arrangement.Absolute.Center
        ) {
            SimpleOutlinedTextFieldSampleDois()
        }
        Row (
            Modifier
                .padding(8.dp)
        ) {
        }
        Row (
            Modifier
                .fillMaxWidth()
                .background(Color.White),
                Arrangement.Absolute.Center
        ) {
            SimpleOutlinedTextFieldSampleTres()
        }
        Row (
            Modifier
                .padding(8.dp)
        ) {
        }
        Row (
            Modifier
                .fillMaxWidth()
                .background(Color.White),
                Arrangement.Absolute.Center
        ) {
            SimpleOutlinedTextFieldSampleQuatro()
        }
        Row (
            Modifier
                .padding(8.dp)
        ) {
        }
        Row (
            Modifier
                .fillMaxWidth()
                .background(Color.White),
                Arrangement.Absolute.Center
        ) {
            SimpleOutlinedTextFieldSampleCinco()
        }
        Row (
            Modifier
                .padding(8.dp)
        ) {
        }
        Row (
            Modifier
                .fillMaxWidth()
                .background(Color.White),
            Arrangement.Absolute.Center

        ) {
            ElevatedButton(onClick = { onClick() }) {
                Text("Cadastrar")
            }
        }
    }
}

fun onClick() {
    TODO("Cadastrado")
}


@Composable
@Preview
fun AppPreview () {
    MyApplicationTheme {
        // A surface container using the 'background' color from the theme
        Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
            App();
        }
    }
    App();
}