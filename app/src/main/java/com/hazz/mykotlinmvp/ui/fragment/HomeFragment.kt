package com.hazz.mykotlinmvp.ui.fragment

import android.os.Bundle
import com.hazz.mykotlinmvp.R
import com.hazz.mykotlinmvp.base.BaseFragment

/**
 * Created by xuhao on 2017/11/8.
 * 首页精选
 */

class HomeFragment : BaseFragment() {
    private var mTitle: String? = null

    override fun getLayoutId(): Int = R.layout.fragment_home

    override fun lazyLoad() {
    }


    override fun initView() {

    }





    companion object {
        fun getInstance(title: String): HomeFragment {
            val fragment = HomeFragment()
            val bundle = Bundle()
            fragment.arguments = bundle
            fragment.mTitle = title
            return fragment
        }
    }

}
