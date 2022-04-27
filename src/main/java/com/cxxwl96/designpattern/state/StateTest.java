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

package com.cxxwl96.designpattern.state;

import org.junit.Test;

/**
 * StateTest
 *
 * @author cxxwl96
 * @since 2022/4/27 22:58
 */
public class StateTest {
    @Test
    public void test() {
        final Context context = new Context();
        final State startState = new StartState();
        final State stopState = new StopState();
        startState.doAction(context);
        System.out.println("Current state: " + context.getState());
        stopState.doAction(context);
        System.out.println("Current state: " + context.getState());
    }
}
