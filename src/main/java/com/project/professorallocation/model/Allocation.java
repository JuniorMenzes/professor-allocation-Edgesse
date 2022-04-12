package com.project.professorallocation.model;

import java.time.DayOfWeek;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "allocation")
public class Allocation {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id; 
		@Enumerated(EnumType.STRING)
		@Column(nullable = false, name = "day")
		private DayOfWeek dayofweek;
		
		@Temporal(TemporalType.TIME)
		@Column(nullable = false)
		private Date starHour; 
		
		
		@Temporal(TemporalType.TIME)
		@Column(nullable = false)
		private Date endHour;
		
		private Long professorId;
		
		private Long courseId;
		
		public Allocation() {
			super();
		}
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public DayOfWeek getDayofweek() {
			return dayofweek;
		}
		public void setDayofweek(DayOfWeek dayofweek) {
			this.dayofweek = dayofweek;
		}
		public Date getStarHour() {
			return starHour;
		}
		public void setStarHour(Date starHour) {
			this.starHour = starHour;
		}
		public Date getEndHour() {
			return endHour;
		}
		public void setEndHour(Date endHour) {
			this.endHour = endHour;
		}
		public Long getProfessorId() {
			return professorId;
		}
		public void setProfessorId(Long professorId) {
			this.professorId = professorId;
		}
		public Long getCourseId() {
			return courseId;
		}
		public void setCourseId(Long courseId) {
			this.courseId = courseId;
		}
		@Override
		public String toString() {
			return "Allocation [id=" + id + ", dayofweek=" + dayofweek + ", starHour=" + starHour + ", endHour="
					+ endHour + ", professorId=" + professorId + ", courseId=" + courseId + "]";
		}
		
		
		
}
