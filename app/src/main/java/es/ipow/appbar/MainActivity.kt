package es.ipow.appbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Llamar a la función de esta Activity para
        // utilizar los métodos de utilidad de la ActionBar
        val actionBar = supportActionBar

        // Proporcionar un título para la ActionBar
        actionBar!!.title = "  Action Bar"

        // Proporcionar subtítulos para la ActionBar
        actionBar.subtitle = "   Design a custom Action Bar"

        // Añadir un icono en la ActionBar
        actionBar.setIcon(R.drawable.icon_flash_head_100)

        // Métodos para mostrar el icono en la ActionBar
        actionBar.setDisplayUseLogoEnabled(true)
        actionBar.setDisplayShowHomeEnabled(true)
    }

    // Método para inflar el menú de opciones cuando
    // el usuario abre el menú por primera vez
    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    // Método para controlar las operaciones que cuando
    // el usuario haga clic en los botones de acción
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.search -> Toast.makeText(this, "Search Clicked", Toast.LENGTH_SHORT).show()
            R.id.refresh -> Toast.makeText(this, "Refresh Clicked", Toast.LENGTH_SHORT).show()
            R.id.copy -> Toast.makeText(this, "Copy Clicked", Toast.LENGTH_SHORT).show()
        }
        return super.onOptionsItemSelected(item)
    }

}