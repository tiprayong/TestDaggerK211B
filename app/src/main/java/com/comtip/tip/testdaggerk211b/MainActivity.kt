package com.comtip.tip.testdaggerk211b

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.comtip.tip.testdaggerk211b.Data.dataDagger
import com.comtip.tip.testdaggerk211b.Presenter.MainContract
import dagger.android.AndroidInjection
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity : AppCompatActivity(), MainContract.View {
    @Inject lateinit var presenter: MainContract.UserActionListener

    override fun showLoading() {
        viewTV.setText(dataDagger)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        AndroidInjection.inject(this)

        presenter.refresh()

        getDataBT.setOnClickListener({
            presenter.refresh()
        })
    }
}
