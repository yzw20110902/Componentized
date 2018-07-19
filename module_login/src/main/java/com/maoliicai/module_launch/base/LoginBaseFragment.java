package com.maoliicai.module_launch.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.maoliicai.common.base.BaseMvpActivity;
import com.maoliicai.common.base.BaseMvpFragment;
import com.maoliicai.common.base.BasePresenter;
import com.maoliicai.common.base.IBaseView;
import com.maoliicai.common.https.RetrofitManager;

/**
 * yangyoupeng  on 2018/4/20.
 */

public abstract class LoginBaseFragment<V extends IBaseView, P extends BasePresenter<V>> extends BaseMvpFragment<V, P> {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return super.onCreateView(inflater, container, savedInstanceState);
    }
}
