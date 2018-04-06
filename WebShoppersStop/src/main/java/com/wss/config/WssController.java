package com.wss.config;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class WssController {
	
	@RequestMapping(value="/")
	public String showIndex(Model model) {
		System.out.println("Inside showIndex()");
		return "index";
	}
	
	@RequestMapping(value="/hotels.html", method=RequestMethod.GET)
	public String showHotels(Model model) {
		return "hotels";
	}
	
	@RequestMapping(value="/about.html", method=RequestMethod.GET)
	public String showAbout(Model model) {
		return "about";
	}
	
	@RequestMapping(value="/blog.html", method=RequestMethod.GET)
	public String showBlog(Model model) {
		return "blog";
	}
	
	@RequestMapping(value="/p-single.html", method=RequestMethod.GET)
	public String showPSingle(Model model) {
		return "p-single";
	}
	
	@RequestMapping(value="/products.html", method=RequestMethod.GET)
	public String showProducts(Model model) {
		return "products";
	}

	@RequestMapping(value="/privacy.html", method=RequestMethod.GET)
	public String showPrivacy(Model model) {
		return "privacy";
	}
	@RequestMapping(value="/signup.html", method=RequestMethod.GET)
	public String showSignup(Model model) {
		return "signup";
	}
	@RequestMapping(value="/single.html", method=RequestMethod.GET)
	public String showSingle(Model model) {
		return "single";
	}
	@RequestMapping(value="/terms.html", method=RequestMethod.GET)
	public String showTerms(Model model) {
		return "terms";
	}

	@RequestMapping(value="/trains.html", method=RequestMethod.GET)
	public String showTrains(Model model) {
		return "trains";
	}

	@RequestMapping(value="/weekend.html", method=RequestMethod.GET)
	public String showWeekend(Model model) {
		return "weekend";
	}
	
	@RequestMapping(value="/booking.html", method=RequestMethod.GET)
	public String showBooking(Model model) {
		return "booking";
	}
	
	@RequestMapping(value="/contact.html", method=RequestMethod.GET)
	public String showContact(Model model) {
		return "contact";
	}
	
	@RequestMapping(value="/deals.html", method=RequestMethod.GET)
	public String showDeals(Model model) {
		return "deals";
	}

	@RequestMapping(value="/faqs.html", method=RequestMethod.GET)
	public String showFaqs(Model model) {
		return "faqs";
	}
	
	@RequestMapping(value="/flights-hotels.html", method=RequestMethod.GET)
	public String showFlightsHotels(Model model) {
		return "flights-hotels";
	}
	
	@RequestMapping(value="/holidays.html", method=RequestMethod.GET)
	public String showHolidays(Model model) {
		return "holidays";
	}
	
	@RequestMapping(value="/index.html", method=RequestMethod.GET)
	public String showFlights(Model model) {
		return "index";
	}
	
	@RequestMapping(value="/bus.html", method=RequestMethod.GET)
	public String showBus(Model model) {
		return "bus";
	}
	
	@RequestMapping(value="/new.htm", method=RequestMethod.GET)
	public String showNew(Model model) {
		return "new";
	}
	
}
