package ru.skypro;

import metod_class_1.Author;
import metod_class_1.Book;

public class Main {
    public static void main(String[] args) {
        Book vityMaleev1 = new Book("Витя Малеев в школе и дома", 1951, new Author("Николай ", "Носов"));
        Book vityMaleev2 = new  Book();
        vityMaleev2.setYearRelease(1950);
        System.out.println(vityMaleev2.toString());
        System.out.println(vityMaleev1.toString());
        System.out.println("Название книги: " + vityMaleev1.getTitleBook());
        System.out.println("Год издания: " + vityMaleev1.getYearRelease());
        System.out.println("Год издания: " + vityMaleev2.getYearRelease());
        System.out.println("Автор: " + vityMaleev1.author.getAutorfirstName() + vityMaleev1.author.getAutorlastName());

    }
}
