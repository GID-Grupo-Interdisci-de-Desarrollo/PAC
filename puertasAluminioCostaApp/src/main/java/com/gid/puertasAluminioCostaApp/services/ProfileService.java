package com.gid.puertasAluminioCostaApp.services;

import com.gid.puertasAluminioCostaApp.entities.Profile;
import com.gid.puertasAluminioCostaApp.repositories.IProfileRepository;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Optional;

@Service
public class ProfileService {

    // There's declaring the profile repository
    private final IProfileRepository profileRepository;

    // There's initializing the profile repository
    public ProfileService(IProfileRepository profileRepository) {
        this.profileRepository = profileRepository;
    }

    // This method returns a profile arrayList
    public ArrayList<Profile> selectProfiles(){
        return (ArrayList<Profile>) this.profileRepository.findAll();
    }

    // This method may return a profile by id
    public Optional<Profile> selectProfile(long id){
        return this.profileRepository.findById(id);
    }

    // This method creates a new profile
    public void insertProfile(Profile profile){
        this.profileRepository.save(profile);
    }

    // This method update the name of a profile by id
    public void updateProfile(long id, Profile profile){

        Profile myProfile = this.profileRepository.findById(id).get();

        boolean updated = false;
        if(StringUtils.hasLength(profile.getImage())){
            myProfile.setImage(profile.getImage());
            myProfile.setUpdatedAt(new Date(System.currentTimeMillis()));
            updated = true;
        }
        if(StringUtils.hasLength(profile.getPhone())){
            myProfile.setPhone(profile.getPhone());
            myProfile.setUpdatedAt(new Date(System.currentTimeMillis()));
            updated = true;
        }

        if(updated){
            this.profileRepository.save(myProfile);
        }

    }

    // This method deletes an employee by id
    public void deleteProfile(long id){
        this.profileRepository.deleteById(id);
    }


}
