package controllers;

import model.FormData;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.*;

public class Application extends Controller {

	public static Result index() {
		return ok(index.render());
	}

	public static Result process() {

		Form<FormData> form = form(FormData.class).bindFromRequest();

		if (form.hasErrors()) {
			return badRequest("authenticity validation FAILED. This request was forged.");
		} else {
			return ok("authenticity validation PASSED. Now hit the Back button and submit the form again.");
		}
	}

}