package com.example.retorecycler

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.retorecycler.databinding.ActivityMainBinding
import org.json.JSONObject

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val fakeProductData: Array<JSONObject> = arrayOf(
            JSONObject("{\"descripcion\": \"Un producto bastante bueno\", \"precio\": \"$550.00\"}"),
            JSONObject("{\"descripcion\": \"Ah que maravilla\", \"precio\": \"\$820.00\"}"),
            JSONObject("{\"descripcion\": \"Increíble!\", \"precio\": \"\$1550.00\"}"),
            JSONObject("{\"descripcion\": \"Un producto bastante bueno\", \"precio\": \"\$550.00\"}"),
            JSONObject("{\"descripcion\": \"Un producto bastante bueno\", \"precio\": \"\$550.00\"}")
        )

        binding.rvProductEntries.adapter = MainAdapter(fakeProductData)
    }
}