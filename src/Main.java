public class Main {
    public static void main(String[] args) {
        Car car = new Car("polo", 2019, 850000, "brown", 1.6, 5);
        Car car2 = new Car("jetta", 2017, 1000000, "silver", 1.8, 6);
        car.getinfo();
        car2.getinfo();
        System.out.println("Приветствую вас на гонках двух машин: polo и jetta!!!");
        System.out.println("---------------------------------------------------");
        races(1000, car, car2);


    }

    static void races(int dist, Car car, Car car2) {
        int s = dist;
        int s2 = dist;
        int count = 0;
        int count2 = 0;
        if (car.queue() == 0) {
            while (s >= 0 & s2 >= 0) {
                s = s - car.speed();
                count += 1;
                s2 = s2 - car2.speed();
                count2 += 1;

            }
            if (s > s2) {
                System.out.println("Победу одержала машина" + " " + car2.model + "," + " " + "Расстояние пройдено за"
                        + " " + count + " " + "секунд");

            } else {
                System.out.println("Победу одержала машина" + " " + car.model + "," + " " + "Расстояние пройдено за"
                        + " " + count2 + " " + "секунд");

            }
        }else {
            while (s >= 0 & s2 >= 0) {
                s2 = s2 - car.speed();
                count += 1;
                s = s - car2.speed();
                count2 += 1;

            }
            if (s > s2) {
                System.out.println("Победу одержала машина" + " " + car2.model + "," + " " + "Расстояние пройдено за"
                        + " " + count + " " + "секунд");

            } else {
                System.out.println("Победу одержала машина" + " " + car.model + "," + " " + "Расстояние пройдено за"
                        + " " + count2 + " " + "секунд");

            }

        }

    }

}
