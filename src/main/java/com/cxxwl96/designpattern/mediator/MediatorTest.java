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

import org.junit.Test;

/**
 * MediatorTest
 *
 * @author cxxwl96
 * @since 2022/4/23 21:59
 */
public class MediatorTest {
    @Test
    public void test() {
        final ChatRoom room = new ChatRoom();
        final User seller = new User(room, "房屋中介");
        final User buyer1 = new User(room, "买家1");
        final User buyer2 = new User(room, "买家2");
        seller.send("我有一套房子");
        System.out.println("--------------");
        buyer1.send("有两室一厅的吗？");
        System.out.println("--------------");
        seller.send("有");
        System.out.println("--------------");
        buyer2.send("在哪儿？");
    }
}
