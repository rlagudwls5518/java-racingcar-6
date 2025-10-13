package racingcar;


public class Car {
    private String name;
    private int position = 0;

    public Car(String name){
        validateName(name);
        this.name = name;
    }
    public void move(){
        position++;
    }
    public String getName(){
        return name;
    }
    public int getPosition(){
        return position;
    }


    private void validateName(String name){
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("이름은 null 또는 공백일 수 없습니다.");
        }
        if (name.trim().isEmpty()) {
            throw new IllegalArgumentException("이름은 공백만으로 구성될 수 없습니다.");
        }
        if (name.length() > 5) {
            throw new IllegalArgumentException("이름은 5자 이하만 가능합니다: " + name);
        }
    }

}
