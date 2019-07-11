/*
 * Copyright (C) 2011 Thomas Akehurst
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.github.tomakehurst.wiremock.common;

import java.io.File;
import java.net.URI;

import static com.google.common.base.Charsets.UTF_8;

public class TextFile {

    private final BinaryFile binaryFile;

	public TextFile(URI uri, boolean cachingEnabled) {
        binaryFile = new BinaryFile(uri, cachingEnabled);
	}

	public TextFile(BinaryFile binaryFile) {
	    this.binaryFile = binaryFile;
    }
	
	public String readContentsAsString() {
        return new String(binaryFile.readContents(), UTF_8);
	}

    public String getPath() {
        return new File(binaryFile.getUri().getSchemeSpecificPart()).getPath();
    }
}
