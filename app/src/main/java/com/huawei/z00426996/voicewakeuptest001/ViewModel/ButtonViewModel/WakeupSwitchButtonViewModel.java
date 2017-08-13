package com.huawei.z00426996.voicewakeuptest001.ViewModel.ButtonViewModel;

import android.view.View;
import android.view.View.OnClickListener;

import com.huawei.z00426996.voicewakeuptest001.Model.Bean.SystemInfo;

public class WakeupSwitchButtonViewModel implements OnClickListener {

    SystemInfo systemInfo;

    public WakeupSwitchButtonViewModel() {
        this.systemInfo = SystemInfo.getSystemInfo();
    }

    @Override
    public void onClick(View v) {
        if (systemInfo.isVoiceWakeupSwitch()) {
            systemInfo.setVoiceWakeupSwitch(false);
        } else {
            systemInfo.setVoiceWakeupSwitch(true);
        }
    }
}
