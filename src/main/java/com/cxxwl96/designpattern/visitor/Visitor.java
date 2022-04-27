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
 * 观察者模式
 */
public class Visitor implements IVisitor {
    /**
     * 访问免费课程
     *
     * @param course course
     */
    @Override
    public void visit(FreeCourse course) {
        course.doSomething();
    }

    /**
     * 访问实战课程
     *
     * @param course course
     */
    @Override
    public void visit(CodingCourse course) {
        course.doSomething();
    }
}
