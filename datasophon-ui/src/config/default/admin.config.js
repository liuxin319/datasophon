/*
 *  Licensed to the Apache Software Foundation (ASF) under one or more
 *  contributor license agreements.  See the NOTICE file distributed with
 *  this work for additional information regarding copyright ownership.
 *  The ASF licenses this file to You under the Apache License, Version 2.0
 *  (the "License"); you may not use this file except in compliance with
 *  the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

// admin 配置
const ADMIN = {
  palettes: ['#f5222d', '#fa541c', '#fadb14', '#3eaf7c', '#13c2c2', '#2872E0', '#722ed1', '#eb2f96'],
  animates: require('./animate.config').preset,
  theme: {
    mode: {
      DARK: 'dark',
      LIGHT: 'light',
      NIGHT: 'night'
    }
  },
  layout: {
    SIDE: 'side',
    HEAD: 'head'
  }
}

module.exports = ADMIN
