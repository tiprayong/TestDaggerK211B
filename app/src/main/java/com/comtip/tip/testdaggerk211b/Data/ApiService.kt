package com.comtip.tip.testdaggerk211b.Data

import java.util.*

/**
 * Created by TipRayong on 28/3/2561 14:05
 * TestDaggerK211B
 */
interface ApiService {
    fun loadData()
}

class ApiServiceImpl : ApiService {
    override fun loadData() {
        dataDagger = "Random Data\n"
        for (i in 1..7) {
            val temp: Int = Random().nextInt(99)
            dataDagger += "[ Loop $i get $temp ]\n"
        }
    }
}
