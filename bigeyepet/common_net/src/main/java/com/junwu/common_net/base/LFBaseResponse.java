/*******************************************************************************
 * * Copyright (C) 2015 www.wkzf.com
 * *
 * * Licensed under the Apache License, Version 2.0 (the "License");
 * * you may not use this file except in compliance with the License.
 * * You may obtain a copy of the License at
 * *
 * *      http://www.apache.org/licenses/LICENSE-2.0
 * *
 * * Unless required by applicable law or agreed to in writing, software
 * * distributed under the License is distributed on an "AS IS" BASIS,
 * * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * * See the License for the specific language governing permissions and
 * * limitations under the License.
 ******************************************************************************/

package com.junwu.common_net.base;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.junwu.pet_net.annotation.JsonDebugAnnotation;
import com.junwu.pet_net.base.EndpointResponse;


/**
 * Created by wangying on 2015/2/9.
 */
public class LFBaseResponse extends EndpointResponse {
    @JsonIgnore
    @JsonDebugAnnotation
    String debugJson;

    public boolean succeeded() {
        return getStatus() == 1;
    }

    public String getDebugJson() {
        return debugJson;
    }
}
