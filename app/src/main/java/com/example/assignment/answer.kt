package com.example.classwork.ui.theme
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.AbsoluteAlignment
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.assignment.R


@Composable
fun image_app(){

main_work()
}

@Composable
fun main_work (    modifier : Modifier =Modifier) {
    var result by remember {
        mutableStateOf(1)
    }


    var Jb = "white beard"
    when (result) {
        1 -> {
            Jb = "luffy wanted poster"

        }

        2 -> {
            Jb = "zoro"

        }

        3 -> {
           Jb = "cid kengoku"

        }
        4 -> {
            Jb = "luffy gear 5"

        }
        5 -> {
            Jb = "Gojo satoru"

        }
        6 -> {
            Jb = "Gumball"

        }


    }




    var R1 = R.drawable.whitebeard
    when (result) {
        1 -> {
            R1 = R.drawable.luffy_s_new_wanted_poster

        }

        2 -> {
        R1 = R.drawable.i_am_atomic__2_

        }

        3 -> {
            R1 = R.drawable.cid

        }
        4 -> {
            R1 = R.drawable.one_piece

        }
        5 -> {
            R1 = R.drawable.gojo

        }
        6 -> {
            R1 = R.drawable.gumball

        }


    }

    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Image(painterResource(id = R1), contentDescription = stringResource(R.string.image))

    Spacer(modifier = Modifier.height(16.dp))

        Text(text = Jb)

        Spacer(modifier = Modifier.height(16.dp))


        Column(
            modifier = modifier,
            horizontalAlignment = AbsoluteAlignment.Right
        ) {
            Button(onClick = {

                result +=1


            }) {
                Text(stringResource(R.string.next))

            }

            Column(
                modifier = modifier,
                horizontalAlignment = AbsoluteAlignment.Left
            ) {
                Button(onClick = {
                    result  -=1

                }) {
                    Text(stringResource(R.string.back))

                }
            }
        }
    }
}


@Preview
    (showBackground = true,
            showSystemUi = true)
@Composable
fun Imageapppreview (){
    image_app()
}

