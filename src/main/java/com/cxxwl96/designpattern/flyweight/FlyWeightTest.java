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

package com.cxxwl96.designpattern.flyweight;

import org.junit.Test;

/**
 * FlyWeightTest
 *
 * @author cxxwl96
 * @since 2022/4/18 20:55
 */
public class FlyWeightTest {
    @Test
    public void test() {
        final WebSiteFactory factory = new WebSiteFactory();
        factory.getConcreteWebSite("博客").use("张三");
        factory.getConcreteWebSite("新闻").use("李四");
        factory.getConcreteWebSite("新闻").use("王五");
        factory.getConcreteWebSite("新闻").use("赵六");
    }
}
