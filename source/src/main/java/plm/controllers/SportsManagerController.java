package plm.controllers;

import java.util.Collection;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import plm.beans.SportsManager;
import plm.common.beans.ResultBean;
import plm.services.SportsManagerService;


@RequestMapping("/user")
@RestController
public class SportsManagerController {
	private final SportsManagerService sm;
	public SportsManagerController(SportsManagerService sm) {
		this.sm = sm;
	}
	
	@GetMapping("/all")
	public ResultBean<Collection<SportsManager>> getAll() {
		return new ResultBean<Collection<SportsManager>>(sm.getAll());
	}
}
