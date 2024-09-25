package com.example.vehicle_insurance.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.vehicle_insurance.Bean.UserDetails;
import com.example.vehicle_insurance.Bean.UserVehicleDetails;
import com.example.vehicle_insurance.repository.UserDetailsRepository;
import com.example.vehicle_insurance.repository.UserVehicleDetailsRepository;

@Service
public class UserService {

 @Autowired
     private UserDetailsRepository userDetailsRepository;
	 
	public String AddUser_details(UserDetails addUser) {
		// TODO Auto-generated method stub
		userDetailsRepository.save(addUser);
		return "successfully added";
	}

	public List<UserDetails> GetUser_details() {
		// TODO Auto-generated method stub
		return userDetailsRepository.findAll();
	}

	public Optional<UserDetails> GetUserById(Long id) {
		// TODO Auto-generated method stub
		return userDetailsRepository.findById(id);
	}

	public String deleteUserById(Long id) {
		// TODO Auto-generated method stub
		if(userDetailsRepository.existsById(id)) {
			userDetailsRepository.deleteById(id);
			return "deleted";
		}
		return "not deleted";
		
	}
	public String updateUser(Long id, UserDetails updatedUser) {
	    Optional<UserDetails> existingUser = userDetailsRepository.findById(id);
	    
	    if (existingUser.isPresent()) {
	        UserDetails user = existingUser.get(); 
	        user.setName(updatedUser.getName());
	        user.setPhoneNumber(updatedUser.getPhoneNumber());
	        user.setEmail(updatedUser.getEmail());
	        user.setAddress(updatedUser.getAddress());
	        // Update other fields as necessary

	        userDetailsRepository.save(user); // Save the updated user back to the database
	        return "User updated successfully!";
	    } else {
	        return "User not found!";
	    }
	}
}
