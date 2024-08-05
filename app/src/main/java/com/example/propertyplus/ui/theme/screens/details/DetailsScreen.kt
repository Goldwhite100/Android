package com.example.propertyplus.ui.theme.screens.details

import android.telecom.Call.Details
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarColors
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.propertyplus.R
import com.example.propertyplus.ui.theme.newGreen

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DetailsScreen(navController: NavController){
    Column(modifier = Modifier.fillMaxSize() ){

        TopAppBar(
            title = { Text(text = "PropertyPlus") },
            colors = TopAppBarDefaults.mediumTopAppBarColors(newGreen),
            navigationIcon = {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Default.Menu, contentDescription = "", tint = Color.Magenta)
                }
            },
            actions = {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Default.Notifications, contentDescription = "", tint = Color.Magenta)
                }
            }
        )

        Box (modifier = Modifier.height(280.dp).fillMaxWidth(),
            contentAlignment = Alignment.Center){
            Image(
                painter = painterResource(id = R.drawable.home),
                contentDescription = "home",
                modifier = Modifier.fillMaxSize())


        }





    }


}
@Composable
@Preview(showBackground = true)
fun DetailsScreenPreview() {
    DetailsScreen(rememberNavController())
}




