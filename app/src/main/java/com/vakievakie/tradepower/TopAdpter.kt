package com.vakievakie.tradepower

import android.graphics.BitmapFactory
import android.widget.ImageView
import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.BaseViewHolder
import com.vakievakie.tradepower.bean.UserLevelBean
import java.net.URL


class TopAdpter(layoutResId: Int) :
    BaseQuickAdapter<UserLevelBean, BaseViewHolder>(layoutResId) {
    override fun convert(helper: BaseViewHolder, item: UserLevelBean) {
      // val img = helper.getView<ImageView>(R.id.iv)
      // val url = URL("http://images.csdn.net/20130609/zhuanti.jpg")
      // img.setImageBitmap(BitmapFactory.decodeStream(url.openStream()));
        helper.setText(R.id.tvTotal,item.total)
        helper.setText(R.id.tvName,item.name)
        helper.setText(R.id.tvNum,item.id.toString())
    }
}