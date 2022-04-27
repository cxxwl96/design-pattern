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

/**
 * User
 *
 * @author cxxwl96
 * @since 2022/4/23 21:44
 */
public class User extends IUser {
    public User(ChatRoom room, String name) {
        super(room, name);
        this.room.register(this);
    }

    @Override
    public void receive(String msg) {
        System.out.println(name + "接收到消息：" + msg);
    }

    @Override
    public void send(String msg) {
        System.out.println(name + "发送消息：" + msg);
        room.forward(this, msg);
    }
}
