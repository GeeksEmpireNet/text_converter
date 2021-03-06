/*
 * Copyright (c) 2017 by Tran Le Duy
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

package org.apache.commons.codec.digest;

import junit.framework.TestCase;

/**
 * Created by Duy on 11-Jul-17.
 */
public class Sha2CryptTest extends TestCase {

    public void test1() {
        String s = Sha2Crypt.sha256Crypt("HELLO".getBytes());
        System.out.println(s);

        String s1 = Sha2Crypt.sha256Crypt("$5$mJPTDuPK$pg2eKVK4ZubK9.fNylL2UjdFk0Ajjej2nnaXnjl.HP9".getBytes());
        System.out.println(s1);
    }
}