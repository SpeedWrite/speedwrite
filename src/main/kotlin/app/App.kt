package app

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import components.FileButtons
import components.Header
import components.TextInputField

@Composable
fun App() {
    var text by remember { mutableStateOf("") }

    MaterialTheme {
        Column(modifier = Modifier.fillMaxSize().padding(16.dp)) {
            Header()
            TextInputField(
                text = text,
                onTextChange = { text = it },
                modifier = Modifier.weight(1f)
            )
            FileButtons(
                text = text,
                onTextChange = { text = it }
            )
        }
    }
}