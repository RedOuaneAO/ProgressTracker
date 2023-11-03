package services;

import repositories.UserRepo;

public class UserService {
    private UserRepo userRepo;
    public UserService(UserRepo userRepo) {
        this.userRepo = userRepo;
    }
}
