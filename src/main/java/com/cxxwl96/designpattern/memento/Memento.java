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

package com.cxxwl96.designpattern.memento;

import java.time.LocalDateTime;

import lombok.Getter;

/**
 * 备忘录
 */
@Getter
public class Memento {
    private final String state;

    private final LocalDateTime createDate;

    public Memento(String state) {
        this.state = state;
        this.createDate = LocalDateTime.now();
    }
}
