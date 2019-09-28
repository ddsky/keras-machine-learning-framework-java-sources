/**
 * Just a hello world class.
 *
 * @author Björn Hempel <bjoern@hempel.li>
 * @version 1.0 (2019.09.28)
 * @web: https://github.com/bjoern-hempel/machine-learning-keras-suite
 *
 * LICENSE
 *
 * MIT License
 *
 * Copyright (c) 2019 Björn Hempel <bjoern@hempel.li>
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package de.ixno.kmls.start;

import org.jetbrains.annotations.NotNull;

public class Hello {
    public static void main(@NotNull String [] args) {
        if (args.length > 0) {
            System.out.println(String.format("Hello world! Your name is %s.", args[0]));
        } else {
            System.out.println(String.format("Hello world!"));
        }
    }
}
