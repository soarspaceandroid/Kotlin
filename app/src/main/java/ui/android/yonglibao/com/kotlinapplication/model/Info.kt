package ui.android.yonglibao.com.kotlinapplication.model

/**
 *----------------------------------------------------
 *※ Author :  GaoFei
 *※ Date : 2017/11/16
 *※ Time : 17:48
 *※ Project : Kotlin
 *※ Package : ui.android.yonglibao.com.kotlinapplication.model
 *----------------------------------------------------
 */
data class Info(var data:Array<Data>):BaseBean(){

    inner class Data(var time:String , var context:String , var ftime:String)
}

