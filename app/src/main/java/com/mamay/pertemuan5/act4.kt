package com.mamay.pertemuan5

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import org.w3c.dom.Text

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
    val gender: List<String> = listOf("Laki-laki", "Perempuan")

    Column(
        modifier = Modifier
            .padding(dimensionResource(id = R.dimen.padding_atas)),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally{
            OutlinedTextField(
                value = textNama,
                singleLine = true,
                shape = MaterialTheme(id = R.dimen.padding_small),
                modifier = Modifier
                    .padding(250.dp),
                label = { Text(text = stringResource(id = R.string.label_nama)},
                onValueChange = {
                    textNama = it
                }

            )
        }

    ) {

    }
}