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

package com.cxxwl96.designpattern.factory.abstracts;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

import cn.hutool.core.date.LocalDateTimeUtil;

/**
 * FactoryTest
 *
 * @author cxxwl96
 * @since 2022/3/21 16:22
 */
public class FactoryTest {
    private static final SimpleDateFormat TIME_FORMAT = new SimpleDateFormat("HH:mm:ss");
    public static void main(String[] args) throws ParseException {
        String time = "28:00:00";

    }

    @Test
    public void test() {
        final AbstractFactory abstractFactory = new AbstractFactory();
        final ShapeFactory shapeFactory = abstractFactory.getShapeFactory();
        final ColorFactory colorFactory = abstractFactory.getColorFactory();
        shapeFactory.getShape("rectangle").draw();
        shapeFactory.getShape("square").draw();
        shapeFactory.getShape("circle").draw();
        colorFactory.getColor("red").full();
        colorFactory.getColor("blue").full();
        colorFactory.getColor("green").full();
    }
}
