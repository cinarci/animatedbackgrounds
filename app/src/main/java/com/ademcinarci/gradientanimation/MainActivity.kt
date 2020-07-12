package com.ademcinarci.gradientanimation

import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Burada bildirim panelininde arkasını kaplaması için bu satırı ekledik. Eğer kendi renginizi eklemek isterseniz bu satırı kaldırın.
        //Yok ben full screen kullanmak istiyorum diyorsanız SYSTEM_UI_FLAG_FULLSCREEN olarak değiştirebilirsiniz.
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN

        val animasyon = arkaplan.background as AnimationDrawable
        animasyon.setEnterFadeDuration(10)
        animasyon.setExitFadeDuration(5000)
        animasyon.start()

    }
}