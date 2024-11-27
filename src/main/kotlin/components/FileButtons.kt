package components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import utils.openFile
import utils.saveToFile

@Composable
fun FileButtons(text: String, onTextChange: (String) -> Unit) {
    Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
        Button(
            onClick = {
                val fileContent = openFile()
                if (fileContent != null) {
                    onTextChange(fileContent)
                }
            },
            modifier = Modifier.weight(1f).padding(end = 8.dp)
        ) {
            Text("Open File")
        }
        Button(
            onClick = { saveToFile(text) },
            modifier = Modifier.weight(1f),
            colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFF006400)) // Dark green
        ) {
            Text("Save", color = Color.White)
        }
    }
}
