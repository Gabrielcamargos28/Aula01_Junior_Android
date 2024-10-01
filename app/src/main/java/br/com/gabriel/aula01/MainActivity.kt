package br.com.gabriel.aula01

import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import br.com.gabriel.aula01.ui.theme.Aula01Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Aula01Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        Toast.makeText(applicationContext,"",Toast.LENGTH_SHORT).show();
        super.onCreate(savedInstanceState, persistentState)
    }

    override fun onStart() {
        Toast.makeText(applicationContext,"START",Toast.LENGTH_SHORT).show();
        super.onStart()
    }

    override fun onStop() {
        Toast.makeText(applicationContext,"STOP",Toast.LENGTH_SHORT).show();
        super.onStop()
    }

    override fun onPause() {
        Toast.makeText(applicationContext,"PAUSE",Toast.LENGTH_SHORT).show();
        super.onPause()
    }

    override fun onRestart() {
        Toast.makeText(applicationContext,"RESTART",Toast.LENGTH_SHORT).show();
        super.onRestart()
    }

    override fun onResume() {
        Toast.makeText(applicationContext,"START RESUME",Toast.LENGTH_SHORT).show();
        super.onResume()
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Aula01Theme {
        Greeting("Android")
    }
}