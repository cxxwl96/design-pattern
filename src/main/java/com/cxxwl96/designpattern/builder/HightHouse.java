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

package com.cxxwl96.designpattern.builder;

/**
 * 具体建造者
 */
public class HightHouse extends AbstractHouseBuilder {
    /**
     * 打地基
     */
    @Override
    protected void buildFoundation() {
        house.setFoundation("高楼：打地基");
    }

    /**
     * 砌墙
     */
    @Override
    protected void buildWall() {
        house.setWall("高楼：砌墙");
    }

    /**
     * 封顶
     */
    @Override
    protected void buildRoof() {
        house.setRoof("高楼：封顶");
    }
}
