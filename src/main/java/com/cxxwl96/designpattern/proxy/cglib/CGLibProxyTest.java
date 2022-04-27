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

package com.cxxwl96.designpattern.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;

import org.junit.Test;

/**
 * CGLibProxyTest
 *
 * @author cxxwl96
 * @since 2022/4/17 18:23
 */
public class CGLibProxyTest {
    @Test
    public void test() {
        final Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(MyService.class);
        enhancer.setCallback(new ServiceProxy());
        final MyService service = (MyService) enhancer.create();
        service.add();
    }
}
