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

package com.cxxwl96.designpattern.bridge;

import org.junit.Test;

/**
 * BridgeTest
 *
 * @author cxxwl96
 * @since 2022/4/4 23:24
 */
public class BridgeTest {
    @Test
    public void test() {
        final Circle blueCircle = new Circle(new BlueColor());
        final Circle redCircle = new Circle(new RedColor());
        final Rectangle blueRectangle = new Rectangle(new BlueColor());
        final Rectangle redRectangle = new Rectangle(new RedColor());
        blueCircle.draw();
        redCircle.draw();
        blueRectangle.draw();
        redRectangle.draw();
    }
}
