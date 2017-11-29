package com.kodilla.stream;


import com.kodilla.stream.array.ArrayOperations;
import com.kodilla.stream.forumUser.Forum;
import com.kodilla.stream.forumUser.ForumUser;

import java.time.LocalDate;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {

        Forum theForum = new Forum();
        Map<Integer, ForumUser> theResultMapOfUsers = theForum.getUserList().stream()
                .filter(forum -> forum.getSex() == 'M')
                .filter(forum -> forum.getBirthDate().isBefore(LocalDate.now().minusYears(20)))
                .filter(forum -> forum.getNumberOfposts() >= 1)
                .collect(Collectors.toMap(ForumUser::getUserID, forum -> forum));
        System.out.println("Number of elements in Map: " + theResultMapOfUsers.size());
        theResultMapOfUsers.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);

    }


}