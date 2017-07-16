package my.tutorials.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("user")
public class UserController {
	
	/**
	 * Static list of users to simulate Database
	 */
	private static List<User> userList = new ArrayList<User>();

	//Initialize the list with some data for index screen
	static {
		userList.add(new User("Bill", "Gates"));
		userList.add(new User("Steve", "Jobs"));
		userList.add(new User("Larry", "Page"));
		userList.add(new User("Sergey", "Brin"));
		userList.add(new User("Larry", "Ellison"));
	}

	/**
	 * Saves the static list of users in model and renders it 
	 * via freemarker template.
	 * 
	 * @param model 
	 * @return The index view (FTL)
	 */
	@RequestMapping(value = "list", method = RequestMethod.GET)
	public ModelAndView list() {
		ModelAndView modelAndView = new ModelAndView();

		modelAndView.addObject("userList", userList);
		
		modelAndView.setViewName("user");
		return modelAndView;
	}

	/**
	 * Add a new user into static user lists and display the 
	 * same into FTL via redirect 
	 * 
	 * @param user
	 * @return Redirect to /index page to display user list
	 */
	@RequestMapping(value = "add", method = RequestMethod.POST)
	public ModelAndView add(@ModelAttribute("user") User user) {
		ModelAndView modelAndView = new ModelAndView();
		if (null != user && null != user.getFirstname()
				&& null != user.getLastname() && !user.getFirstname().isEmpty()
				&& !user.getLastname().isEmpty()) {

			synchronized (userList) {
				userList.add(user);
			}

		}

		modelAndView.setViewName("redirect:list");
		return modelAndView;
	}

}
