package com.comin.syp.controller;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;




/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
/*	@Autowired GameServiceImpl gService;
	@Autowired PlayerServiceImpl pService;
	Gameinfo game_info = new Gameinfo();
	GameVO gvo = null;
	List<PlayerVO> list = null;
	ArrayList<GameVO> updateGvo = new ArrayList<GameVO>(); */

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	



	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("home", locale);

		return "home";
	}
	

	@RequestMapping(value = "/game", method = RequestMethod.GET)
	public String game(Locale locale, Model model) {
		logger.info("game", locale);

		return "game";
	}
	
	@RequestMapping(value = "/gamestart", method = RequestMethod.GET)
	public String start(Locale locale, Model model, HttpServletRequest request) {
		logger.info("gamestart", locale);
		return "gamestart";
	}

	@RequestMapping(value = "/howto", method = RequestMethod.GET)
	public String howto(Locale locale, Model model) {
		logger.info("howto", locale);

		return "howto";
	}
	
	@RequestMapping(value = "/ranking", method = RequestMethod.GET)
	public String ranking(Locale locale, Model model) {
		logger.info("ranking", locale);

		return "ranking";
	}
	
	@RequestMapping(value = "/record", method = RequestMethod.GET)
	public String record(Locale locale, Model model) {
		logger.info("record", locale);

		return "record";
	}

}
