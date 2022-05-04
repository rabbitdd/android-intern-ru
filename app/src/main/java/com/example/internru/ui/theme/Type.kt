package com.example.internru.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.internru.R

// Set of Material typography styles to start with
val SourceSanPro = FontFamily(
    Font(R.font.sourcesanspro_semibold),
    Font(R.font.sourcesanspro_bolditalic)
)

val Typography = Typography(
    body1 = TextStyle(
        fontFamily = SourceSanPro,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp
    ),
    h2 = TextStyle(fontSize = 16.sp, fontFamily = SourceSanPro, fontWeight = FontWeight.Normal)
    /* Other default text styles to override
    button = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.W500,
        fontSize = 14.sp
    ),
    caption = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp
    )
    */
)