package kr.ac.hansung.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ac.hansung.dao.LectureDAO;
import kr.ac.hansung.model.Lectures;

@Service
public class LecturesService {
	private LectureDAO lectureDAO;
	
	@Autowired
	public void setLectureDAO(LectureDAO lectureDAO) {
		this.lectureDAO = lectureDAO;
	}
	
	public List<Lectures> getCurrent(){
		return lectureDAO.getLectures();
	}

	public void insert(Lectures lectures) {
		lectureDAO.insert(lectures);
		
	}
	
	
}
