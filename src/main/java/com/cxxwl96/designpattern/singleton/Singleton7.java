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
 * 静态内部类
 */
public class Singleton7 {
    private Singleton7() {
    }

    /**
     * 当类加载器加载外部类的时候，静态内部类是不会被加载的，只有当静态内部类第一次使用时才会被加载
     * 类被加载的时候是线程安全的，所以不用考虑线程安全问题
     */
    private static class SingletonInner {
        private static final Singleton7 INSTANCE = new Singleton7();
    }

    public static Singleton7 getInstance() {
        return SingletonInner.INSTANCE;
    }
}