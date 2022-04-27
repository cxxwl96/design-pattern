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

package com.cxxwl96.designpattern.command;

import org.junit.Test;

/**
 * CommandTest
 *
 * @author cxxwl96
 * @since 2022/4/18 21:59
 */
public class CommandTest {
    @Test
    public void test() {
        final LightReceiver lightReceiver = new LightReceiver();
        final LightOnCommand lightOnCommand = new LightOnCommand(lightReceiver);
        final LightOffCommand lightOffCommand = new LightOffCommand(lightReceiver);
        final RemoteController controller = new RemoteController();
        controller.setCommand(0, lightOnCommand, lightOffCommand);
        controller.onButton(0);
        controller.undo();
        controller.offButton(0);
        controller.undo();
    }
}
