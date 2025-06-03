package com.example.travel.travel.models;

import java.util.Date;
	import org.springframework.format.annotation.DateTimeFormat;
	import jakarta.persistence.Column;
	import jakarta.persistence.Entity;
	import jakarta.persistence.GeneratedValue;
	import jakarta.persistence.GenerationType;
	import jakarta.persistence.Id;
	import jakarta.persistence.PrePersist;
	import jakarta.persistence.PreUpdate;
	import jakarta.persistence.Table;
	import jakarta.validation.constraints.Max;
	import jakarta.validation.constraints.Min;
	import jakarta.validation.constraints.NotBlank;
	import jakarta.validation.constraints.NotNull;
	import jakarta.validation.constraints.Size;

	@Entity
	@Table(name="travels")
	public class Travel {
		    @Id
		    @GeneratedValue(strategy = GenerationType.IDENTITY)
		    private Long id;
		    
		    @NotNull
		    @NotBlank(message = "expenseName is required.")
		    @Size(min = 5, max = 200)
		    private String expenseName;
		    
		    @NotNull
		    @Size(min = 5, max = 200)
		    @NotBlank(message = "vendor is required.")
		    private String vendor;
		    
		    @NotNull(message = "Rating is required.")
		    @Min(value = 0, message = "amount must be at least 0.")
		    private Integer amount;
		    
		    @NotNull
		    @Size(min = 5)
		    @Column(columnDefinition="TEXT")
		    @NotBlank(message = "notes is required.")
		    private String description;
		    
		    @Column(updatable=false)
		    @DateTimeFormat(pattern="yyyy-MM-dd")
		    private Date createdAt;
		    @DateTimeFormat(pattern="yyyy-MM-dd")
		    private Date updatedAt;

		    public Travel() {
		    }
		    
		    public Travel(String expenseName, String vendor, Integer amount, String description) {
		    	this.expenseName = expenseName;
		    	this.vendor = vendor;
		    	this.amount = amount;
		    	this.description=description;
		    }
		    
		    public String getExpenseName() {
				return expenseName;
			}

			public void setExpenseName(String expenseName) {
				this.expenseName = expenseName;
			}

			public String getVendor() {
				return vendor;
			}

			public void setVendor(String vendor) {
				this.vendor = vendor;
			}

			public Integer getAmount() {
				return amount;
			}

			public void setAmount(Integer amount) {
				this.amount = amount;
			}

			public String getDescription() {
				return description;
			}

			public void setDescription(String description) {
				this.description = description;
			}

			public void setId(Long id) {
				this.id = id;
			}

			// other getters and setters removed for brevity
		    @PrePersist
		    protected void onCreate(){
		    	this.createdAt = new Date();
		    }
		    public Long getId() {
		    	return id;
		    } 
		    @PreUpdate
		    protected void onUpdate(){
		    	this.updatedAt = new Date();
		    }
        }