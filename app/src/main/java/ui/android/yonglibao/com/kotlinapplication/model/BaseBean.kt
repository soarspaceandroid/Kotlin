package ui.android.yonglibao.com.kotlinapplication.model


/**
 *----------------------------------------------------
 *※ Author :  GaoFei
 *※ Date : 2017/11/17
 *※ Time : 10:26
 *※ Project : Kotlin
 *※ Package : ui.android.yonglibao.com.kotlinapplication.model
 *----------------------------------------------------
 */
open class BaseBean {

    lateinit var nu:String
    lateinit var message:String
    lateinit var com:String

    constructor()

    constructor(nu: String, message: String, com: String) {
        this.nu = nu
        this.message = message
        this.com = com
    }


}