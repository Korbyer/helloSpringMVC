package kr.ac.hansung.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import kr.ac.hansung.model.Lectures;

public class LectureMapper implements RowMapper<Lectures>{

	public Lectures mapRow(ResultSet rs, int rowNum) throws SQLException {
		Lectures lectures = new Lectures();
		lectures.setYear(rs.getInt("year"));
		lectures.setSemester(rs.getInt("semester"));
		lectures.setLecturecode(rs.getString("lecturecode"));
		lectures.setLecturename(rs.getString("lecturename"));
		lectures.setLecturekind(rs.getString("lecturekind"));
		lectures.setCredits(rs.getInt("credits"));
		return lectures;
	}

}


