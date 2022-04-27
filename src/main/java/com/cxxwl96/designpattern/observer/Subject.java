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

package com.cxxwl96.designpattern.observer;

import java.util.Vector;

/**
 * Subject
 *
 * @author cxxwl96
 * @since 2022/4/22 22:09
 */
public class Subject {
    private final Vector<Observer> observers;

    private String value;

    public Subject() {
        this.observers = new Vector<>();
    }

    public void attach(Observer observer) {
        if (observer == null) {
            throw new NullPointerException();
        }
        this.observers.add(observer);
    }

    public void remove(Observer observer) {
        if (observer == null) {
            throw new NullPointerException();
        }
        this.observers.remove(observer);
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
        notifyAllObserver();
    }

    private void notifyAllObserver() {
        // 通知所有观察者
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
