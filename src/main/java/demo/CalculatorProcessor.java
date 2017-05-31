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
import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import javax.servlet.http.HttpServletRequest;

/**
 * @author kameshs
 * TODO
 */
@Slf4j
public class CalculatorProcessor implements Processor {

    @Override
    public void process(Exchange exchange) throws Exception {

        HttpServletRequest request = exchange.getIn().getBody(HttpServletRequest.class);

        String n1 = request.getParameter("n1");
        String n2 = request.getParameter("n1");

        //exchange.getOut().setBody(String.format("<h1>Hello %s , Welcome to Jenkins and JBoss Fuse!", user));
    }
}
