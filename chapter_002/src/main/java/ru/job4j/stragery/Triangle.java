package ru.job4j.stragery;

public class Triangle implements Shape {

	@Override
	public String draw() {
		StringBuilder pic = new StringBuilder();
		pic.append("    △").append(std);
		pic.append("   △ △").append(std);
		pic.append("  △   △").append(std);;
		pic.append(" △     △").append(std);;
		pic.append("△△△△△△△").append(std);;
		return pic.toString();
	}

	public static void main(String[] args) {
		Triangle triangle = new Triangle();
		System.out.println(triangle.draw());
	}
}
