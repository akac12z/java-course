package StaticAttribute;

public class MainClassroom {
    public static  void main(String[] args) {
        Classroom student_1 = new Classroom("Maria");
        Classroom student_2 = new Classroom("Juana");

        Classroom.setSchoolName("School 2"); // esta es la forma de acceder a los atributos estáticos desde una instancia. necesitas llamar a la Clase, en este caso Classroom

        System.out.println(student_2.getStudentName());
        //aquí puedo acceder al get porque no es un atributo estático de la clase sino un atributo que pertenece a la instancia
    }
}
