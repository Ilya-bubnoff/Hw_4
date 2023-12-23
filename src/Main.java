
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
int age = 30;
if(age>=18){
    System.out.println("Если возраст человека равен "+age+", то он совершеннолетний");
} else {
    System.out.println("Если возраст человека равен "+age+", то он не достиг совершеннолетия, нужно немного подождать");
}
int airTemperature = 6;
if(airTemperature>5){
    System.out.println("На улице "+airTemperature+" градусов, можно идти без шапки");
} else{
    System.out.println("На улице "+airTemperature+" градусов, нужно надеть шапку");
}
int speed = 50;
if(speed>60){
    System.out.println("Если скорость "+speed+" , то придётся заплатить штраф");
}else{
    System.out.println("Если скорость "+speed+" , можно ездить спокойно");
}
int personisAge = 4;
if (personisAge>=2 && personisAge<=6){
    System.out.println("Если возраст человека равен "+personisAge+" , то ему нужно ходить в детский сад");
}
if (personisAge>6 && personisAge<=17){
    System.out.println("Если возраст человека равен "+personisAge+" , то ему нужно ходить в школу");
}
if (personisAge>17 && personisAge<=24){
            System.out.println("Если возраст человека равен "+personisAge+" , то ему нужно ходить в университет");
        }
if (personisAge>24){
            System.out.println("Если возраст человека равен "+personisAge+" , то ему нужно ходить на работу");
        }
int childisAge = 12;
if(childisAge<=5){
    System.out.println("Если возраст ребёнка равен "+childisAge+" , то ему нельзя кататься на аттракционе");
}
if(childisAge>5 && childisAge<=14){
    System.out.println("Если возраст ребёнка равен "+childisAge+" , то можно кататься на аттракционе в сопровождении взрослого");
}
if(childisAge>14){
            System.out.println("Если возраст ребёнка равен "+childisAge+" , то можно кататься на аттракционе без сопровождения взрослого");
    }
int places = 51;
if(places<=60){
    System.out.println("В вагоне есть сидячие места");
}
else if(places>60&&places<=102){
    System.out.println("В вагоне есть стоячие места");

}
else{
    System.out.println("В вагоне нет мест");
}
int one = 3;
int two = 2;
int three = 1;
if(one>two && one>three){
    System.out.println("Число one больше two и three");
}else if (two>one && two>three){
    System.out.println("Число two больше one и three");
}else{
    System.out.println("Число three больше one и two");
}
}
}