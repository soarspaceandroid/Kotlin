package ui.android.yonglibao.com.kotlinapplication.activity

import android.os.Bundle
import android.util.Log
import android.view.View
import com.google.gson.Gson
import kotlinx.android.synthetic.main.activity_main.*
import ui.android.yonglibao.com.kotlinapplication.R
import ui.android.yonglibao.com.kotlinapplication.model.Info

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        requestButton.setOnClickListener(View.OnClickListener {
            //请求
            requestHttp("http://www.kuaidi100.com/query?type=yuantong&postid=11111111111")

        })


    }

    override fun onError(mes: String) {
        Log.e("soar" , "onError -- "+mes)
        result.setText(mes)
    }

    override fun onSuccess(res: String) {
        var info = Gson().fromJson(res , Info::class.java)
        result.setText(info.toString())
        Log.e("soar" , "response --> "+info.data.size+" 第10条是 --> "+info.toString())
    }

}
