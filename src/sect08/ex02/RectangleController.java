package sect08.ex02;

public class RectangleController {

	public double calculateArea(Rectangle r) {
		return r.getHeight() * r.getWidth();
	}

	public double calculatePerimeter(Rectangle r) {
		return r.getHeight()*2 + r.getWidth()*2;
	}

	public double calculateDiagonal(Rectangle r) {
		return Math.sqrt(Math.pow(r.getHeight(), 2) + Math.pow(r.getWidth(), 2));
	}
	
}
