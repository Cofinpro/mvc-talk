package de.entwicklertag.mvc;

import javax.inject.Inject;
import javax.mvc.Models;
import javax.mvc.annotation.Controller;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

/**
 * @author Gregor Tudan, Cofinpro AG
 */
@Path("/")
@Controller
public class GreetingController {

    @Inject
    private Models models;

    @GET
    public String greeting(@QueryParam("name") String name) {
        models.put("name", name);
        return "hello.html";
    }
}
