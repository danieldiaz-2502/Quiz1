package model;

import processing.core.PApplet;

public class Figura {
	
	String[] figura,tam,posX,posY,direccion;
	PApplet app;
	
	public Figura(String[] figura,String[] tam,String[] posX,String[] posY,String[] direccion, PApplet app) {
		this.app = app;
		this.figura = app.loadStrings("../data/txt1.txt");
		this.tam = app.loadStrings("../data/txt1.txt");
		this.posX = app.loadStrings("../data/txt1.txt");
		this.posY = app.loadStrings("../data/txt1.txt");
		this.direccion = app.loadStrings("../data/txt1.txt");
	}
	
	public void dibujarFigura() {
		
			for (int i = 0; i < figura.length; i++) {
				if(figura[i].contains("Circulo")) {
					String [] infoUserFound = figura[i].split(" ");
					System.out.println(Integer.parseInt(infoUserFound[0]));
					}
				if(figura[i].contains("Cuadrado")) {
					String [] infoUserFound = figura[i].split(" ");
					System.out.println(Integer.parseInt(infoUserFound[0]));
					}
				}
			}
	}
