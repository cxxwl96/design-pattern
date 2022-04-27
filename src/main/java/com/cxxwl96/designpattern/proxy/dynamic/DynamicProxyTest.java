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

package com.cxxwl96.designpattern.proxy.dynamic;

import org.junit.Test;

import java.lang.reflect.Proxy;

/**
 * DynamicProxyTest
 *
 * @author cxxwl96
 * @since 2022/4/16 23:11
 */
public class DynamicProxyTest {
    @Test
    public void test() {
        final ClassLoader classLoader = DynamicProxyTest.class.getClassLoader();
        Class<?>[] interfaces = new Class<?>[] {IService.class};
        final ServiceProxy handler = new ServiceProxy(new ServiceImpl());
        final IService service = (IService) Proxy.newProxyInstance(classLoader, interfaces, handler);
        service.add();
    }
}
