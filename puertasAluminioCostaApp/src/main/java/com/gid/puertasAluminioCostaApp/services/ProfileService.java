package com.gid.puertasAluminioCostaApp.services;

import com.gid.puertasAluminioCostaApp.entities.Profile;
import com.gid.puertasAluminioCostaApp.repositories.IProfileRepository;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.sql.Date;
import java.util.Optional;

@Service
public class ProfileService {

    private final IProfileRepository profileRepository;

    public ProfileService(IProfileRepository profileRepository) {
        this.profileRepository = profileRepository;
    }

    public Optional<Profile> selectProfile(String id){
        return this.profileRepository.findById(id);
    }

    public void insertProfile(Profile profile){
        this.profileRepository.save(profile);
    }

    public void updateProfile(String id, Profile profile){

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

    public void deleteProfile(String id){
        this.profileRepository.deleteById(id);
    }


}
