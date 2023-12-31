package ru.asp.asp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Add
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import ru.asp.asp.ui.theme.Primary80

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GreetingPreview()
        }
    }
}

fun icon(imageVector: Any?) {

}

@OptIn(ExperimentalMaterial3Api::class, ExperimentalFoundationApi::class)
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    var mytext by remember { mutableStateOf("") }
    //var text = mutableStateOf("")
    //var text = ""
    Column(
        modifier = Modifier
            .wrapContentWidth()
            .padding(5.dp)
    )
    {
        OutlinedTextField(
            value = mytext,
            onValueChange = { mytext = it },
            label = { Text( "Label") },
            modifier = Modifier.fillMaxWidth()
        )
        OutlinedTextField(
            value = mytext, 
            onValueChange = { mytext = it}, 
            label = { Text( "Label")},
            modifier = Modifier.fillMaxWidth()
        )
        Row (
            modifier = Modifier
                .height(50.dp)
                .padding(5.dp)
        )
        {
            Button(
                onClick = { /*TODO*/ },
                colors = ButtonDefaults.buttonColors(containerColor = Primary80),
                shape = RoundedCornerShape(20),
                modifier = Modifier.weight(1f) .fillMaxHeight()
//                modifier = Modifier
//                    .combinedClickable(
//                        onClick = { },
//                        onLongClick = { },
//                    )
            ) {
                Icon(imageVector = Icons.Outlined.Add, contentDescription = "")
                Text(text = "сложить")
            }
            Button(
                onClick = { /*TODO*/ },
                colors = ButtonDefaults.buttonColors(containerColor = Primary80),
                shape = RoundedCornerShape(20),
                modifier = Modifier.weight(1f) .fillMaxHeight()
                ) {
                Icon(painter = painterResource(R.drawable.remove_24), contentDescription = "")
                Text(text = "вычесть")
            }
            Button(
                onClick = { /*TODO*/ },
                colors = ButtonDefaults.buttonColors(containerColor = Primary80),
                shape = RoundedCornerShape(20),
                modifier = Modifier.weight(1f) .fillMaxHeight()
                ) {
                Text(text = "умножить")
            }
            Button(
                onClick = { /*TODO*/ },
                colors = ButtonDefaults.buttonColors(containerColor = Primary80),
                shape = RoundedCornerShape(20),
                modifier = Modifier.weight(1f) .fillMaxHeight()
                ) {
                Text(text = "поделить")
            }
        }
    
    Text(text = mytext)
    }
}




