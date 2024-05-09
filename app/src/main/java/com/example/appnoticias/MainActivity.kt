 package com.example.appnoticias

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ModifierLocalBeyondBoundsLayout
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.appnoticias.ui.theme.AppNoticiasTheme
 class MainActivity : ComponentActivity() {
     override fun onCreate(savedInstanceState: Bundle?) {
         super.onCreate(savedInstanceState)
         setContent {
             AppNoticiasTheme {
                 // A surface container using the 'background' color from the theme
                 Surface(
                     modifier = Modifier.fillMaxSize(),
                     color = MaterialTheme.colorScheme.background
                 ) {
                     appPreview()
                 }
             }
         }
     }
 }
 @Composable
 fun app(){
     Column(
         Modifier
             .fillMaxWidth()
             .background(Color.White)

     ) {}
     Column {
         Row(
             Modifier
                 .fillMaxWidth()
                 .background(Color.Red),
             Arrangement.Center
         ) {
             Text(
                 text = "App notícias",
                 fontFamily = FontFamily.Serif,
                 fontSize = 25.sp
             )
         }
         Row(
             Modifier
                 .fillMaxWidth()
                 .background(Color.White)
                 .padding(8.dp)
         ) {
         }
         Row(
             Modifier
                 .fillMaxWidth()
                 .background(Color.Cyan)
         ) {
             Text(
                 text = "Titulo\n",
                 fontFamily = FontFamily.Serif,
                 fontSize = 20.sp
             )
         }
         Row(
             Modifier
                 .fillMaxWidth()
                 .background(Color.White)
         ) {
             Text(text = "Descrição da notícia: Câmara desmonta ‘fake’ do governo sobre sua recusa a ajuda do Uruguai")}
         Row(
             Modifier
                 .fillMaxWidth()
                 .background(Color.White),
             Arrangement.Absolute.Right
         ) {
             Button(
                 onClick = { /* TODO */ }
             ) {
                 Text(text = "Leia mais")
             }
         }
         Row(
             Modifier
                 .fillMaxWidth()
                 .background(Color.White)
                 .padding(8.dp)
         ) {
         }
         Column {
             Row(
                 Modifier
                     .fillMaxWidth()
                     .background(Color.Cyan)
             ) {
                 Text(
                     text = "Titulo\n",
                     fontFamily = FontFamily.Serif,
                     fontSize = 20.sp
                 )
             }
             Row(
                 Modifier
                     .fillMaxWidth()
                     .background(Color.White)
             ) {
                 Text(text = "Descrição da notícia: Sobe para 107 o número de mortos após enchentes que atingem o RS ")}
             Row(
                 Modifier
                     .fillMaxWidth()
                     .background(Color.White),
                 Arrangement.Absolute.Right
             ) {
                 Button(
                     onClick = { /* TODO */ }
                 ) {
                     Text(text = "Leia mais")
                 }
             }
         }
         Row(
             Modifier
                 .fillMaxWidth()
                 .background(Color.White)
                 .padding(8.dp)
         ) {
         }
         Column {
             Row(
                 Modifier
                     .fillMaxWidth()
                     .background(Color.Cyan)
                     .padding(8.dp)
             ) {
                 Text(
                     text = "Titulo\n",
                     fontFamily = FontFamily.Serif,
                     fontSize = 20.sp
                 )
             }
             Row(
                 Modifier
                     .fillMaxWidth()
                     .background(Color.White)
             ) {
                 Text(text = "Descrição da notícia: Chuvas no RS: Guaíba segue em queda e deve ficar abaixo dos 5 metros ainda hoje, indica SGB")
             }
             Row(
                 Modifier
                     .fillMaxWidth()
                     .background(Color.White),
                 Arrangement.Absolute.Right
             ) {
                 Button(
                     onClick = { /* TODO */ }
                 ) {
                     Text(text = "Leia mais")
                 }
             }
         }
     }
 }

 @Preview
 @Composable
 fun appPreview(){
     AppNoticiasTheme {
         Surface(
             modifier = Modifier.fillMaxSize(),
             color = MaterialTheme.colorScheme.background
         ) {
             app()
         }
     }
 }
