package ru.skypro;

import metod_class_1.Book;

public class Main {

    public static void main(String[] args) {
        Book.titleBook = "Garry Potter";
        Book.yearRelease = 2005;
        System.out.println("garryPotter.titleBook = " + Book.titleBook);
        System.out.println("garryPotter.yearRelease = " + Book.yearRelease);

    }
}
