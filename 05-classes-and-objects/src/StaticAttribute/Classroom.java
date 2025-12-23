package StaticAttribute;

public class Classroom {
    // attributes
    private String studentName; // esto podría variar -> atributo que pertenece a la instancia
    private static String schoolName = "First School"; // esto no puede variar así que puedes inicializarla y asignarle un valor a la vez porque podrías saber de antemano qué escuela es, por tanto, lo más útil es hacer que ese atributo sea estático -> atributo que pertenece a la clase lo que hace que SOLO va a haber una copia

    // constructor (solo vas a poder hacerlo con el studentName porque no es static)
    public Classroom(String studentName) {
        this.studentName = studentName;
    }

    // methods
    public void showInfo() {
        System.out.println("Alumno: " + studentName + "Escuela: " + schoolName);
    }

    // setters y getters
    public static String getSchoolName() {
        return schoolName;
    }
    public static void setSchoolName( String schoolName) {
     // ojo a la forma de hacer un setter de un static attribute
        Classroom.schoolName = schoolName;
    }

    public String getStudentName() {
        return studentName;
    }
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

}
