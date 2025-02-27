package br.senai.sp.jandira.mytrips.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.R

@Composable
fun HomeScreen(modifier: Modifier = Modifier){
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                color = Color.White
            )

    ){
        Card (
            modifier = Modifier
                .height(50.dp)
                .align(Alignment.TopEnd)
                .width(120.dp),
            shape =  RoundedCornerShape(
                bottomStart = 30.dp
            ),
            colors = CardDefaults.cardColors(
                containerColor = Color.Blue
            )

        ){  }
        Card(
            modifier = Modifier
                .height(50.dp)
                .align(Alignment.BottomStart)
                .width(120.dp),
            shape = RoundedCornerShape(
                topEnd = 30.dp
            ),
            colors = CardDefaults.cardColors(
                containerColor = Color.Blue
            )

        ) { }
        Column (
            modifier = Modifier
                .fillMaxSize()
                .padding(20.dp)
                .padding(top = 130.dp)
                .background(Color.Transparent),
            verticalArrangement = Arrangement.Center


        ){
            Text(
                text = stringResource(
                    br.senai.sp.jandira.mytrips.R.string.login_name
                ),
                fontSize = 45.sp,
                fontWeight = FontWeight.ExtraBold,
                color = Color.Blue,
                modifier = Modifier
                    .align(Alignment.Start)
            )
            Text(
                text = stringResource(
                    br.senai.sp.jandira.mytrips.R.string.text
                ),
                color = Color.Blue,
                modifier = Modifier
                    .align(Alignment.Start)
            )
            Column (
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 65.dp)
                    .height(300.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ){
                OutlinedTextField(
                    value = "example@gmail.com",
                    onValueChange = {},
                    modifier = Modifier
                        .fillMaxWidth(),
                    leadingIcon = {
                        Icon(
                            imageVector = Icons.Default.Email,
                            contentDescription = "",
                            tint = Color.Blue

                        )
                    },
                    label = {
                        Text(
                            text = stringResource(
                                br.senai.sp.jandira.mytrips.R.string.email
                            )
                        )
                    }
                )
                OutlinedTextField(
                    value = "password",
                    onValueChange = {},
                    modifier = Modifier
                        .padding(top = 20.dp)
                        .fillMaxWidth(),

                    leadingIcon = {
                        Icon(
                            imageVector = Icons.Default.Lock,
                            contentDescription = "",
                            tint = Color.Blue

                        )
                    },
                    label = {
                        Text(
                            text = stringResource(
                                br.senai.sp.jandira.mytrips.R.string.password
                            )
                        )
                    }
                )

                Button(onClick = {},
                    colors = ButtonDefaults.buttonColors(Color.Blue),
                    modifier = Modifier
                        .align(Alignment.End)
                        .padding(top = 40.dp)
                        .width(120.dp)
                        .height(50.dp),
                    shape = RoundedCornerShape(
                        bottomStart = 10.dp ,
                        bottomEnd =  10.dp,
                        topStart =  10.dp ,
                        topEnd =  15.dp
                    )


                ){
                    Text(
                        text = stringResource(
                            br.senai.sp.jandira.mytrips.R.string.sing_in
                        )
                    )
                    Icon(
                        imageVector = Icons.Default.ArrowForward,
                        contentDescription = ""
                    )

                }
                Row (
                    modifier = Modifier
                        .align(Alignment.End )
                        .padding(10.dp),
                ){
                    Text(
                        text = stringResource(
                            br.senai.sp.jandira.mytrips.R.string.gray_text
                        ),
                        modifier = Modifier
                            .padding(end = 5.dp)
                    )
                    Text(
                        text = stringResource(
                            br.senai.sp.jandira.mytrips.R.string.short_login
                        ),
                        color = Color.Blue
                    )
                }

            }

        }
    }
}
@Preview
@Composable
private fun HomeScreenPreview() {
    HomeScreen()
}