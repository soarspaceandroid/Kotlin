package ui.android.yonglibao.com.kotlinapplication.activity

import android.support.v7.app.AppCompatActivity
import com.lzy.okgo.OkGo
import com.lzy.okgo.cache.CacheMode
import com.lzy.okgo.callback.StringCallback
import okhttp3.Call
import okhttp3.Response
import java.lang.Exception


/**
 *----------------------------------------------------
 *※ Author :  GaoFei
 *※ Date : 2017/11/16
 *※ Time : 17:42
 *※ Project : Kotlin
 *※ Package : ui.android.yonglibao.com.kotlinapplication.activity
 *----------------------------------------------------
 */
abstract class BaseActivity :AppCompatActivity() {

    

    fun requestHttp(url : String){
        OkGo.post(url)
                .tag(this)
                .cacheMode(CacheMode.DEFAULT)
                .execute(object : StringCallback() {
                    override fun onSuccess(t: String?, call: okhttp3.Call?, response: okhttp3.Response?) {
                        if(t != null) {
                            onSuccess(t)
                        }
                    }


                    override fun onError(call: Call?, response: Response?, e: Exception?) {
                        super.onError(call, response, e)
                        if(e != null) {
                            onError(e.message.toString())
                        }
                    }
                })
    }


    abstract fun onSuccess(res:String)

    abstract fun onError(mes:String)


}