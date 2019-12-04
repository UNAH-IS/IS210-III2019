package application;

import java.net.URL;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.ResourceBundle;

import clases.Alumno;
import clases.Carrera;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.ListView;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

public class ControladorFormulario implements Initializable{
	private ObservableList<Carrera> carreras; //ObservableList es igual que ArrayList, la diferencia es que el primero notifica a la GUI que hay cambios y actualiza inmediatamente.
	private ObservableList<Alumno> alumnos;
	@FXML private TextField identificacion;
	@FXML private TextField cuenta;
	@FXML private TextField nombre;
	@FXML private TextField apellido;
	@FXML private TextField edad;
	@FXML private ToggleGroup grupoGnero;
	@FXML private DatePicker fechaNacimiento;
	@FXML private ComboBox<Carrera> cboCarrera;
	@FXML private ListView<Alumno> lstAlumnos;
	@FXML private RadioButton rbtFemenino;
	@FXML private RadioButton rbtMasculino;
	@FXML private RadioButton rbtOtro;
	
	@FXML private Button btnNuevo;
	@FXML private Button btnGuardar;
	@FXML private Button btnActualizar;
	@FXML private Button btnEliminar;
	
	private ArrayList<String> errores;
	public ControladorFormulario() {
		System.out.println("Se ejecuto el constructor del controlador");
	}
	@FXML
	public void salir() {
		System.exit(0);
	}
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		//Este metodo se va a ejecutar cuando la GUI este lista y toodos los componentes esten instanciados
		carreras = FXCollections.observableArrayList();
		alumnos = FXCollections.observableArrayList();
		errores = new ArrayList<String>();
		
		carreras.add(new Carrera(115,"Ing en Sistemas",56,null,null));
		carreras.add(new Carrera(116,"Ing Quimica",56,null,null));
		carreras.add(new Carrera(117,"Ing Industrial",56,null,null));
		carreras.add(new Carrera(118,"Ing Mecanica",56,null,null));
		cboCarrera.setItems(carreras);

		//Asociar la coleccion de alumnos con el listview para visuaizar la informacion
		lstAlumnos.setItems(alumnos);
		
		//Asginar evento para identificar cuando se selecciona un elemento de la lista
		lstAlumnos.getSelectionModel().selectedItemProperty().addListener(
				new ChangeListener<Alumno>() {

					@Override
					public void changed(ObservableValue<? extends Alumno> arg0, Alumno valorAnterior, Alumno valorActual) {
						
						//Se ejecuta cuando se selecciona una opcion del listview
						System.out.println("Valor actual: "+valorActual);
						if (valorActual!=null) {
							identificacion.setText(valorActual.getIdentificacion());
							cuenta.setText(valorActual.getCuenta());
							nombre.setText(valorActual.getNombre());
							apellido.setText(valorActual.getApellido());
							edad.setText(String.valueOf(valorActual.getEdad()));
							fechaNacimiento.setValue(LocalDate.parse(valorActual.getFechaNacimiento()));
							cboCarrera.getSelectionModel().select(valorActual.getCarrera());
							if (valorActual.getGenero().equals("Femenino"))
								rbtFemenino.setSelected(true);
							if (valorActual.getGenero().equals("Masculino"))
								rbtMasculino.setSelected(true);
							if (valorActual.getGenero().equals("Otro"))
								rbtOtro.setSelected(true);
							
							btnGuardar.setDisable(true);
							btnActualizar.setDisable(false);
							btnEliminar.setDisable(false);
						}
						
					}
					
				}
		);
	}
	
	@FXML
	public void guardar() {
		validar();
		if (errores.size()>0) {
			//Mostrar errores
			Alert mensaje = new Alert(AlertType.WARNING);
			String cadenaErrores = "";
			for (int i=0;i<errores.size();i++)
				cadenaErrores+=errores.get(i)+"\n";
			
			mensaje.setTitle("Error al guardar");
			mensaje.setContentText(cadenaErrores);
			mensaje.setHeaderText("Se encontraron los siguientes errores: ");
			mensaje.show();
			return; //Sale del metodo y no guardaria nada
		}
		alumnos.add(new Alumno(
				identificacion.getText(),
				cuenta.getText(),
				nombre.getText(),
				apellido.getText(),
				Integer.parseInt(edad.getText()),
				fechaNacimiento.getValue().toString(),
				((RadioButton)grupoGnero.getSelectedToggle()).getText(),
				cboCarrera.getSelectionModel().getSelectedItem()
		));
	}
	
	@FXML
	public void nuevo() {
		identificacion.clear();
		cuenta.clear();
		nombre.clear();
		apellido.clear();
		edad.clear();
		fechaNacimiento.setValue(null);
		cboCarrera.getSelectionModel().clearSelection();
		btnGuardar.setDisable(false);
		btnActualizar.setDisable(true);
		btnEliminar.setDisable(true);
		lstAlumnos.getSelectionModel().clearSelection();
	}
	
	@FXML
	public void eliminar() {
		alumnos.remove(lstAlumnos.getSelectionModel().getSelectedIndex());
		nuevo();
	}
	
	@FXML
	public void actualizar() {
		alumnos.set(
				lstAlumnos.getSelectionModel().getSelectedIndex(),
				new Alumno(
					identificacion.getText(),
					cuenta.getText(),
					nombre.getText(),
					apellido.getText(),
					Integer.parseInt(edad.getText()),
					fechaNacimiento.getValue().toString(),
					((RadioButton)grupoGnero.getSelectedToggle()).getText(),
					cboCarrera.getSelectionModel().getSelectedItem()
				)
		);
	}
	
	public void validar() {
		errores.clear();//borra todos los elementos de un ArrayList
		
		if (!edad.getText().isEmpty()) {
			try {
				Integer.parseInt(edad.getText());
			}catch(NumberFormatException e) {
				errores.add("La edad debe ser numerico");
			}
		}		
		
		if (identificacion.getText().isEmpty())
			errores.add("El campo identificacion está vacio");
		
		if (cuenta.getText().isEmpty())
			errores.add("El campo cuenta está vacio");
		
		if (nombre.getText().isEmpty())
			errores.add("El campo nombre está vacio");
		
		if (apellido.getText().isEmpty())
			errores.add("El campo apellido está vacio");
		
		if (edad.getText().isEmpty())
			errores.add("El campo edad está vacio");
		
		if (fechaNacimiento.getValue() == null)
			errores.add("El campo fecha de nacimiento está vacio");
		
		if (cboCarrera.getSelectionModel().getSelectedItem() == null)
			errores.add("El campo carrera está vacio");
		
		if (grupoGnero.getSelectedToggle()==null)
			errores.add("El campo genero está vacio");
	}
}
