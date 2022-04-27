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

import java.util.ArrayList;
import java.util.List;

/**
 * 备忘录管理者
 */
public class Caretaker {
    private final List<Memento> mementos;

    public Caretaker() {
        mementos = new ArrayList<>();
    }

    /**
     * 保存备忘录
     *
     * @param memento 备忘录
     */
    public void saveMemento(Memento memento) {
        this.mementos.add(memento);
        System.out.println("保存状态: " + memento.getState());
    }

    /**
     * 获取备忘录
     *
     * @param index 索引
     * @return 备忘录
     */
    public Memento getMemento(int index) {
        return mementos.get(index);
    }

    public void show() {
        System.out.println("所有状态：");
        mementos.forEach(memento -> System.out.printf("[%s] %s\n", memento.getCreateDate(), memento.getState()));
    }
}
