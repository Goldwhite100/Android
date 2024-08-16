package com.example.propertyplus.ui.theme.screens.dashboard

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.propertyplus.R
import com.example.propertyplus.navigation.ADD_PRODUCTS_URL
import com.example.propertyplus.navigation.ROUT_PROPERTY
import com.example.propertyplus.navigation.VIEW_PRODUCTS_URL
import com.example.propertyplus.ui.theme.newGreen

@Composable
fun DashboardScreen(navController: NavController){
    Column (
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ){



        Spacer(modifier = Modifier.height(10.dp))

        Image(
            painter = painterResource(id = R.drawable.prop) ,
            contentDescription = "property",
            modifier = Modifier.size(100.dp)
        )


        Spacer(modifier = Modifier.height(10.dp))


        Text(
            text = "Manage your properties with us",
            fontSize = 15.sp,
            fontFamily = FontFamily.Cursive,
            color = Color.Black
        )

        Spacer(modifier = Modifier.height(10.dp))

        Column(modifier = Modifier.verticalScroll(rememberScrollState())){

            //start of main card
                Card (modifier = Modifier.fillMaxWidth().height(700.dp),
                    shape = RoundedCornerShape(topStart = 60.dp, topEnd = 60.dp),
                    colors = CardDefaults.cardColors(newGreen),
                ){
                    //Row
                    Row(modifier = Modifier.padding(20.dp)) {
                        Card (modifier = Modifier.width(160.dp).height(180.dp)
                            .clickable {
                                navController.navigate(ROUT_PROPERTY)
                            },
                            elevation = CardDefaults.cardElevation(10.dp),

                            ){
                            Column {
                                Spacer(modifier = Modifier.height(10.dp))

                                Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center){
                                    Image(
                                        painter = painterResource(id = R.drawable.prop) ,
                                        contentDescription = "property",
                                        modifier = Modifier.size(100.dp))
                                }
                                Spacer(modifier = Modifier.height(10.dp))
                                Text(
                                    text = "Home",
                                    fontSize = 18.sp,
                                    fontFamily = FontFamily.SansSerif,
                                    color = Color.LightGray,
                                    modifier = Modifier.fillMaxWidth(),
                                    textAlign = TextAlign.Center
                                    )

                            }

                        }
                        Spacer(modifier = Modifier.width(20.dp))
                            //card 2
                        Card (modifier = Modifier
                            .width(160.dp)
                            .height(180.dp)){
                            Column {
                                Spacer(modifier = Modifier.height(10.dp))
                                Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center){
                                    Image(
                                        painter = painterResource(id = R.drawable.prop) ,
                                        contentDescription = "property",
                                        modifier = Modifier.size(100.dp))
                                }
                                Spacer(modifier = Modifier.height(10.dp))
                                Text(
                                    text = "Home",
                                    fontSize = 18.sp,
                                    fontFamily = FontFamily.SansSerif,
                                    color = Color.LightGray,
                                    modifier = Modifier.fillMaxWidth(),
                                    textAlign = TextAlign.Center
                                )

                            }
                            //end of card 2

                        }


                    }


                    //End of Row

                    Row(modifier = Modifier.padding(20.dp)) {
                        Card (modifier = Modifier
                            .width(160.dp)
                            .height(180.dp)){
                            Column {
                                Spacer(modifier = Modifier.height(10.dp))
                                Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center){
                                    Image(
                                        painter = painterResource(id = R.drawable.prop) ,
                                        contentDescription = "property",
                                        modifier = Modifier.size(100.dp))
                                }
                                Spacer(modifier = Modifier.height(10.dp))
                                Text(
                                    text = "Home",
                                    fontSize = 18.sp,
                                    fontFamily = FontFamily.SansSerif,
                                    color = Color.LightGray,
                                    modifier = Modifier.fillMaxWidth(),
                                    textAlign = TextAlign.Center
                                )

                            }

                        }
                        Spacer(modifier = Modifier.width(20.dp))
                        //card 2
                        Card (modifier = Modifier
                            .width(160.dp)
                            .height(180.dp)){
                            Column {
                                Spacer(modifier = Modifier.height(10.dp))
                                Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center){
                                    Image(
                                        painter = painterResource(id = R.drawable.profile) ,
                                        contentDescription = "profile",
                                        modifier = Modifier.size(100.dp))
                                }
                                Spacer(modifier = Modifier.height(10.dp))
                                Text(
                                    text = "Home",
                                    fontSize = 18.sp,
                                    fontFamily = FontFamily.SansSerif,
                                    color = Color.LightGray,
                                    modifier = Modifier.fillMaxWidth(),
                                    textAlign = TextAlign.Center
                                )

                            }
                            //end of card 2

                        }


                    }
                    //end row 2

                    Row(modifier = Modifier.padding(20.dp)) {
                        Card (modifier = Modifier
                            .width(160.dp)
                            .height(180.dp)
                            .clickable {
                                navController.navigate(ADD_PRODUCTS_URL)
                            }
                        ){
                            Column {
                                Spacer(modifier = Modifier.height(10.dp))
                                Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center){
                                    Image(
                                        painter = painterResource(id = R.drawable.img_6) ,
                                        contentDescription = "setting",
                                        modifier = Modifier.size(100.dp))
                                }
                                Spacer(modifier = Modifier.height(10.dp))
                                Text(
                                    text = "Add Products",
                                    fontSize = 18.sp,
                                    fontFamily = FontFamily.SansSerif,
                                    color = Color.LightGray,
                                    modifier = Modifier.fillMaxWidth(),
                                    textAlign = TextAlign.Center
                                )

                            }

                        }
                        Spacer(modifier = Modifier.width(20.dp))
                        //card 2
                        Card (modifier = Modifier
                            .width(160.dp)
                            .height(180.dp)
                            .clickable {
                                navController.navigate(VIEW_PRODUCTS_URL)
                            }
                        ){
                            Column {
                                Spacer(modifier = Modifier.height(10.dp))
                                Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center){
                                    Image(
                                        painter = painterResource(id = R.drawable.img_5) ,
                                        contentDescription = "property",
                                        modifier = Modifier.size(100.dp))
                                }
                                Spacer(modifier = Modifier.height(10.dp))
                                Text(
                                    text = "View Products",
                                    fontSize = 18.sp,
                                    fontFamily = FontFamily.SansSerif,
                                    color = Color.LightGray,
                                    modifier = Modifier.fillMaxWidth(),
                                    textAlign = TextAlign.Center
                                )

                            }
                            //end of card 2

                        }


                    }

                }
            //End of main card





        }



    }


}
@Composable
@Preview(showBackground = true)
fun DashboardScreenPreview(){
    DashboardScreen(rememberNavController())

}