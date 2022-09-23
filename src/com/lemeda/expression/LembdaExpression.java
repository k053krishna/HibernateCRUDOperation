package com.lemeda.expression;

public class LembdaExpression {

	public static void main(String[] args) {
		/*
		 * Rectangle rec=new Rectangle(); rec.draw()
		 */
		Shape Rectangle = () -> System.out.println("rectagle draw method");
         Rectangle.draw();
	}
}