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

package com.cxxwl96.designpattern.strategy;

import org.junit.Test;

/**
 * StrategyTest
 *
 * @author cxxwl96
 * @since 2022/4/27 23:09
 */
public class StrategyTest {
    @Test
    public void test() {
        final Strategy addStrategy = new AddStrategy();
        final Strategy subtractStrategy = new SubtractStrategy();
        System.out.println("1+2=" + new Context(addStrategy).doAction(1, 2));
        System.out.println("5-3=" + new Context(subtractStrategy).doAction(5, 3));
    }
}
