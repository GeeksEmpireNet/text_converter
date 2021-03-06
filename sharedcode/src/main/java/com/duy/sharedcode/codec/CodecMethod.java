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

package com.duy.sharedcode.codec;

public enum CodecMethod {
    ASCII {
        @Override
        public Codec getCodec() {
            return new AsciiCodec();
        }
    },
    BINARY {
        @Override
        public Codec getCodec() {
            return new BinaryCodec();
        }
    },
    HEX {
        @Override
        public Codec getCodec() {
            return new HexCodec();
        }
    },
    OCTAL {
        @Override
        public Codec getCodec() {
            return new OctalCodec();
        }
    },
    REVERSER {
        @Override
        public Codec getCodec() {
            return new ReverserCodec();
        }
    },
    UPPER {
        @Override
        public Codec getCodec() {
            return new UpperCaseCodec();
        }
    },
    LOWER {
        @Override
        public Codec getCodec() {
            return new LowerCaseCodec();
        }
    },
    UPSIDE_DOWNSIDE {
        @Override
        public Codec getCodec() {
            return new UpsideDownTool();
        }
    },
    SUPPER_SCRIPT {
        @Override
        public Codec getCodec() {
            return new SupscriptCodec();
        }
    },
    SUB_SCRIPT {
        @Override
        public Codec getCodec() {
            return new SubscriptCodec();
        }
    },
    MORSE_CODE {
        @Override
        public Codec getCodec() {
            return new MorseCodec();
        }
    },
    ZALGO_MINI {
        @Override
        public Codec getCodec() {
            return new ZalgoMiniCodec();
        }
    },
    ZALGO_NORMAL {
        @Override
        public Codec getCodec() {
            return new ZalgoNormalCodec();
        }
    },
    ZALGO_BIG {
        @Override
        public Codec getCodec() {
            return new ZalgoBigCodec();
        }
    },
    BASE_32 {
        @Override
        public Codec getCodec() {
            return new Base32Codec();
        }
    },
    BASE_64 {
        @Override
        public Codec getCodec() {
            return new Base64Codec();
        }
    },
    URL {
        @Override
        public Codec getCodec() {
            return new URLCodec();
        }
    },
    RANDOM_CASE {
        @Override
        public Codec getCodec() {
            return new RandomCaseCodec();
        }
    },
    CAESAR {
        @Override
        public Codec getCodec() {
            return new CaesarCodec();
        }
    },
    ATBASH {
        @Override
        public Codec getCodec() {
            return new AtbashCodec();
        }
    },
    ROT_13 {
        @Override
        public Codec getCodec() {
            return new RotCodec();
        }
    };

    public abstract Codec getCodec();
}