/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2017-2019 Yegor Bugayenko
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included
 * in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NON-INFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package org.jpeek.graph;

import com.jcabi.xml.XML;
import java.io.IOException;
import org.cactoos.Text;
import org.cactoos.text.Joined;

/**
 * Serialize method arguments to a string.
 *
 * @since 1.0
 * @todo #440:30min This class XmlMethodArgs should be made public
 *  and a test class named XmlMethodArgsTest should be added to
 *  verify its behaviour.
 */
final class XmlMethodArgs implements Text {

    /**
     * XML Method.
     */
    private final XML method;

    /**
     * Ctor.
     *
     * @param method Method as XML
     */
    XmlMethodArgs(final XML method) {
        this.method = method;
    }

    @Override
    public String asString() throws IOException {
        return new Joined(":", this.method.xpath("args/arg/@type")).asString();
    }
}