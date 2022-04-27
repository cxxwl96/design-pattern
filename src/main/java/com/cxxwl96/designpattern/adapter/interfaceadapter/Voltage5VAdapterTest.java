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

package com.cxxwl96.designpattern.adapter.interfaceadapter;

import org.junit.Test;

/**
 * Voltage5VAdapterTest
 *
 * @author cxxwl96
 * @since 2022/4/3 23:33
 */
public class Voltage5VAdapterTest {
    @Test
    public void test() {
        final Voltage5VAdapter adapter = new Voltage5VAdapter() {
            @Override
            public int output5v(Voltage220V voltage220V) {
                final int voltage = voltage220V.output() / 44;
                System.out.println("转换输出电压" + voltage + "V电压");
                return voltage;
            }
        };
        System.out.println(adapter.output5v(new Voltage220V()));
    }
}
