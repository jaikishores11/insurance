package com.example.vehicle_insurance.Bean;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "user_details")
public class UserDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String phoneNumber;
    private String email;
    private String address;

//    @OneToOne(mappedBy = "userDetails")
//    private UserVehicleDetails userVehicleDetails;

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

//    public UserVehicleDetails getUserVehicleDetails() {
//        return userVehicleDetails;
//    }
//
//    public void setUserVehicleDetails(UserVehicleDetails userVehicleDetails) {
//        this.userVehicleDetails = userVehicleDetails;
//    }

//	public UserDetails(Long id, String name, String phoneNumber, String email, String address,
//			UserVehicleDetails userVehicleDetails) {
//		super();
//		this.id = id;
//		this.name = name;
//		this.phoneNumber = phoneNumber;
//		this.email = email;
//		this.address = address;
//		this.userVehicleDetails = userVehicleDetails;
//	}
	public UserDetails() {
		
	}

	@Override
	public String toString() {
		return "UserDetails [id=" + id + ", name=" + name + ", phoneNumber=" + phoneNumber + ", email=" + email
				+ ", address=" + address + "]";
	}

	public UserDetails(Long id, String name, String phoneNumber, String email, String address) {
		super();
		this.id = id;
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.address = address;
	}
	
    
}
