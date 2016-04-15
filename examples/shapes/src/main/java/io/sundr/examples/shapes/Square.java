/*
 * Copyright 2015 The original authors.
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package io.sundr.examples.shapes;

import io.sundr.builder.annotations.Buildable;
import io.sundr.builder.annotations.Inline;

@Buildable(inline = {
        @Inline(type = Createable.class, value = "create", prefix = "Createable"),
        @Inline(type = Updateable.class, value = "update", prefix = "Updateable"),
})
public class Square extends AbstractShape implements Rectangle {

    private final int height;

    public Square(int x, int y, int height) {
        super(x, y);
        this.height = height;
    }

    @Override
    public int getWidth() {
        return height;
    }

    @Override
    public int getHeight() {
        return height;
    }

}
