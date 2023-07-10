package in.ineuron;

interface Drawable {
	void draw();
}

class Circles implements Drawable {
	@Override
	public void draw() {
		System.out.println("Drawing a circle");
	}
}

class Rectangles implements Drawable {
	@Override
	public void draw() {
		System.out.println("Drawing a rectangle");
	}
}

public class Mock_4 {

	public static void main(String[] args) {
		Drawable circle = new Circles();
		Drawable rectangle = new Rectangles();

		circle.draw(); 
		rectangle.draw();

	}

}
