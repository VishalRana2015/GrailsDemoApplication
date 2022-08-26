package org.example

import grails.converters.JSON
import groovy.json.JsonGenerator
import groovy.json.JsonOutput

class DemoController {
    // index() method will be invoked if you invoke /demo

    /*
    session - The session allows associating state with a given user and typically uses cookies to associate a session with a client. The session object is an instance of HttpSession
    request - The request object allows the storage of objects for the current request only. The request object is an instance of HttpServletRequest ( immutable same as we used to have in HttpServletContext)
    params - Mutable map of incoming request query string or POST parameters
    flash -
     */
   // static defaultAction = "index"
    def index() {
        List<Number> list = [1,2]
        def map = [:]
        map.put("key" , "value")
        JsonGenerator generator = new JsonGenerator.Options().build(); // you can pass here additional options, that will determine how different data types should be parsed into json, for example date format.
        //JsonOutput.toJson()
        render generator.toJson(map);
    }
}
