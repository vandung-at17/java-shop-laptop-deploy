package com.devpro.entities;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BaseEntity {
	@Id // xác định đây là khoá chính.
	@GeneratedValue(strategy = GenerationType.IDENTITY) // auto-increment.
	@Column(name = "id")
	private Integer id; // primary-key

	@Column(name = "created_date", nullable = true)
	@CreatedDate
	private LocalDateTime createdDate;

	@Column(name = "updated_date", nullable = true)
	@LastModifiedDate
	private LocalDateTime updatedDate;

	@Column(name = "created_by", nullable = true)
	@CreatedBy
	private String createdBy;

	@Column(name = "updated_by", nullable = true)
	@LastModifiedBy
	private String updatedBy;

	@Column(name = "status", nullable = false)
	private boolean status;
}