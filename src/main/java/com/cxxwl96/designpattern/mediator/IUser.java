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
 * IUser
 *
 * @author cxxwl96
 * @since 2022/4/23 21:52
 */
public abstract class IUser {
    protected final ChatRoom room;

    protected final String name;

    public IUser(ChatRoom room, String name) {
        this.room = room;
        this.name = name;
    }

    /**
     * 接收消息
     */
    public abstract void receive(String msg);

    /**
     * 发送消息
     */
    public abstract void send(String msg);
}
