package com.kodilla.good.patterns.challenges.order;

public class MailService implements InformationService {
    public void inform(User user) {
        System.out.println(user.getName() + " your order succeed!");
    }
}
