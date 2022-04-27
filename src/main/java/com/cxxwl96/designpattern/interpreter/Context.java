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

package com.cxxwl96.designpattern.interpreter;

import java.util.Arrays;

/**
 * 环境类
 */
public class Context {
    private final Expression cityPerson;

    public Context() {
        String[] citys = {"韶关", "广州"};
        Expression city = new TerminalExpression(Arrays.asList(citys));
        String[] persons = {"老人", "妇女", "儿童"};
        Expression person = new TerminalExpression(Arrays.asList(persons));
        cityPerson = new AndExpression(city, person);
    }

    public void freeRide(String content) {
        if (cityPerson.interpreter(content)) {
            System.out.println("您是" + content + "，您本次乘车免费！");
        } else {
            System.out.println(content + "，您不是免费人员，本次乘车扣费2元！");
        }
    }
}
