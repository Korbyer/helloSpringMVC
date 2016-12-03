package kr.ac.hansung.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.ac.hansung.model.Lectures;
import kr.ac.hansung.service.LecturesService;

@Controller
public class LecturesController {

	private LecturesService lecturesService;
	@Autowired
	public void setLecturesService(LecturesService lecturesService) {
		this.lecturesService = lecturesService;
	}

	@RequestMapping("/Lectures")
	public String showLectures(Model model){
		List<Lectures> lectures = lecturesService.getCurrent();
		model.addAttribute("lectures",lectures);
		return "Lectures";
	}
	
	@RequestMapping("/LecturesApply")
	public String showLecturesApply(Model model){
		return "LecturesApply";
	}
	
	@RequestMapping("/LecturesReferenceSemester")
	public String showLecturesReferenceSemester(Model model){
		return "LecturesReferenceSemester";
	}
	
	@RequestMapping("/LecturesReferenceKind")
	public String showLecturesReferenceKind(Model model){
		return "LecturesReferenceKind";
	}
	
	@RequestMapping("doapply")
	public String doapply(Model model, Lectures lectures){
		lecturesService.insert(lectures);
		return "LectureApplied";
	}

}
