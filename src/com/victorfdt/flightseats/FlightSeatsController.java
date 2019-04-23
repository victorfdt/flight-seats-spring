package com.victorfdt.flightseats;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.victorfdt.logwriter.TestLogWriter;

@Controller
public class FlightSeatsController {

	private FlightSeats flightSeats = new FlightSeatsOriginal();

	@Autowired
	private TestLogWriter testLogWriter;

	@RequestMapping("/")
	public String index() {
		return "index";
	}

	@RequestMapping("/showForm")
	public String showForm(Model model) {

		model.addAttribute("flightSeatsForm", new FlightSeatsForm());
		return "flight-seats-form";

	}

	@RequestMapping("/processForm")
	public String processForm(@Valid @ModelAttribute FlightSeatsForm flightSeatsForm, BindingResult bindingResult,
			Model model) {

		if (bindingResult.hasErrors()) {
			return "flight-seats-form";
		} else {
			int result = flightSeats.qtdThreePeopleFamily(flightSeatsForm.getQtdRows(),
					flightSeatsForm.getOccupiedSeats());

			model.addAttribute("result", result);
			return "flight-seats-result";
		}
	}

	@RequestMapping("/viewLog")
	public String viewLog(Model model) {

		model.addAttribute("log", testLogWriter.getLogContent());
		
		System.out.println(testLogWriter.getLogContent());
		return "view-log";
	}

}
