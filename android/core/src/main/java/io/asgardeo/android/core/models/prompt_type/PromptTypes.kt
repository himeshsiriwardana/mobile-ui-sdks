/*
 *  Copyright (c) 2024, WSO2 LLC. (https://www.wso2.com).
 *
 *  WSO2 LLC. licenses this file to you under the Apache License,
 *  Version 2.0 (the "License"); you may not use this file except
 *  in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an
 *  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  KIND, either express or implied. See the License for the
 *  specific language governing permissions and limitations
 *  under the License.
 */

package io.asgardeo.android.core.models.prompt_type

/**
 * Enum class for prompt types
 *
 * @param promptType Prompt type value
 */
enum class PromptTypes(val promptType: String) {
    /**
     * User prompt type
     */
    USER_PROMPT("USER_PROMPT"),
    /**
     * Redirection prompt type
     */
    REDIRECTION_PROMPT("REDIRECTION_PROMPT"),
}
