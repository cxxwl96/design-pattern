/*
 * Copyright (c) 2021-2022, jad (cxxwl96@sina.com).
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.cxxwl96.designpattern.mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * 中介者模式
 */
public class ChatRoom {
    private final List<IUser> users;

    public ChatRoom() {
        users = new ArrayList<>();
    }

    public void register(IUser user) {
        if (!users.contains(user)) {
            users.add(user);
        }
    }

    public void forward(IUser user, String msg) {
        for (IUser item : users) {
            if (item != user) {
                item.receive(msg);
            }
        }
    }
}
