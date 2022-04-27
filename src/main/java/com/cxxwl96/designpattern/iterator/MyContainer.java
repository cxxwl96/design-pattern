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

package com.cxxwl96.designpattern.iterator;

/**
 * MyContainer
 *
 * @author cxxwl96
 * @since 2022/4/19 22:37
 */
public class MyContainer {
    String[] names = new String[] {"张三", "李四", "王五", "赵六"};

    /**
     * 迭代器模式，返回一个方法内部类
     *
     * @return 迭代器
     */
    public Iterator<String> iterator() {
        return new Iterator<String>() {
            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < names.length;
            }

            @Override
            public String next() {
                if (hasNext()) {
                    return names[index++];
                }
                return null;
            }
        };
    }
}
