package com.vincent.util

import android.content.Context
import android.graphics.Bitmap
import android.net.Uri
import androidx.core.content.FileProvider

import java.io.File
import java.io.FileOutputStream

class FileUtils(private val context: Context) {

    private companion object {
        const val FILE_AUTHORITY = "com.vincent.template.fileprovider"
        const val DIRECTORY_IMAGES = "images"
        const val DIRECTORY_DOCUMENTS = "documents"
    }

    fun getUriFromFile(file: File): Uri {
        return FileProvider.getUriForFile(context, FILE_AUTHORITY, file)
    }

    fun createImageFile(): File {
        val timeStamp = System.currentTimeMillis()

        val imageFileName = "jpg_$timeStamp"
        val storageDir = context.getExternalFilesDir(DIRECTORY_IMAGES)

        return File.createTempFile(imageFileName, ".jpg", storageDir)
    }

    fun saveBitmapToFile(bitmap: Bitmap): File {
        val file = createImageFile()

        val out = FileOutputStream(file)
        bitmap.compress(Bitmap.CompressFormat.JPEG, 90, out)
        out.flush()
        out.close()

        return file
    }
}