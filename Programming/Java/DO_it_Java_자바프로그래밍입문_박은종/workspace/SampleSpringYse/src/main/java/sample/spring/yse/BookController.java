package sample.spring.yse;

import org.springframework.stereotype.Controller;

@Controller
public class BookController {

	@RequestMapping(value="/create", method = RequestMethod.GET)
	public ModelAndView create() {
	    return new ModelAndView("book/create");
	}
}
