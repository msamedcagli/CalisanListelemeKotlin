package com.msamedcagli.calisanlarodev

class calisanlar(val isim:String,maas:Int, var department:String, var yas:Int) {

    private val maas1 = maas
    fun maasGoster() : Int {
        return this.maas1
    }
}