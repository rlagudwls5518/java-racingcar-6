package racingcar;

public class View {
    Car car;

    public void printName(){
        System.out.print(car.getName());
    }

    public void printPosition(){
        for(int i=0; i< car.getPosition(); i++){
            System.out.print("-");
        }
        System.out.println();
    }

    public static void PrintGame(String[] carName,Car[] car){
        System.out.print("최종 우승자 : ");
        int max = 0;
        for(int i=0; i< carName.length; i++){
            if(max < car[i].getPosition()){
                max = car[i].getPosition();
            }
        }
        boolean first = true;

        for(int i=0; i< carName.length; i++){
            if(max == car[i].getPosition()){
                if (!first) {
                    System.out.print(", ");
                }
                car[i].printName();
                first = false;
            }
        }
    }
}
