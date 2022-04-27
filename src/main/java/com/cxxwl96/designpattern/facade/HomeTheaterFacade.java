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

/**
 * 外观模式解决家庭影院流程复杂问题
 */
public class HomeTheaterFacade {
    // 影院灯光
    private final TheaterLight theaterLight;

    // 爆米花机
    private final Popcorn popcorn;

    // 立体声
    private final Stereo stereo;

    // 投影仪
    private final Projector projector;

    // 屏幕
    private final Screen screen;

    // 播放器
    private final DVDPlayer dvdPlayer;

    public HomeTheaterFacade() {
        this.theaterLight = TheaterLight.getInstance();
        this.popcorn = Popcorn.getInstance();
        this.stereo = Stereo.getInstance();
        this.projector = Projector.getInstance();
        this.screen = Screen.getInstance();
        this.dvdPlayer = DVDPlayer.getInstance();
    }

    public void ready() {
        // 打开影院灯光
        theaterLight.on();
        // 打开爆米花机
        popcorn.on();
        // 制作爆米花
        popcorn.pop();
        // 屏幕下降
        screen.down();
        // 打开投影仪
        projector.on();
        // 投影仪聚焦
        projector.focus();
        // 打开立体声
        stereo.on();
        // 打开播放器
        dvdPlayer.on();
        // 调暗影院灯光
        theaterLight.dim();
    }

    public void play() {
        // 播放电影...
        dvdPlayer.play();
    }

    public void pause() {
        // 暂停播放
        dvdPlayer.pause();
    }

    public void end() {
        // 关闭爆米花机
        popcorn.off();
        // 调亮影院灯光
        theaterLight.bright();
        // 屏幕上升
        screen.up();
        // 关闭投影仪
        projector.off();
        // 关闭立体声
        stereo.off();
        // 关闭播放器
        dvdPlayer.off();
        // 关闭影院灯光
        theaterLight.off();
    }
}
