package com.example.businesscardapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material.icons.rounded.Phone
import androidx.compose.material.icons.rounded.Share
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscardapp.ui.theme.BusinessCardAppTheme

class MainActivity : ComponentActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContent {
      BusinessCardAppTheme {
        // A surface container using the 'background' color from the theme
        Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
          App()
        }
      }
    }
  }
}

@Composable
fun CardOne(fullName: String, title: String, modifier: Modifier = Modifier) {
  val image = painterResource(R.drawable.android_logo)

  Column(
    verticalArrangement = Arrangement.Center,
    horizontalAlignment = Alignment.CenterHorizontally,
    modifier = modifier
      .fillMaxWidth()
      .fillMaxHeight()
      .background(color = Color(210, 232, 212))
  ) {
    Image(
      painter = image,
      contentDescription = "Logo",
      modifier = modifier
        .height(120.dp)
        .width(150.dp)
        .background(color = Color(9, 48, 66))
    )
    Text(
      text = fullName,
      fontSize = 50.sp
    )
    Text(
      text = title,
      fontWeight = FontWeight.Bold,
      color = Color(0, 109, 59)
    )
  }
}

@Composable
fun CardTwo(
  phoneNumber: String,
  share: String,
  email: String,
  modifier: Modifier = Modifier
) {
  val phoneIcon = Icons.Rounded.Phone
  val shareIcon = Icons.Rounded.Share
  val emailIcon = Icons.Rounded.Email

  Column(
    verticalArrangement = Arrangement.Bottom,
    horizontalAlignment = Alignment.Start,
    modifier = modifier
      .fillMaxWidth()
      .padding(bottom = 50.dp)
  ) {
    Divider(modifier = Modifier.fillMaxWidth(), thickness = 2.dp, color = Color(0xFF526E7B))
    Row(
      horizontalArrangement = Arrangement.Center,
      modifier = modifier
        .fillMaxWidth()
    ) {
      Icon(
        phoneIcon,
        contentDescription = "Phone Number",
        modifier = modifier
          .padding(8.dp)
      )
      Text(
        text = phoneNumber,
        modifier = modifier
          .padding(8.dp)
      )
    }
    Divider(modifier = Modifier.fillMaxWidth(), thickness = 2.dp, color = Color(0xFF526E7B))
    Row(
      horizontalArrangement = Arrangement.Center,
      modifier = modifier
        .fillMaxWidth()
    ) {
      Icon(
        shareIcon,
        contentDescription = "Share",
        modifier = modifier
          .padding(8.dp)
      )
      Text(
        text = share,
        modifier = modifier
          .padding(8.dp)
      )
    }
    Divider(modifier = Modifier.fillMaxWidth(), thickness = 2.dp, color = Color(0xFF526E7B))
    Row(
      horizontalArrangement = Arrangement.Center,
      modifier = modifier
        .fillMaxWidth()
    ) {
      Icon(
        emailIcon,
        contentDescription = "Email",
        modifier = modifier
          .padding(8.dp)
      )
      Text(
        text = email,
        modifier = modifier
          .padding(8.dp)
      )
    }
  }
}

@Composable
fun App() {
  CardOne(
    stringResource(R.string.full_name),
    stringResource(R.string.title)
  )
  CardTwo(
    "+84346423011",
    "@ThanhBT",
    "thanhbt@gmail.com"
  )
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
  BusinessCardAppTheme {
    App()
  }
}