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

package com.cxxwl96.designpattern.composite;

import org.junit.Test;

/**
 * CompositeTest
 *
 * @author cxxwl96
 * @since 2022/4/5 21:30
 */
public class CompositeTest {
    @Test
    public void test() {
        final University university = new University("清华大学");
        final College college1 = new College("计算机学院");
        final College college2 = new College("信息工程学院");
        final Department department1 = new Department("软件工程");
        final Department department2 = new Department("网络工程");
        final Department department3 = new Department("计算机与科学技术");
        final Department department4 = new Department("通信工程");
        final Department department5 = new Department("信息工程");
        college1.add(department1);
        college1.add(department2);
        college1.add(department3);
        college2.add(department4);
        college2.add(department5);
        university.add(college1);
        university.add(college2);
        university.print();
    }
}
