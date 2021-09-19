package dev.luischang.s4dpalistview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListAdapter
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    var arrSO= arrayOf(
        "Android","iPhone","Windows Phone","Blackberry",
        "Firefox OS", "Amazon World","Nokia"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val lsvSO: ListView = findViewById(R.id.lsvSO)
        val adaptador: Any? =
            ArrayAdapter<Any?>(this,
                android.R.layout.simple_list_item_1,
            arrSO)
        lsvSO.adapter = adaptador as ListAdapter?

        lsvSO.setOnItemClickListener { parent, view, position, id ->
            Toast.makeText(this,
                        "Esta es la posición: $position",
                        Toast.LENGTH_SHORT).show()
        }



    }
}