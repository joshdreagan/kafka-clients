/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.examples;

import org.apache.camel.ExchangePattern;
import org.apache.camel.LoggingLevel;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class CamelRouteConfiguration extends RouteBuilder {
  
  @Override
  public void configure() {
    
    from("stream:in?promptMessage=RAW(> )&initialPromptDelay=0")
      .filter(simple("${body} == ${null} || ${body} == ''"))
        .stop()
      .end()
      .log(LoggingLevel.DEBUG, log, "Sending message: ${body}")
      .to(ExchangePattern.InOnly, "kafka://{{kafka.destination.name}}")
    ;
  }
}
