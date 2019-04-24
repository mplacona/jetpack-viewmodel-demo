package uk.co.placona.jetpackdemo1

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var dataSource: DataSource
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        dataSource = DataSource()
        tvMagicNumber.text = dataSource.getMagicNumber().toString()
    }
}
