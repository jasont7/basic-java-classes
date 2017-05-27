import acm.graphics.*;

public class GFace extends GCompound {

	public static final double EYE_WIDTH = 0.15;
	public static final double EYE_HEIGHT = 0.15;
	public static final double NOSE_WIDTH = 0.15;
	public static final double NOSE_HEIGHT = 0.10;
	public static final double MOUTH_WIDTH = 0.50;
	public static final double MOUTH_HEIGHT = 0.03;
	
	private GOval head;
	private GOval leftEye, rightEye;
	private GPolygon nose;
	private GRect mouth;
	
	public GFace(double width, double height)
	{
		head = new GOval(width, height);
		leftEye = new GOval(EYE_WIDTH * width, EYE_HEIGHT * height);
		rightEye = new GOval(EYE_WIDTH * width, EYE_HEIGHT * height);
		nose = createNose(NOSE_WIDTH * width, NOSE_HEIGHT * height);
		mouth = new GRect(MOUTH_WIDTH * width, MOUTH_HEIGHT * height);
		
		add(head, 0, 0);
		
		add(leftEye, (0.25 * width) - (EYE_WIDTH * width) / 2, 
				(0.25 * height) - (EYE_HEIGHT * height / 2));
		
		add(rightEye, (0.75 * width) - (EYE_WIDTH * width) / 2, 
				(0.25 * height) - (EYE_HEIGHT * height / 2));
		
		add(nose, 0.50 * width, 0.50 * height);
		
		add(mouth, (0.50 * width) - (MOUTH_WIDTH * width) / 2, 
				(0.75 * height) - (MOUTH_HEIGHT * height / 2));
	}

	private GPolygon createNose(double width, double height) 
	{
		GPolygon poly = new GPolygon();
		
		poly.addVertex(0, -height / 2);
		poly.addVertex(width / 2, height / 2);
		poly.addVertex(-width / 2, height / 2);
		
		return poly;
	}
	
}