package com.example.propertyplus.ui.theme.screens.splash

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.animateLottieCompositionAsState
import com.example.propertyplus.R
import com.example.propertyplus.navigation.ROUT_HOME
import com.example.propertyplus.navigation.ROUT_LOGIN
import com.example.propertyplus.ui.theme.mybackground
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlin.reflect.KProperty


@SuppressLint("CoroutineCreationDuringComposition")
@Composable
fun SplashScreen(navController: NavController){


    Column(modifier = Modifier
        .fillMaxSize()
        .background(mybackground),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally)


//MAIN
    {
        var coroutineScope = rememberCoroutineScope()
        coroutineScope.launch {
            delay(2000)
            navController.navigate(ROUT_LOGIN)
        }


        Image(
            painter = painterResource(id = R.drawable.home) ,
            contentDescription = "home",
            modifier = Modifier
                .size(300.dp)
                .clip(shape = CircleShape),
            contentScale = ContentScale.Crop

        )


    }


}

private operator fun Unit.getValue(nothing: Nothing?, property: KProperty<*>): Any {
    TODO("Not yet implemented")
}

fun rememberLottieComposition(spec: Any) {

}

@Composable
@Preview(showBackground = true)
fun SplashScreenPreview(){
    SplashScreen(rememberNavController())

}