package utils

import java.io.File
import javax.swing.JFileChooser
import javax.swing.filechooser.FileNameExtensionFilter

fun saveToFile(content: String) {
    val fileChooser = JFileChooser().apply {
        dialogTitle = "Save File"
        fileFilter = FileNameExtensionFilter("Text Files", "txt")
    }

    val userSelection = fileChooser.showSaveDialog(null)

    if (userSelection == JFileChooser.APPROVE_OPTION) {
        val file = fileChooser.selectedFile
        val filePath = if (file.extension == "txt") file.path else "${file.path}.txt"
        File(filePath).writeText(content)
    }
}

fun openFile(): String? {
    val fileChooser = JFileChooser().apply {
        dialogTitle = "Open File"
        fileFilter = FileNameExtensionFilter("Text Files", "txt")
    }

    val userSelection = fileChooser.showOpenDialog(null)

    return if (userSelection == JFileChooser.APPROVE_OPTION) {
        val file = fileChooser.selectedFile
        if (file.extension == "txt") {
            file.readText()
        } else {
            null
        }
    } else {
        null
    }
}
