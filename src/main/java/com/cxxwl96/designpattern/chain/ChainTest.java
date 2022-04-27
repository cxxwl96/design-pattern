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

package com.cxxwl96.designpattern.chain;

import org.junit.Test;

/**
 * ChainTest
 *
 * @author cxxwl96
 * @since 2022/4/27 23:27
 */
public class ChainTest {
    @Test
    public void test() {
        final AbstractLogger logger = LoggerFactory.getLogger();
        logger.log(AbstractLogger.INFO, "打了一个INFO级别的log");
        System.out.println("------------------------------");
        logger.log(AbstractLogger.DEBUG, "打了一个DEBUG级别的log");
        System.out.println("------------------------------");
        logger.log(AbstractLogger.ERROR, "打了一个ERROR级别的log");
    }
}
