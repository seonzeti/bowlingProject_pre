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

import com.comin.syp.calculator.Gameinfo;
import com.comin.syp.service.GameServiceImpl;
import com.comin.syp.vo.GameVO;
import com.comin.syp.vo.PlayerVO;


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
	ArrayList<GameVO> updateGvo = new ArrayList<GameVO>();
*/
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	


/*	@RequestMapping(value = "/", method = RequestMethod.GET)	
	public String main(Model model) {
		
		
		List<GameVO> game_list = null;							//모든 게임 정보 리스트
		ArrayList<GameVO> gameStatus = new ArrayList<GameVO>();	//진행중인 게임 정보 리스트
		ArrayList<GameVO> gameover = new ArrayList<GameVO>();	//종료한 게임 정보 리스트
		
		try {
			game_list = gService.gameList();	//DB에 저장된 모든 게임 정보를 조회 
		} catch (Exception e) {
			System.out.println("main() DB Connect Error!");
		}
		
		for (GameVO gameVO : game_list) {
			if(gameVO.isGameStatus() == true) {
				gameStatus.add(gameVO);	
				//진행중인 게임 정보를 리스트에 추가
				
			} else {
				gameover.add(gameVO);		//종료한 게임 정보를 리스트에 추가
			}
		}
		
		model.addAttribute("game", game_list);
		model.addAttribute("gameStatus", gameStatus);
		model.addAttribute("gameover", gameover);
		
		return "home";		
		
		
	}*/
	
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
	
	@RequestMapping(value = "/gamestart", method = RequestMethod.POST)
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
