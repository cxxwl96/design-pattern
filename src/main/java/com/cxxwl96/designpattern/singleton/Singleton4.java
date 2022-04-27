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

package com.cxxwl96.designpattern.singleton;

/**
 * 懒汉式（线程安全，同步方法）
 */
public class Singleton4 {
    private static Singleton4 instance;

    private Singleton4() {
    }

    // 添加同步
    public static synchronized Singleton4 getInstance() {
        // 获取实例时才创建
        if (instance == null) {
            instance = new Singleton4();
        }
        return instance;
    }
}