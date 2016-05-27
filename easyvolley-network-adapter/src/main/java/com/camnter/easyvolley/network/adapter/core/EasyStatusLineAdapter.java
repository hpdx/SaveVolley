/*
 * Copyright (C) 2016 CaMnter yuanyu.camnter@gmail.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.camnter.easyvolley.network.adapter.core;

import com.camnter.easyvolley.network.core.http.EasyStatusLine;

/**
 * Description：EasyStatusLineAdapter
 * Created by：CaMnter
 * Time：2016-05-27 14:15
 */
public interface EasyStatusLineAdapter<T> {
    EasyStatusLine adaptiveStatusLine(EasyProtocolVersionAdapter<T> easyProtocolVersionAdapter, T t);
}