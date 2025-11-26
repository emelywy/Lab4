package org.example.colproj.labs.lab4;

public class AbstractRoom implements Room {

    private long id; //індифікатор
    private String name; //назва номера
    private int rooms; //кількість номерів
    private double price; //ціна

    public AbstractRoom(Long id, String name, int rooms, double price) { //конструктор
        this.id = id;
        this.name = name;
        this.rooms = rooms;
        this.price = price;
    }

    @Override
    public Long getId() { //повертає індифікатор
        return id; }

    @Override
    public String getName() { //повертає назву
        return name; }

    @Override
    public int getRooms() { //повертає кількість номерів
        return rooms; }

    @Override
    public double getPrice() { //повертає ціну
        return price; }

    @Override
    public String toString() { //повертає повну інформацію про номер
        return "[" + id + "] " + name + " (" + rooms + " місць, " + price + " грн/доба)";
    }
}
