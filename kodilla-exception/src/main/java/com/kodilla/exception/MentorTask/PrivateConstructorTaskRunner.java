package com.kodilla.exception.MentorTask;

public class PrivateConstructorTaskRunner {

    public static void main(String[] args) {
        //Konstruktor jest prywatny, dlatego nie można bezpośrednio utworzyć obiektu.
        //Tworzona jest metoda statyczna, accessToObject(liczba kół), która zwraca obiekt
        //Pole statyczne task jest utworzone, po to, żeby chociaż są różne nazwy obiektów i
        //inne liczby kół, to chcemy, żeby obiekt był ciągle taki sam, tylko powielany
        //jest to przypisanie...?
        PrivateConstructorTask mentorTask=PrivateConstructorTask.accessToObject(3);
        System.out.println(mentorTask.getNumbersOfWheels());

        PrivateConstructorTask mentorTask2=PrivateConstructorTask.accessToObject(2);
        System.out.println(mentorTask2.getNumbersOfWheels());

        PrivateConstructorTask mentorTask3=PrivateConstructorTask.accessToObject(4);
        System.out.println(mentorTask3.getNumbersOfWheels());

    }
}
