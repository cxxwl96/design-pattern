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

package com.cxxwl96.designpattern.builder;

import org.junit.Test;

import java.net.CookieHandler;

/**
 * BuilderTest
 *
 * @author cxxwl96
 * @since 2022/3/29 23:00
 */
public class BuilderTest {
    @Test
    public void test() {
        final HouseDirector commonDirector = new HouseDirector(new CommonHouse());
        final HouseDirector hightDirector = new HouseDirector(new HightHouse());
        final House commonHouse = commonDirector.director();
        final House hightHouse = hightDirector.director();
        System.out.println(commonHouse);
        System.out.println(hightHouse);
    }
}
