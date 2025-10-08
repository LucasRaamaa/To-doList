package service;

import model.Tarea;
import java.util.ArrayList;
import java.util.List;

public class GestorTareas {
  private List<Tarea> tareas = new ArrayList<>();

  public void agregarTarea(Tarea tarea) {
    tareas.add(tarea);
    System.out.println("Tarea Agregada con Exitos!!");
  }

  public void listarTareas(){
    if(tareas.isEmpty()){
      System.out.println("No Hay Tareas Registradas.");
      return;
    }
    System.out.println("\n --- Listas De Tareas ---");
    for(Tarea t : tareas){
      System.out.println(t);
    }
  }

  public void completarTarea(int id){
    for (Tarea t : tareas){
      if (t.getId() == id){
        t.setCompletada(true);
        System.out.println("Tarea Marcada Como completa. ");
        return;
      }
    }
    System.out.println("No Se Encontro Tarea Asociada Al ID.");
  }
  public void eliminarTarea(int id){
    boolean eliminada = tareas.removeIf(t -> t.getId() == id);
    if (eliminada){
      System.out.println("Tarea Eliminada Con Exito.");
    }else {
      System.out.println("No Se Encontro Tarea Con Ese ID");
    }
  }


}
