import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import app.App

@Preview
fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "SpeedWrite"
    ) {
        App()
    }
}