/*
 * Copyright (C) 2008 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.android.systemui.statusbar.policy;

import com.android.systemui.R;

class TelephonyIcons {
    //***** Signal strength icons

    //GSM/UMTS
    static final int[][] sSignalImages = {
        { R.drawable.stat_sys_signal_0,
          R.drawable.stat_sys_signal_1,
          R.drawable.stat_sys_signal_2,
          R.drawable.stat_sys_signal_3,
          R.drawable.stat_sys_signal_4 },
        { R.drawable.stat_sys_signal_0_fully,
          R.drawable.stat_sys_signal_1_fully,
          R.drawable.stat_sys_signal_2_fully,
          R.drawable.stat_sys_signal_3_fully,
          R.drawable.stat_sys_signal_4_fully }
    };

    static final int[][] sSignalImages_r = {
        { R.drawable.stat_sys_r_signal_0,
          R.drawable.stat_sys_r_signal_1,
          R.drawable.stat_sys_r_signal_2,
          R.drawable.stat_sys_r_signal_3,
          R.drawable.stat_sys_r_signal_4 },
        { R.drawable.stat_sys_r_signal_0_fully,
          R.drawable.stat_sys_r_signal_1_fully,
          R.drawable.stat_sys_r_signal_2_fully,
          R.drawable.stat_sys_r_signal_3_fully,
          R.drawable.stat_sys_r_signal_4_fully }
    };

    //***** Data connection icons

    //GSM/UMTS
    static final int[][] sDataNetType_g = {
            { R.drawable.stat_sys_data_connected_g,
              R.drawable.stat_sys_data_in_g,
              R.drawable.stat_sys_data_out_g,
              R.drawable.stat_sys_data_inandout_g },
            { R.drawable.stat_sys_data_fully_connected_g,
              R.drawable.stat_sys_data_fully_in_g,
              R.drawable.stat_sys_data_fully_out_g,
              R.drawable.stat_sys_data_fully_inandout_g }
        };

    static final int[][] sDataNetType_3g = {
            { R.drawable.stat_sys_data_connected_3g,
              R.drawable.stat_sys_data_in_3g,
              R.drawable.stat_sys_data_out_3g,
              R.drawable.stat_sys_data_inandout_3g },
            { R.drawable.stat_sys_data_fully_connected_3g,
              R.drawable.stat_sys_data_fully_in_3g,
              R.drawable.stat_sys_data_fully_out_3g,
              R.drawable.stat_sys_data_fully_inandout_3g }
        };

    static final int[][] sDataNetType_e = {
            { R.drawable.stat_sys_data_connected_e,
              R.drawable.stat_sys_data_in_e,
              R.drawable.stat_sys_data_out_e,
              R.drawable.stat_sys_data_inandout_e },
            { R.drawable.stat_sys_data_fully_connected_e,
              R.drawable.stat_sys_data_fully_in_e,
              R.drawable.stat_sys_data_fully_out_e,
              R.drawable.stat_sys_data_fully_inandout_e }
        };

    //3.5G
    static final int[][] sDataNetType_h = {
            { R.drawable.stat_sys_data_connected_h,
              R.drawable.stat_sys_data_in_h,
              R.drawable.stat_sys_data_out_h,
              R.drawable.stat_sys_data_inandout_h },
            { R.drawable.stat_sys_data_fully_connected_h,
              R.drawable.stat_sys_data_fully_in_h,
              R.drawable.stat_sys_data_fully_out_h,
              R.drawable.stat_sys_data_fully_inandout_h }
    };

    //HPSPA+
    static final int[][] sDataNetType_4g = {
            { R.drawable.stat_sys_data_connected_4g,
              R.drawable.stat_sys_data_in_4g,
              R.drawable.stat_sys_data_out_4g,
              R.drawable.stat_sys_data_inandout_4g },
            { R.drawable.stat_sys_data_fully_connected_4g,
              R.drawable.stat_sys_data_fully_in_4g,
              R.drawable.stat_sys_data_fully_out_4g,
              R.drawable.stat_sys_data_fully_inandout_4g }
    };

    //CDMA
    static final int[] sRoamingIndicatorImages_cdma = new int[] {
        R.drawable.stat_sys_roaming_cdma_0, //Standard Roaming Indicator
        // 1 is Standard Roaming Indicator OFF
        // TODO T: image never used, remove and put 0 instead?
        R.drawable.stat_sys_roaming_cdma_0,

        // 2 is Standard Roaming Indicator FLASHING
        // TODO T: image never used, remove and put 0 instead?
        R.drawable.stat_sys_roaming_cdma_0,

        // 3-12 Standard ERI
        R.drawable.stat_sys_roaming_cdma_0, //3
        R.drawable.stat_sys_roaming_cdma_0,
        R.drawable.stat_sys_roaming_cdma_0,
        R.drawable.stat_sys_roaming_cdma_0,
        R.drawable.stat_sys_roaming_cdma_0,
        R.drawable.stat_sys_roaming_cdma_0,
        R.drawable.stat_sys_roaming_cdma_0,
        R.drawable.stat_sys_roaming_cdma_0,
        R.drawable.stat_sys_roaming_cdma_0,
        R.drawable.stat_sys_roaming_cdma_0,

        // 13-63 Reserved for Standard ERI
        R.drawable.stat_sys_roaming_cdma_0, //13
        R.drawable.stat_sys_roaming_cdma_0,
        R.drawable.stat_sys_roaming_cdma_0,
        R.drawable.stat_sys_roaming_cdma_0,
        R.drawable.stat_sys_roaming_cdma_0,
        R.drawable.stat_sys_roaming_cdma_0,
        R.drawable.stat_sys_roaming_cdma_0,
        R.drawable.stat_sys_roaming_cdma_0,
        R.drawable.stat_sys_roaming_cdma_0,
        R.drawable.stat_sys_roaming_cdma_0,
        R.drawable.stat_sys_roaming_cdma_0,
        R.drawable.stat_sys_roaming_cdma_0,
        R.drawable.stat_sys_roaming_cdma_0,
        R.drawable.stat_sys_roaming_cdma_0,
        R.drawable.stat_sys_roaming_cdma_0,
        R.drawable.stat_sys_roaming_cdma_0,
        R.drawable.stat_sys_roaming_cdma_0,
        R.drawable.stat_sys_roaming_cdma_0,
        R.drawable.stat_sys_roaming_cdma_0,
        R.drawable.stat_sys_roaming_cdma_0,
        R.drawable.stat_sys_roaming_cdma_0,
        R.drawable.stat_sys_roaming_cdma_0,
        R.drawable.stat_sys_roaming_cdma_0,
        R.drawable.stat_sys_roaming_cdma_0,
        R.drawable.stat_sys_roaming_cdma_0,
        R.drawable.stat_sys_roaming_cdma_0,
        R.drawable.stat_sys_roaming_cdma_0,
        R.drawable.stat_sys_roaming_cdma_0,
        R.drawable.stat_sys_roaming_cdma_0,
        R.drawable.stat_sys_roaming_cdma_0,
        R.drawable.stat_sys_roaming_cdma_0,
        R.drawable.stat_sys_roaming_cdma_0,
        R.drawable.stat_sys_roaming_cdma_0,
        R.drawable.stat_sys_roaming_cdma_0,
        R.drawable.stat_sys_roaming_cdma_0,
        R.drawable.stat_sys_roaming_cdma_0,
        R.drawable.stat_sys_roaming_cdma_0,
        R.drawable.stat_sys_roaming_cdma_0,
        R.drawable.stat_sys_roaming_cdma_0,
        R.drawable.stat_sys_roaming_cdma_0,
        R.drawable.stat_sys_roaming_cdma_0,
        R.drawable.stat_sys_roaming_cdma_0,
        R.drawable.stat_sys_roaming_cdma_0,
        R.drawable.stat_sys_roaming_cdma_0,
        R.drawable.stat_sys_roaming_cdma_0,
        R.drawable.stat_sys_roaming_cdma_0,
        R.drawable.stat_sys_roaming_cdma_0,
        R.drawable.stat_sys_roaming_cdma_0,
        R.drawable.stat_sys_roaming_cdma_0,
        R.drawable.stat_sys_roaming_cdma_0,
        R.drawable.stat_sys_roaming_cdma_0,

        // 64-127 Reserved for Non Standard (Operator Specific) ERI
        R.drawable.stat_sys_roaming_cdma_0, //64
        R.drawable.stat_sys_roaming_cdma_0,
        R.drawable.stat_sys_roaming_cdma_0,
        R.drawable.stat_sys_roaming_cdma_0,
        R.drawable.stat_sys_roaming_cdma_0,
        R.drawable.stat_sys_roaming_cdma_0,
        R.drawable.stat_sys_roaming_cdma_0,
        R.drawable.stat_sys_roaming_cdma_0,
        R.drawable.stat_sys_roaming_cdma_0,
        R.drawable.stat_sys_roaming_cdma_0,
        R.drawable.stat_sys_roaming_cdma_0,
        R.drawable.stat_sys_roaming_cdma_0,
        R.drawable.stat_sys_roaming_cdma_0,
        R.drawable.stat_sys_roaming_cdma_0,
        R.drawable.stat_sys_roaming_cdma_0,
        R.drawable.stat_sys_roaming_cdma_0,
        R.drawable.stat_sys_roaming_cdma_0,
        R.drawable.stat_sys_roaming_cdma_0,
        R.drawable.stat_sys_roaming_cdma_0,
        R.drawable.stat_sys_roaming_cdma_0, //83
        R.drawable.stat_sys_roaming_cdma_0,
        R.drawable.stat_sys_roaming_cdma_0,
        R.drawable.stat_sys_roaming_cdma_0,
        R.drawable.stat_sys_roaming_cdma_0,
        R.drawable.stat_sys_roaming_cdma_0,
        R.drawable.stat_sys_roaming_cdma_0,
        R.drawable.stat_sys_roaming_cdma_0,
        R.drawable.stat_sys_roaming_cdma_0,
        R.drawable.stat_sys_roaming_cdma_0,
        R.drawable.stat_sys_roaming_cdma_0,
        R.drawable.stat_sys_roaming_cdma_0,
        R.drawable.stat_sys_roaming_cdma_0,
        R.drawable.stat_sys_roaming_cdma_0,
        R.drawable.stat_sys_roaming_cdma_0,
        R.drawable.stat_sys_roaming_cdma_0,
        R.drawable.stat_sys_roaming_cdma_0,
        R.drawable.stat_sys_roaming_cdma_0,
        R.drawable.stat_sys_roaming_cdma_0,
        R.drawable.stat_sys_roaming_cdma_0,
        R.drawable.stat_sys_roaming_cdma_0,
        R.drawable.stat_sys_roaming_cdma_0,
        R.drawable.stat_sys_roaming_cdma_0,
        R.drawable.stat_sys_roaming_cdma_0,
        R.drawable.stat_sys_roaming_cdma_0,
        R.drawable.stat_sys_roaming_cdma_0,
        R.drawable.stat_sys_roaming_cdma_0,
        R.drawable.stat_sys_roaming_cdma_0,
        R.drawable.stat_sys_roaming_cdma_0,
        R.drawable.stat_sys_roaming_cdma_0,
        R.drawable.stat_sys_roaming_cdma_0,
        R.drawable.stat_sys_roaming_cdma_0,
        R.drawable.stat_sys_roaming_cdma_0,
        R.drawable.stat_sys_roaming_cdma_0,
        R.drawable.stat_sys_roaming_cdma_0,
        R.drawable.stat_sys_roaming_cdma_0,
        R.drawable.stat_sys_roaming_cdma_0,
        R.drawable.stat_sys_roaming_cdma_0,
        R.drawable.stat_sys_roaming_cdma_0,
        R.drawable.stat_sys_roaming_cdma_0,
        R.drawable.stat_sys_roaming_cdma_0,
        R.drawable.stat_sys_roaming_cdma_0,
        R.drawable.stat_sys_roaming_cdma_0,
        R.drawable.stat_sys_roaming_cdma_0,
        R.drawable.stat_sys_roaming_cdma_0,
        R.drawable.stat_sys_roaming_cdma_0,
        R.drawable.stat_sys_roaming_cdma_0,
        R.drawable.stat_sys_roaming_cdma_0,
        R.drawable.stat_sys_roaming_cdma_0,
        R.drawable.stat_sys_roaming_cdma_0,
        R.drawable.stat_sys_roaming_cdma_0,
        R.drawable.stat_sys_roaming_cdma_0,
        R.drawable.stat_sys_roaming_cdma_0,
        R.drawable.stat_sys_roaming_cdma_0,
        R.drawable.stat_sys_roaming_cdma_0,
        R.drawable.stat_sys_roaming_cdma_0,
        R.drawable.stat_sys_roaming_cdma_0,
        R.drawable.stat_sys_roaming_cdma_0,
        R.drawable.stat_sys_roaming_cdma_0,
        R.drawable.stat_sys_roaming_cdma_0,
        R.drawable.stat_sys_roaming_cdma_0,
        R.drawable.stat_sys_roaming_cdma_0,
        R.drawable.stat_sys_roaming_cdma_0,
        R.drawable.stat_sys_roaming_cdma_0,
        R.drawable.stat_sys_roaming_cdma_0,
        R.drawable.stat_sys_roaming_cdma_0,
        R.drawable.stat_sys_roaming_cdma_0,
        R.drawable.stat_sys_roaming_cdma_0,
        R.drawable.stat_sys_roaming_cdma_0,
        R.drawable.stat_sys_roaming_cdma_0,
        R.drawable.stat_sys_roaming_cdma_0,
        R.drawable.stat_sys_roaming_cdma_0,
        R.drawable.stat_sys_roaming_cdma_0,
        R.drawable.stat_sys_roaming_cdma_0,
        R.drawable.stat_sys_roaming_cdma_0,
        R.drawable.stat_sys_roaming_cdma_0,
        R.drawable.stat_sys_roaming_cdma_0,
        R.drawable.stat_sys_roaming_cdma_0,
        R.drawable.stat_sys_roaming_cdma_0,
        R.drawable.stat_sys_roaming_cdma_0,
        R.drawable.stat_sys_roaming_cdma_0,
        R.drawable.stat_sys_roaming_cdma_0,
        R.drawable.stat_sys_roaming_cdma_0,
        R.drawable.stat_sys_roaming_cdma_0,
        R.drawable.stat_sys_roaming_cdma_0,
        R.drawable.stat_sys_roaming_cdma_0,
        R.drawable.stat_sys_roaming_cdma_0,
        R.drawable.stat_sys_roaming_cdma_0,
        R.drawable.stat_sys_roaming_cdma_0,
        R.drawable.stat_sys_roaming_cdma_0,
        R.drawable.stat_sys_roaming_cdma_0,
        R.drawable.stat_sys_roaming_cdma_0,
        R.drawable.stat_sys_roaming_cdma_0,
        R.drawable.stat_sys_roaming_cdma_0,
        R.drawable.stat_sys_roaming_cdma_0,
        R.drawable.stat_sys_roaming_cdma_0,
        R.drawable.stat_sys_roaming_cdma_0,
        R.drawable.stat_sys_roaming_cdma_0,
        R.drawable.stat_sys_roaming_cdma_0,
        R.drawable.stat_sys_roaming_cdma_0,
        R.drawable.stat_sys_roaming_cdma_0,
        R.drawable.stat_sys_roaming_cdma_0,
        R.drawable.stat_sys_roaming_cdma_0,
        R.drawable.stat_sys_roaming_cdma_0,
        R.drawable.stat_sys_roaming_cdma_0,
        R.drawable.stat_sys_roaming_cdma_0,
        R.drawable.stat_sys_roaming_cdma_0,
        R.drawable.stat_sys_roaming_cdma_0,
        R.drawable.stat_sys_roaming_cdma_0,
        R.drawable.stat_sys_roaming_cdma_0,
        R.drawable.stat_sys_roaming_cdma_0,
        R.drawable.stat_sys_roaming_cdma_0,
        R.drawable.stat_sys_roaming_cdma_0,
        R.drawable.stat_sys_roaming_cdma_0,
        R.drawable.stat_sys_roaming_cdma_0,
        R.drawable.stat_sys_roaming_cdma_0,
        R.drawable.stat_sys_roaming_cdma_0,
        R.drawable.stat_sys_roaming_cdma_0,
        R.drawable.stat_sys_roaming_cdma_0,
        R.drawable.stat_sys_roaming_cdma_0,
        R.drawable.stat_sys_roaming_cdma_0,
        R.drawable.stat_sys_roaming_cdma_0,
        R.drawable.stat_sys_roaming_cdma_0,
        R.drawable.stat_sys_roaming_cdma_0,
        R.drawable.stat_sys_roaming_cdma_0,
        R.drawable.stat_sys_roaming_cdma_0,
        R.drawable.stat_sys_roaming_cdma_0,
        R.drawable.stat_sys_roaming_cdma_0,
        R.drawable.stat_sys_roaming_cdma_0,
        R.drawable.stat_sys_roaming_cdma_0,
        R.drawable.stat_sys_roaming_cdma_0,
        R.drawable.stat_sys_roaming_cdma_0,
        R.drawable.stat_sys_roaming_cdma_0,
        R.drawable.stat_sys_roaming_cdma_0,
        R.drawable.stat_sys_roaming_cdma_0,
        R.drawable.stat_sys_roaming_cdma_0,
        R.drawable.stat_sys_roaming_cdma_0,
        R.drawable.stat_sys_roaming_cdma_0,
        R.drawable.stat_sys_roaming_cdma_0,
        R.drawable.stat_sys_roaming_cdma_0,
        R.drawable.stat_sys_roaming_cdma_0,
        R.drawable.stat_sys_roaming_cdma_0,
        R.drawable.stat_sys_roaming_cdma_0,
        R.drawable.stat_sys_roaming_cdma_0,
        R.drawable.stat_sys_roaming_cdma_0,
        R.drawable.stat_sys_roaming_cdma_0,
        R.drawable.stat_sys_roaming_cdma_0,
        R.drawable.stat_sys_roaming_cdma_0,
        R.drawable.stat_sys_roaming_cdma_0,
        R.drawable.stat_sys_roaming_cdma_0,
        R.drawable.stat_sys_roaming_cdma_0,
        R.drawable.stat_sys_roaming_cdma_0,
        R.drawable.stat_sys_roaming_cdma_0,
        R.drawable.stat_sys_roaming_cdma_0,
        R.drawable.stat_sys_roaming_cdma_0,
        R.drawable.stat_sys_roaming_cdma_0,
        R.drawable.stat_sys_roaming_cdma_0 //239

        // 240-255 Reserved
    };

    // EVDO data and 1x icons for 1XRTT data
    static final int[][] sDataNetType_1x = {
            { R.drawable.stat_sys_data_connected_1x,
              R.drawable.stat_sys_data_in_1x,
              R.drawable.stat_sys_data_out_1x,
              R.drawable.stat_sys_data_inandout_1x },
            { R.drawable.stat_sys_data_fully_connected_1x,
              R.drawable.stat_sys_data_fully_in_1x,
              R.drawable.stat_sys_data_fully_out_1x,
              R.drawable.stat_sys_data_fully_inandout_1x }
            };
}
