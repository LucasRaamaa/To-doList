import model.Tarea;
import java.util.Scanner;
import service.GestorTareas;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    GestorTareas gestor = new GestorTareas();
    int opcion;

    do{
      System.out.println("\n--- Gestor De Tareas ---");
      System.out.println("1. Agregar Tarea");
      System.out.println("2. Listar Tareas");
      System.out.println("3. Completar Tarea");
      System.out.println("4. Eliminar Tarea");
      System.out.println("0. Salir Del Sistema.");
      System.out.println("Seleccione una opcion: ");

      opcion = sc.nextInt();
      sc.nextLine();
      switch (opcion){
        case 1:
          System.out.print("Ingrese ID De La Tarea: ");
          int id = sc.nextInt();
          sc.nextLine();
          System.out.println("Ingrese Descripcion: ");
          String desc = sc.nextLine();
          gestor.agregarTarea(new Tarea(id, desc));
          break;

          case 2:
          gestor.listarTareas();
          break;

        case 3:
          System.out.println("Ingrese ID De La Tarea a Completar: ");
          int idComp = sc.nextInt();
          gestor.completarTarea(idComp);
          break;

        case 4:
          System.out.println("Ingrese ID De La Tarea A Eliminar: ");
          int idDel = sc.nextInt();
          gestor.eliminarTarea(idDel);
          break;

        case 0:
          System.out.println("Saliendo Del Programa...");
          break;

        default:
          System.out.println("Opcion Invalida.");
      }
    }while (opcion != 0);

    sc.close();
  }
}