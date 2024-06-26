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

package io.asgardeo.android.core.core.managers.logout

import io.asgardeo.android.core.models.exceptions.LogoutException
import java.io.IOException

/**
 * Manager to handle the logout of the user from the application
 * This manager is responsible for handling the logout of the user from the application
 */
interface LogoutManager {
    /**
     * Logout the user from the application.
     *
     * @param idToken Id token of the user
     *
     * @throws [LogoutException] If the logout fails
     * @throws [IOException] If the request fails due to a network error
     */
    suspend fun logout(idToken: String): Unit?
}
