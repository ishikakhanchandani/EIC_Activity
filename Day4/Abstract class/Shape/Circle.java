public class Circle extends Shape{

@Override
public double calculateArea(){
    return Math.PI * Math.pow(getValue(), 2);
}

}