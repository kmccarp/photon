/*
 *
 * Copyright 2016 Netflix, Inc.
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 *
 */

package com.netflix.imflibrary.st2067_100.macro.crop;

public enum MXFRectangle {
    STORED("Stored"),
    SAMPLED("Sampled"),
    DISPLAY("Display"),
    ACTIVE("Active");

    private final String value;

    MXFRectangle(String value) {
        this.value = value;
    }

    public static MXFRectangle fromValue(String value) {
        for (MXFRectangle mxfRectangleEnum : MXFRectangle.values()) {
            if (mxfRectangleEnum.value.equals(value)) {
                return mxfRectangleEnum;
            }
        }
        throw new IllegalArgumentException(value);
    }
}
