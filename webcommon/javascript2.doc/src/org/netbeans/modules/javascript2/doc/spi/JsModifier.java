/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.netbeans.modules.javascript2.doc.spi;

/**
 * Possible modifiers of the javaScript element declared by documentation tools.
 */
public enum JsModifier {

    /** Private modifier. */
    PRIVATE("private"),

    /** Public modifier. */
    PUBLIC("public"),

    /** Static modifier. */
    STATIC("static");

    private final String value;

    private JsModifier(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    /**
     * Gets {@code JsModifier} corresponding to given value.
     * @param value {@code String} value of the {@code JsModifier}
     * @return {@code JsModifier}
     */
    public static JsModifier fromString(String value) {
        for (JsModifier modifier : JsModifier.values()) {
            if (value.equalsIgnoreCase(modifier.toString())) {
                return modifier;
            }
        }
        return null;
    }

}
