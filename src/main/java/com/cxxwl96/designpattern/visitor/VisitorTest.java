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

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * VisitorTest
 *
 * @author cxxwl96
 * @since 2022/4/19 21:58
 */
public class VisitorTest {
    @Test
    public void test() {
        // 这里可以再次封装成ObjectStructure结构对象角色
        final List<Course> courses = new ArrayList<>();
        courses.add(new CodingCourse("实战课程", 29.9));
        courses.add(new FreeCourse("免费课程"));
        final IVisitor visitor = new Visitor();
        courses.forEach(course -> course.accept(visitor));
    }
}
