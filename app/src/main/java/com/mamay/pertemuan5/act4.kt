package com.mamay.pertemuan5

import android.provider.MediaStore
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.selection.selectable
import androidx.compose.material3.Button
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.RadioButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
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
            .padding(top = 50.dp),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally) {
            OutlinedTextField(
                value = textNama,
                singleLine = true,
                shape = MaterialTheme.shapes.large,
                modifier = Modifier
                    .padding(250.dp),
                label = { Text(text = "nama lengkap"},
                onValueChange = {
                    textNama = it
                }
            )
        Row() {
            gender.forEach { item ->
                Row(
                    modifier = Modifier.selectable(
                        selected = textJK == item,
                        onClick = {textJK = item}
                ),
                    verticalAlignment = Alignment.CenterVertically){
                    RadioButton(selected = textJK == item,
                        onClick = {textJK = item}
                    )
                    Text(item)
                }
        }
        }
                OutlinedTextField(
                value = textAlamat,
                singleLine = true,
                shape = MaterialTheme.shapes.large,
                modifier = Modifier
                    .padding(250.dp),
                label = { Text("alamat lengkap")},
                    onValueChange = {
                    textAlamat = it
                }
            )
        HorizontalDivider(
            modifier = Modifier
                .padding(
                    bottom =
                        dimensionResource(id = R.dimen.padding_medium),
                    top = dimensionResource(id = R.dimen.padding_medium),
                )
            thickness = dimensionResource(1dp),
            color = Color.DarkGray
        ) { }
        }
    }