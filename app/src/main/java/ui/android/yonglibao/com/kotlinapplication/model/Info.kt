package ui.android.yonglibao.com.kotlinapplication.model

import android.util.Log

/**
 *----------------------------------------------------
 *※ Author :  GaoFei
 *※ Date : 2017/11/16
 *※ Time : 17:48
 *※ Project : Kotlin
 *※ Package : ui.android.yonglibao.com.kotlinapplication.model
 *----------------------------------------------------
 */
class Info(var nu:String , var message:String , var com:String , var data:Array<Data>){
    override fun toString(): String {
        var content:String ="test"
        content = nu + " \n "+message +" \n "+ com +" \n "
        var a:Int = 0
        while (a < data.size){
            content  = content + data[a].time + "\n"+data[a].ftime+"\n"+data[a].context
            a++
        }
        Log.e("soar" , "content -- "+content);
        return content
    }
}