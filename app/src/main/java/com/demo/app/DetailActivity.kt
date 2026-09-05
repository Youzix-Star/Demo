package com.demo.app

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.demo.app.model.Article

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val article = intent.getParcelableExtra<Article>("article")
        if (article != null) {
            findViewById<TextView>(R.id.tvTitle).text = article.title
            findViewById<TextView>(R.id.tvAuthor).text = article.author
            findViewById<TextView>(R.id.tvDate).text = article.date
            findViewById<TextView>(R.id.tvContent).text = article.content
            findViewById<TextView>(R.id.tvSummary).text = article.summary
        }

        findViewById<View>(R.id.btnBack).setOnClickListener {
            finish()
        }
    }
}
