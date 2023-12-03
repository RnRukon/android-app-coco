package com.example.myapplication
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScopeInstance.align
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                // A surface container using the 'background' color from the theme
                Surface() {
                    Greeting()

                }
            }
        }
    }
}

@Composable
fun Greeting( modifier: Modifier = Modifier) {
   Column(modifier= modifier
       .fillMaxHeight()
       .fillMaxWidth()
       .background(color = Color(0xFFA8DBD9), shape = RoundedCornerShape(size = 11.dp)),
       horizontalAlignment = Alignment.CenterHorizontally
   ) {
       Spacer(modifier = Modifier.padding(top=100.dp))
       Image(painter = painterResource(
           id = R.drawable.coco_image_start_page),
           contentDescription ="image description",
           contentScale = ContentScale.FillBounds,
           modifier = Modifier
               .height(292.dp)
               .width(292.dp)
       )

       Text(
           text = "Hey! Welcome",
           fontWeight= FontWeight.Bold,
           fontFamily = FontFamily.Serif,
           fontSize = 30.sp
           )

       Text(
           text = "While you sit and stay - We’ll go out and play",
           fontSize = 15.sp,
           color = Color(0xFF5F5F63),
           fontWeight=FontWeight(400),
           letterSpacing=2.25.sp,
           modifier = Modifier
               .padding(top = 23.dp)
               .width(282.dp)
               .height(63.dp) ,
           style = TextStyle(
               color = Color(0xFF5F5F63),
               textAlign = TextAlign.Center,

           )
       )

    Button(
        onClick = { /*TODO*/ },
        Modifier
            .padding(1.dp)
            .width(270.dp)
            .height(57.dp),


    ) {
        Text(
            text = "GET STARTED",
            style = TextStyle(
                fontSize = 25.sp,
                fontWeight = FontWeight(600),
                color = Color(0xFFFFFFFF),
                textAlign = TextAlign.Center,
                letterSpacing = 3.75.sp,
            )
        )
        Image(painter = painterResource(
            id = R.drawable.vector_6),
            contentDescription = "null",
            modifier= Modifier
                .padding(4.87.dp)
                .width(30.dp)
                .height(30.dp)
        )
    }


       Row(
           modifier = Modifier.padding(top=115.dp),

       ){
           Text(
               text = "Already have an account? ",
               style = TextStyle(
                   fontSize = 18.sp,
                   fontWeight = FontWeight(600),
                   color = Color(0xFF000000),
                   textAlign = TextAlign.Center,
                   letterSpacing = 2.7.sp,
               )
           )
           Text(
               text = "Login",
               style = TextStyle(
                   fontSize = 18.sp,
                   fontWeight = FontWeight(700),
                   color = Color(0xFF5AB198),
                   textAlign = TextAlign.Center,
                   letterSpacing = 2.7.sp,
               )
           )
       }

   }


}

@Preview()
@Composable
fun LoginPage(){
Column(
    modifier= Modifier
        .fillMaxHeight()
        .fillMaxWidth()
        .background(color = Color(0xFFFFFFFF), shape = RoundedCornerShape(size = 11.dp))

    ,
) {


    Box(modifier = Modifier.fillMaxWidth()){
        Image(
            painter = painterResource(id = R.drawable.ellipse_23),
            contentDescription = "image description",
            contentScale = ContentScale.FillBounds,
            modifier = Modifier
                .height(148.dp)
                .width(300.dp)
                .align(Alignment.TopEnd)
        )
        Image(
            painter = painterResource(id = R.drawable.ellipse_22),
            contentDescription = "image description",
            contentScale = ContentScale.FillBounds,
            modifier = Modifier
                .height(300.dp)
                .width(100.dp)
                .align(Alignment.TopEnd)
                .clip(
                    RoundedCornerShape(topEnd = 40.dp)
                )
        )
        Image(
            painter = painterResource(id = R.drawable.coco_image_start_page),
            contentDescription = "image description",
            contentScale = ContentScale.FillBounds,
            modifier = Modifier
                .width(243.dp)
                .height(243.dp)
                .align(Alignment.BottomCenter)

            ,

            )
    }

    Column(modifier=Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally) {
Box(modifier= Modifier
    .width(318.dp)
    .height(45.dp)
    .background(color = Color(0xFF5AB198), shape = RoundedCornerShape(size = 4.dp))){
      Text(
          text = "LOGON",
          modifier = Modifier
              .align(Alignment.Center)
              ,
          style = TextStyle(
              fontSize = 25.sp,
              fontWeight = FontWeight(500),
              color = Color(0xFF000000),  )
      )
}

        Text(
            text = "or connect with",
            style = TextStyle(
                fontSize = 25.sp,
                fontWeight = FontWeight(400),
                color = Color(0xFF747070),
            )
        )

        Box(modifier = Modifier
            .width(318.dp)
            .height(45.dp)
            .background(color = Color(0xFF5AB198), shape = RoundedCornerShape(size = 4.dp))){

  Row(modifier = Modifier.align(Alignment.Center)) {
      Image(painter = painterResource(
          id = R.drawable.google_1),
          contentDescription = null,
          modifier = Modifier
              .width(30.dp)

              .align(Alignment.CenterVertically)
      )
      Text(
          text = "Login with Google",

          style = TextStyle(
              fontSize = 20.sp,
              fontWeight = FontWeight(400),
              color = Color(0xFF000000),   )
      )
  }
        }
  }

}
    Image(painter = painterResource(
        id = R.drawable.good_doggy_bro_1),
        contentDescription =null ,
        modifier = Modifier.fillMaxSize()
        )
}


