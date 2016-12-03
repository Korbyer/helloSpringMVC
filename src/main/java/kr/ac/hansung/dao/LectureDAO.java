package kr.ac.hansung.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import kr.ac.hansung.model.Lectures;

@Repository
public class LectureDAO {

	private JdbcTemplate jdbcTemplateObject;
	@Autowired
	public void setDataSource(DataSource dataSource){

		this.jdbcTemplateObject=new JdbcTemplate(dataSource);
		
	}
	public int getRowCount(){
		String sqlStatement = "select count(*) from lectures";
		return jdbcTemplateObject.queryForObject(sqlStatement, Integer.class);
		
	}
	public Lectures getLecture(String lecturename){
		String sqlStatement = "select * from lectures Where name=? ";
		return jdbcTemplateObject.queryForObject(sqlStatement, new Object[]{lecturename}, 
				new LectureMapper());
	}
	public List<Lectures> getLectures(){
		String sqlStatement = "select * from lectures";
		return jdbcTemplateObject.query(sqlStatement,new LectureMapper());
	}
	public boolean insert(Lectures lecture){
		int year=lecture.getYear();
		int semester = lecture.getSemester();
		String lecturename = lecture.getLecturename();
		String lecturecode = lecture.getLecturecode();
		String lecturekind = lecture.getLecturekind();
		int credits = lecture.getCredits();
		String sqlStatement = "insert into lectures (year, semester, lecturecode, lecturename, lecturekind, credits) values (?, ?, ?, ?, ?, ?)";
		return (jdbcTemplateObject.update(sqlStatement,new Object[]{year, semester, lecturecode, lecturename, lecturekind, credits} )==1);
	}
	public boolean update(Lectures lecture){
		int year=lecture.getYear();
		int semester = lecture.getSemester();
		String lecturename = lecture.getLecturename();
		String lecturecode = lecture.getLecturecode();
		String lecturekind = lecture.getLecturekind();
		int credits = lecture.getCredits();
		String sqlStatement = "update lectures set year=?, semester=?, lecturename=?, lecturekind=?, credits=? where lecturecode=?";
		return (jdbcTemplateObject.update(sqlStatement,new Object[]{year, semester, lecturename, lecturekind, credits, lecturecode} )==1);
	}
	
	public boolean delete(String lecturecode){
		String sqlStatement = "delete from lectures where lecturecode = ?";
		return (jdbcTemplateObject.update(sqlStatement, new Object[]{lecturecode})==1);
	}
	public int getCreditsFirst2012(){//2012��1�б� ������ȸ
		String sqlStatement = "select sum(credits) from lectures where year=2012 and semester=1";
		return jdbcTemplateObject.queryForObject(sqlStatement, Integer.class);
	}
	public int getCreditsSecond2012(){//2012��2�б� ������ȸ
		String sqlStatement = "select sum(credits) from lectures where year=2012 and semester=2";
		return jdbcTemplateObject.queryForObject(sqlStatement, Integer.class);
	}
	public int getCreditsFirst2015(){//2015��1�б� ������ȸ
		String sqlStatement = "select sum(credits) from lectures where year=2015 and semester=1";
		return jdbcTemplateObject.queryForObject(sqlStatement, Integer.class);
	}
	public int getCreditsSecond2015(){//2015��2�б� ������ȸ
		String sqlStatement = "select sum(credits) from lectures where year=2015 and semester=2";
		return jdbcTemplateObject.queryForObject(sqlStatement, Integer.class);
	}
	public int getCreditsFirst2016(){//2016��1�б� ������ȸ
		String sqlStatement = "select sum(credits) from lectures where year=2016 and semester=1";
		return jdbcTemplateObject.queryForObject(sqlStatement, Integer.class);
	}
	public int getCreditsMajorFirst(){//�������� ������ȸ
		String sqlStatement = "select sum(credits) from lectures where lecturekind=����";
		return jdbcTemplateObject.queryForObject(sqlStatement, Integer.class);
	}
	public int getCreditsMajorSecond(){//�������� ������ȸ
		String sqlStatement = "select sum(credits) from lectures where lecturekind=����";
		return jdbcTemplateObject.queryForObject(sqlStatement, Integer.class);
	}
	public int getCreditsGeneral(){//�������� ������ȸ
		String sqlStatement = "select sum(credits) from lectures where lecturekind=�ϱ�";
		return jdbcTemplateObject.queryForObject(sqlStatement, Integer.class);
	}
	public int getCreditsGeneralA(){//�ٱ�A ������ȸ
		String sqlStatement = "select sum(credits) from lectures where lecturekind=�ٱ�A";
		return jdbcTemplateObject.queryForObject(sqlStatement, Integer.class);
	}
	public int getCreditsGeneralB(){//�ٱ�B ������ȸ
		String sqlStatement = "select sum(credits) from lectures where lecturekind=�ٱ�B";
		return jdbcTemplateObject.queryForObject(sqlStatement, Integer.class);
	}
}

