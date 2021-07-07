package kr.ac.kopo.kopo01.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Sample {
	
	@Id
	@GeneratedValue
	@Column
	private Long id;
	
	@Column
	private String title;	
	
	public Sample() {
		
	}
	
	public Sample(Long id) {
		this.id = id;
	}

	public Sample(Long id, String title) {
		this.id = id;
		this.title = title;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}	
}
