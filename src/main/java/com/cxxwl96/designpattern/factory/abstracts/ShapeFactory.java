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

import com.cxxwl96.designpattern.factory.simple.Circle;
import com.cxxwl96.designpattern.factory.simple.Rectangle;
import com.cxxwl96.designpattern.factory.simple.Shape;
import com.cxxwl96.designpattern.factory.simple.Square;

/**
 * ShapeFactory
 *
 * @author cxxwl96
 * @since 2022/3/21 16:14
 */
public class ShapeFactory {
    public com.cxxwl96.designpattern.factory.simple.Shape getShape(String shapeStr) {
        switch (shapeStr) {
            case "rectangle":
                return new Rectangle();
            case "square":
                return new Square();
            case "circle":
                return new Circle();
            default:
                return null;
        }
    }
}
