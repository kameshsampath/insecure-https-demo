/*
 * Copyright 2017 Kamesh Sampath<kamesh.sampath@hotmail.com>
 *
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

package demo;

import lombok.extern.slf4j.Slf4j;
import org.apache.camel.BeanInject;
import org.apache.camel.builder.RouteBuilder;

/**
 * @author kameshs
 */
@Slf4j
public class SecuredCalculatorRouteBuilder extends RouteBuilder {

    @BeanInject
    CalculatorProcessor calculatorProcessor;

    @Override
    public void configure() throws Exception {

        from("timer://calculator?fixedRate=true&period=10s")
            .to("insecurehttps4://localhost:8443/api/calculator/sub/1/2")
            .log("${body}");
    }
}
