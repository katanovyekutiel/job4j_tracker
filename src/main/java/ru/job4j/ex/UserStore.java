//package ru.job4j.ex;
//
//public class UserStore {
//
//    public static User findUser(User[] users, String login) throws UserNotFoundException {
//        for (int i = 0; i < users.length; i++) {
//          if () {
//              throw new UserNotFoundException("User not found.");
//          }
//        }
//        return null;
//    }
//
//    public static boolean validate(User user) throws UserInvalidException {
//        if (user == false) {
//            throw new UserInvalidException("User not valid");
//        }
//        return false;
//    }
//
//    public static void main(String[] args) {
//        User[] users = {
//                new User("Petr Arsentev", true)
//        };
//        User user = null;
//        try {
//            user = findUser(users, "Petr Arsentev");
//        } catch (UserNotFoundException ea) {
//            ea.printStackTrace();
//        }
//        try {
//            if (validate(user)) {
//                System.out.println("This user has an access");
//            }
//        } catch (UserInvalidException e) {
//            e.printStackTrace();
//        }
//    }
//
//}
