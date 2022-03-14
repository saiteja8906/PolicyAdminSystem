package com.cts.policy.request;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import com.sun.istack.NotNull;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "request")

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ConsumerPolicyRequest {

	@NotNull
	@Id
	@Column(name = "ID")
	private Long consumerid;
	
	
}
