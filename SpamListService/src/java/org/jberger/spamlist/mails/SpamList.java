/*
 * Copyright 2012 Jacques Berger.
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
package org.jberger.spamlist.mails;

import java.util.ArrayList;

public class SpamList {

    private ArrayList<String> spamList = new ArrayList<String>();

    public SpamList() {
        spamList.add("berger.jacques@uqam.ca");
        spamList.add("inf4375@jberger.org");
        spamList.add("jacques@jberger.org");
    }

    public String toText() {
        StringBuilder builder = new StringBuilder();
        int count = spamList.size();
        for (int i = 0; i < count; i++) {
            builder.append(spamList.get(i));
            if (i < (count - 1)) {
                builder.append(";");
            }
        }
        return builder.toString();
    }

    public String toHtml() {
        StringBuilder builder = new StringBuilder();
        builder.append("<html><head><title>SPAM LIST</title></head><body><ul>");
        int count = spamList.size();
        for (int i = 0; i < count; i++) {
            builder.append("<li>");
            builder.append(spamList.get(i));
            builder.append("</li>");
        }
        builder.append("</ul></body></html>");
        return builder.toString();
    }
}