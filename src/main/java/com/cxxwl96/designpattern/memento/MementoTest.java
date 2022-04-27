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

package com.cxxwl96.designpattern.memento;

import org.junit.Test;

/**
 * MementoTest
 *
 * @author cxxwl96
 * @since 2022/4/23 22:40
 */
public class MementoTest {
    @Test
    public void test() {
        // 备忘录管理者
        final Caretaker caretaker = new Caretaker();
        // 发起人
        final Originator originator = new Originator();
        // 修改状态
        originator.setState("state#1");
        // 保存状态
        caretaker.saveMemento(originator.createMemento());
        // 修改状态
        originator.setState("state#2");
        // 修改状态
        originator.setState("state#3");
        // 保存状态
        caretaker.saveMemento(originator.createMemento());
        caretaker.show();
        // 恢复状态
        final Memento memento = caretaker.getMemento(0);
        originator.restoreMemento(memento);
    }
}
