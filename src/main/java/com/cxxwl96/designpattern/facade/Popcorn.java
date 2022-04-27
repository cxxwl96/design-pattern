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

package com.cxxwl96.designpattern.facade;

/**
 * 爆米花机
 */
public class Popcorn {
    private static final Popcorn INSTANCE = new Popcorn();

    private Popcorn() {
    }

    public static Popcorn getInstance() {
        return INSTANCE;
    }

    public void on() {
        System.out.println("打开爆米花机");
    }

    public void pop() {
        System.out.println("制作爆米花");
    }

    public void off() {
        System.out.println("关闭爆米花机");
    }
}
