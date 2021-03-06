/*
 * Copyright 2017 pragmatic-scala.reactiveplatform.xyz
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

package chapter7

object HumanWithListen extends App {
  // #snip
  class Human(val name: String) {
    def listen(): Unit = println(s"Your friend $name is listening")
  }

  class Man(override val name: String) extends Human(name)
  class Woman(override val name: String) extends Human(name)
  // #snip

  println(new Man("John").getClass)
  println(new Woman("Sara").getClass)

}
