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

package com.cxxwl96.designpattern.prototype;

import org.junit.Test;

/**
 * ShapeTest
 *
 * @author cxxwl96
 * @since 2022/3/28 21:55
 */
public class ShapeTest {
    @Test
    public void test() {
        try {
            final Shape shape1 = new Shape("多莉", 24);
            final Shape shape2 = (Shape) shape1.clone();
            System.out.println(shape1 == shape2); // false
            System.out.println(shape1);
            System.out.println(shape2);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
