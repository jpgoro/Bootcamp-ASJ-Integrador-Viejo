package com.bootcamp.backendSgc.models;

import java.time.LocalDateTime;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Table(name="indistries")
public class IndustryModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@NotNull(message = "The industry_name cannot be null")
	@Column(nullable = false)
	@NotBlank
	private String  industryName;
	@Column(name = "is_active")
	@NotNull(message = "The is_active cannot be null")
	private Boolean active;
	@Column(name = "created_at")
	@Temporal(TemporalType.TIMESTAMP)
	private LocalDateTime createdAt;

	@Column(name = "updated_at")
	@Temporal(TemporalType.TIMESTAMP)
	private LocalDateTime updatedAt;
	

	public IndustryModel() {
	}
	
	

	public IndustryModel(Integer id,String industryName, Boolean active,
			LocalDateTime createdAt, LocalDateTime updatedAt) {
		this.id = id;
		this.industryName = industryName;
		this.active = active;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}

	

	public Integer getId() {
		return id;
	}



	public String getIndustryName() {
		return industryName;
	}



	public Boolean getActive() {
		return active;
	}



	public LocalDateTime getCreatedAt() {
		return createdAt;
	}



	public LocalDateTime getUpdatedAt() {
		return updatedAt;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public void setIndustryName(String industryName) {
		this.industryName = industryName;
	}



	public void setActive(Boolean active) {
		this.active = active;
	}



	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}



	public void setUpdatedAt(LocalDateTime updatedAt) {
		this.updatedAt = updatedAt;
	}



	@Override
	public String toString() {
		return "IndustryModel [id=" + id + ", industryName=" + industryName + ", active=" + active + ", createdAt="
				+ createdAt + ", updatedAt=" + updatedAt + "]";
	}

	
	
}
