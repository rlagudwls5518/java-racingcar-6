package racingcar;

public class View {
    Car car;

    public static void printRoundResult(Car[] cars){
        for(Car car : cars){
            System.out.print(car.getName()+" : ");
            for(int i=0; i< car.getPosition(); i++){
                System.out.print("-");
            }
            System.out.println();
        }
    }
    public static void PrintResult(Car[] cars){

        System.out.print("최종 우승자 : ");
        int max = 0;
        for(int i=0; i< cars.length; i++){
            if(max < cars[i].getPosition()){
                max = cars[i].getPosition();
            }
        }
        boolean first = true;
        for(int i=0; i< cars.length; i++){
            if(max == cars[i].getPosition()){
                if (!first) {
                    System.out.print(", ");
                }
                System.out.print(cars[i].getName());
                first = false;
            }
        }
    }
}
