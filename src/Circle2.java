
public class Circle2 implements GeometryConstant, GeometryMethod {

	@Override
	public double calArea(double radius) {
		// TODO Auto-generated method stub
		return (PI*radius*radius);
	}

	@Override
	public double calCircumference(double radius) {
		// TODO Auto-generated method stub
		return (2*PI*radius);
	}

}
