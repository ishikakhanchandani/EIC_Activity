public class Square extends Shape{

@Override
public double calculateArea(){
    return Math.pow(getValue(), 2);
}

}