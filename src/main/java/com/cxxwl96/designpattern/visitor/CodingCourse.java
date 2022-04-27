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

package com.cxxwl96.designpattern.visitor;

/**
 * CodingCourse
 *
 * @author cxxwl96
 * @since 2022/4/19 21:57
 */
public class CodingCourse implements Course {

    private final String name;

    private final double price;

    public CodingCourse(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public void doSomething() {
        System.out.println(this.name + ":" + this.price);
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
