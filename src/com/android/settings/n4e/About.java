/*
 * Copyright (C) 2016 The NeXus4ever Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.-
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

package com.android.settings.n4e;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.preference.Preference;

import com.android.internal.logging.MetricsProto.MetricsEvent;

import com.android.settings.R;
import com.android.settings.SettingsPreferenceFragment;

public class About extends SettingsPreferenceFragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.nexus_about);
    }

    @Override
    public boolean onPreferenceTreeClick(Preference preference) {
        if (preference.getKey().equals("updates")) {
            AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
            builder.setTitle(R.string.update_dialog);
            builder.setItems(R.array.update_entries, new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which) {
                    String [] notificationValues = {"https://plus.google.com/u/0/collection/UgfmME"};
                    Intent link = new Intent(Intent.ACTION_VIEW);
                    String item = notificationValues[which];
                    link.setData(Uri.parse(item));
                    try {
                        startActivity(link);
                    } catch (android.content.ActivityNotFoundException e) {
                    }
                }
            });
            builder.show();
        } else if (preference.getKey().equals("social")) {
            AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
            builder.setTitle(R.string.social_dialog);
            builder.setItems(R.array.social_entries, new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which) {
                    String [] socialValues = {"https://plus.google.com/u/0/communities/112093393520313024540",
                        "http://forum.xda-developers.com/nexus-4/development/rom-nexus4ever-rom-t3481930"};
                    Intent link = new Intent(Intent.ACTION_VIEW);
                    String item = socialValues[which];
                    link.setData(Uri.parse(item));
                    try {
                        startActivity(link);
                    } catch (android.content.ActivityNotFoundException e) {
                    }
                }
            });
            builder.show();
        } else if (preference.getKey().equals("spezi77")) {
            AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
            builder.setTitle(R.string.spz_dialog);
            builder.setItems(R.array.spz_entries, new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which) {
                    String [] spzValues = {"http://forum.xda-developers.com/member.php?u=5091819"};
                    Intent link = new Intent(Intent.ACTION_VIEW);
                    String item = spzValues[which];
                    link.setData(Uri.parse(item));
                    try {
                        startActivity(link);
                    } catch (android.content.ActivityNotFoundException e) {
                    }
                }
            });
            builder.show();
        } else if (preference.getKey().equals("dragos281993")) {
            AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
            builder.setTitle(R.string.dragos_dialog);
            builder.setItems(R.array.dragos_entries, new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which) {
                    String [] dragosValues = {
                        "http://forum.xda-developers.com/member.php?u=5796730"};
                    Intent link = new Intent(Intent.ACTION_VIEW);
                    String item = dragosValues[which];
                    link.setData(Uri.parse(item));
                    try {
                        startActivity(link);
                    } catch (android.content.ActivityNotFoundException e) {
                    }
                }
            });
            builder.show();
        }
        return super.onPreferenceTreeClick(preference);
    }

    @Override
    protected int getMetricsCategory() {
        return MetricsEvent.NEXUS_SETTINGS;
    }
}
