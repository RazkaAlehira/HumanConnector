package com.example.humanconnector

import android.os.Bundle
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.humanconnector.adapter.PostAdapter
import com.example.humanconnector.databinding.ActivityMainBinding
import com.example.humanconnector.model.PostTypeText
import kotlinx.android.synthetic.main.content_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val inflater = layoutInflater
        binding = ActivityMainBinding.inflate(inflater)
        setContentView(binding.root)
        setSupportActionBar(binding.toolbar)

        val post = mutableListOf<PostTypeText>()
        post.add(PostTypeText("This Is So Bad Sapnap...", "Dec 23nd, 2020"))
        for (i in 1..24) {
            post.add(PostTypeText("I Did Something Cool Dream...", "Dec 22nd, 2020"))
        }

        rv_post.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = PostAdapter(post)
        }
    }
}