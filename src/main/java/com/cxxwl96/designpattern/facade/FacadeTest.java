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

package com.cxxwl96.designpattern.facade;

import org.junit.Test;

/**
 * FacadeTest
 *
 * @author cxxwl96
 * @since 2022/4/10 22:09
 */
public class FacadeTest {
    @Test
    public void test() {
        final HomeTheaterFacade facade = new HomeTheaterFacade();
        System.out.println("==========准备工作=========");
        facade.ready();
        System.out.println("==========开始播放=========");
        facade.play();
        System.out.println("==========暂停播放=========");
        facade.pause();
        System.out.println("==========结束播放=========");
        facade.end();
    }
}
