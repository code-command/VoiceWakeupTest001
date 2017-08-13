package com.huawei.z00426996.voicewakeuptest001.Model.Bean;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.huawei.z00426996.voicewakeuptest001.BR;

/**
 * 用于描述系统中各种信息，采用单例模式
 */

public class SystemInfo extends BaseObservable {
    boolean voiceWakeupSwitch = false;

    private static SystemInfo systemInfo;

    /**
     *  私有构造函数，杜绝直接创建
     */
    private SystemInfo() {
        voiceWakeupSwitch = false;
    }

    /**
     * 利用单例模式创建，减少相应变量信息在方法间传递的工作
     */
    public static SystemInfo getSystemInfo() {
        if(systemInfo == null){
            synchronized (SystemInfo.class){
                if(systemInfo == null){
                    systemInfo = new SystemInfo();
                }
            }
        }
        return systemInfo;
    }

    @Bindable
    public boolean isVoiceWakeupSwitch() {
        return voiceWakeupSwitch;
    }

    public void setVoiceWakeupSwitch(boolean voiceWakeupSwitch) {
        this.voiceWakeupSwitch = voiceWakeupSwitch;
        notifyPropertyChanged(BR.voiceWakeupSwitch);
    }
}
