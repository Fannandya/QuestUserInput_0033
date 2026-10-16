package com.mamay.pertemuan5

import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier

@Composable
fun FormDataDiri(
    modifier: Modifier
){
    // variabel untuk mengingat input dari keyboard
    var textNama by remember { mutableStateOf("") }
    var textAlamat by remember { mutableStateOf("") }
    var textJK by remember { mutableStateOf("") }

    //variabel untuk menyimpan data yang diperoleh dari komponen UI (pura pura jadi db)
    var nama by remember { mutableStateOf("") }
    var alamat by remember { mutableStateOf("") }
    var jenis by remember { mutableStateOf("") }
    val gender = listOf("Laki-laki", "Perempuan")
}