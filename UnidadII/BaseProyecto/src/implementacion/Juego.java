package implementacion;

import java.util.HashMap;

import clases.Jugador;
import clases.Tile;
import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.input.KeyEvent;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Juego extends Application{
	private Scene escena;
	private Group root;
	private Canvas canvas;
	private GraphicsContext graficos;
	private int puntuacion = 0;
	private Jugador jugador;
	private Tile t1;
	private Tile t2;
	private Tile t3;
	public static boolean derecha=false;
	public static boolean izquierda=false;
	public static boolean arriba=false;
	public static boolean abajo=false;
	public static HashMap<String, Image> imagenes; //Shift+Ctrl+O
	//private ArrayList<Image> imagenes;
	
	
	private int[][] mapa = {
			{1,50,0,0,1,1},
			{1,3,0,0,1,2},
			{1,3,0,0,1,2},
			{1,3,0,0,1,2},
			{1,3,0,0,1,2},
			{1,3,0,0,1,2},
			{1,3,0,0,1,2},
			{1,3,0,0,1,2},
			{1,3,0,0,1,2},
			{1,3,0,0,1,2},
			{1,3,0,0,1,2},
			{1,3,0,0,1,2},
			{1,3,0,0,1,2}
	};
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage ventana) throws Exception {
		inicializarComponentes();
		graficos = canvas.getGraphicsContext2D();
		root.getChildren().add(canvas);
		ventana.setScene(escena);
		ventana.setTitle("Juego super genial");
		gestionarEventos();
		ventana.show();
		cicloJuego();		
	}
	
	public void inicializarComponentes() {
		jugador = new Jugador(-50,400,"goku",1);
		root = new Group();
		escena = new Scene(root,1000,500);
		canvas  = new Canvas(1000,500);
		imagenes = new HashMap<String,Image>();
		
		t1 = new Tile(1,100,200, "tilemap",0);
		t2 = new Tile(2,170,200, "tilemap",0);
		t3 = new Tile(3,240,200, "tilemap",0);
		cargarImagenes();
		 
	}
	
	public void cargarImagenes() {
		imagenes.put("goku", new Image("goku.png"));
		imagenes.put("goku-furioso", new Image("goku-furioso.png"));
		imagenes.put("tilemap", new Image("tilemap.png"));
	}
	
	public void pintar() {
		graficos.setFill(Color.WHITE);
		graficos.fillRect(0, 0, 1000, 500);
		graficos.setFill(Color.BLACK);
		graficos.fillText("Puntuacion: " + puntuacion, 10, 10);
		jugador.pintar(graficos);
		t1.pintar(graficos);
		t2.pintar(graficos);
		t3.pintar(graficos);
	}
	
	public void gestionarEventos() {
		//Evento cuando se presiona una tecla
		escena.setOnKeyPressed(new EventHandler<KeyEvent>() {
			@Override
			public void handle(KeyEvent evento) {
					//Aqui tengo que poner el codigo para identificar cuando se presiono una tecla
					switch (evento.getCode().toString()) {
						case "RIGHT": //derecha
							derecha=true;
							break;
						case "LEFT": //derecha
							izquierda=true;
						break;
						case "UP":
							arriba=true;
							break;
						case "DOWN":
							abajo=true;
							break;
						case "SPACE":
							jugador.setVelocidad(10);
							jugador.setIndiceImagen("goku-furioso");
							break;
					}
			}			
		});
		
		escena.setOnKeyReleased(new EventHandler<KeyEvent>() {

			@Override
			public void handle(KeyEvent evento) {
				//Aqui tengo que poner el codigo para identificar cuando se soltó una tecla
				switch (evento.getCode().toString()) {
				case "RIGHT": //derecha
					derecha=false;
					break;
				case "LEFT": //derecha
					izquierda=false;
				break;
				case "UP":
					arriba=false;
					break;
				case "DOWN":
					abajo=false;
					break;
				case "SPACE":
					jugador.setVelocidad(1);
					jugador.setIndiceImagen("goku");
					break;
			}
				
			}
			
		});
		
	}
	
	public void cicloJuego() {
		AnimationTimer animationTimer = new AnimationTimer() {

			@Override
			public void handle(long tiempoActualNanoSegundos) {
				//Esta rutina simula un ciclo de 60FPS
				pintar();
				jugador.mover();
			}
			
		};
		animationTimer.start(); //Inicia el ciclo
	}

}
