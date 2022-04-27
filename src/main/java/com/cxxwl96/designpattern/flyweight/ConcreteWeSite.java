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

/**
 * ConcreteWeSite
 *
 * @author cxxwl96
 * @since 2022/4/18 20:48
 */
public class ConcreteWeSite implements WebSite {
    public final String type;

    public ConcreteWeSite(String type) {
        this.type = type;
    }

    @Override
    public void use(String user) {
        System.out.printf("网站类型：%s, %s正在使用\n", type, user);
    }
}
