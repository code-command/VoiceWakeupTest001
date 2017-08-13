package com.huawei.z00426996.voicewakeuptest001.Model.Adapters.BindingAdapters;

import android.widget.Button;

/**
 * Created by zhangziyu on 2017/8/13.
 */

public class ButtonsBindingAdapter {

    @android.databinding.BindingAdapter("isOpenSwitch")
    public static void changedWakeupSwitchButton(Button button, boolean openSwitch) {
        if (openSwitch) {
        }
    }
}
