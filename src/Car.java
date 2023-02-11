import java.util.ArrayList;
import java.util.Random;


/**
 * Доработайте программу в свободном стиле.
 * Можно сравнить 2 автомобиля между собой
 * Или пусть авто заедет за фруктами :-)
 * Добавьте несколько произвольных методов и свойств
 * <br>
 * ДОП: Сделать гонки:
 * - задаём растояние
 * - едут до финиша.
 * Сказать кто победит.
 */

public class Car {
    Random random = new Random();
    String model;
    int year;
    double price;
    String color;
    double power;
    double bodyVolume;
    boolean status;


    Car(String model, int year, double price, String color, double power, double bodyVolume) {
        this.model = model;
        this.year = year;
        this.price = price;
        this.color = color;
        this.power = power;
        this.bodyVolume = bodyVolume;
        this.status = false;

    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }
        if (!(obj instanceof Car)) {
            return false;
        }
        Car car = (Car) obj; // Явное преобразование obj в класс Car
        if (model.equals(car.model) && year == car.year && power == car.power){
            return true;
        } else {
            return false;
        }
    }

    public void getinfo(){
        System.out.println(model + " " + year + " " + price + " " + color + " " + power + " " + bodyVolume);

    }
    public void powerCar(){
        status = true;
        System.out.println("Автомобиль заведен");
    }
    public void  stopCar(){
        status = false;
        System.out.println("Автомобиль выключен");
    }
    public void rowd(String adress){
        if (status) {
            System.out.println("Автомобиль едит по адрессу" + " " + adress);
        }else {
            System.out.println("Автомобтль не может ехать, выключен двигатель!");
        }
    }
    public int speed(){
        return (int) ((Math.random() * (50 - 10)) + 10);
    } // Скорость (метров за 1 секунду)
    public int queue(){
        return random.nextInt(2);
    }
}
