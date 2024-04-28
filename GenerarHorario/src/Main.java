import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Crear instancias de Departamentos
        Departamento cienciasS = new Departamento("Idiomas y Ciencias Sociales");
        Departamento ad = new Departamento("Administración de empresas");

        Departamento computacion = new Departamento("Computación");
        Departamento cienciasN = new Departamento("Ciencias Naturales y Exactas");

        AuTeoria aulaT0 = new AuTeoria("Aula 100", 100, 35, "Disponible", "Proyector", "Sí", "Edificio A");
        AuTeoria aulaT1 = new AuTeoria("Aula 101", 101, 30, "Disponible", "Proyector", "Sí", "Edificio A");
        AuTeoria aulaT2 = new AuTeoria("Aula 102", 102, 32, "Disponible", "Proyector", "Sí", "Edificio A");
        AuTeoria aulaT3 = new AuTeoria("Aula 103", 103, 30, "Disponible", "Proyector", "Sí", "Edificio A");
        AuTeoria aulaT4 = new AuTeoria("Aula 104", 104, 31, "Disponible", "Proyector", "Sí", "Edificio A");
        AuTeoria aulaT5 = new AuTeoria("Aula 105", 105, 30, "Disponible", "Proyector", "Sí", "Edificio A");
        AuPractica aulaP0 = new AuPractica("Aula 200", 200, 25, "Disponible", "Monitor", "Edificio B");
        AuPractica aulaP1 = new AuPractica("Aula 201", 201, 22, "Disponible", "Monitor", "Edificio B");
        AuPractica aulaP2 = new AuPractica("Aula 202", 202, 20, "Disponible", "Monitor", "Edificio B");
        AuPractica aulaP3 = new AuPractica("Aula 203", 203, 20, "Disponible", "Monitor", "Edificio B");
        AuPractica aulaP4 = new AuPractica("Aula 204", 203, 20, "Disponible", "Monitor", "Edificio B");
        AuPractica aulaP5 = new AuPractica("Aula 205", 203, 25, "Disponible", "Monitor", "Edificio B");

        // Crear instancias de Asignaturas Teóricas
        AsigTeorica mateDis = new AsigTeorica("Matematica Discreta", 4, "https://matematicas.com", cienciasN);
        //mateDis.agregarHorario("Lunes", "12:30-16:00", null);
        //mateDis.agregarHorario("Martes", "7:30-11:30",null); // Añadir horario para otro día

        AsigTeorica mateGe = new AsigTeorica("Matematica General", 2, "https://matematicas.com", cienciasN);
        // mateGe.agregarHorario("Miercoles", "12:30-16:00", null);
        // mateGe.agregarHorario("Lunes", "7:30-11:30",null); // Añadir horario para otro día

        AsigTeorica inglesB = new AsigTeorica("Inglés Basico", 2, "https://englishbasic.com", cienciasS);

        AsigTeorica comuE = new AsigTeorica("Comunicación Escrita", 2, "https://comuEscrita.com", cienciasS);


        // Crear instancias de Asignaturas Prácticas
        AsigPractica intro = new AsigPractica("Introducción a la Programación", 3, "Windows", computacion);

        AsigPractica taller = new AsigPractica("Taller de Programacón", 3, "Windows", computacion);
        AsigPractica funda = new AsigPractica("Fundamentos de Organización de Computadoras", 3, "Windows", computacion);

        AsigTeorica calculoD = new AsigTeorica("Calculo Diferencial", 4, "https://matematicas.com", cienciasN);
        //calculoD.agregarHorario("Jueves", "12:30-16:00",null);
        //calculoD.agregarHorario("Lunes", "7:30-11:30",null); // Añadir horario para otro día
        AsigTeorica ingles1 = new AsigTeorica("Ingles 1", 2, "https://english1.com", cienciasS);
        AsigPractica poo = new AsigPractica("Programación Orientada a Objetos", 3, "Windows", computacion);
        AsigPractica estruct = new AsigPractica("Estructuras de Datos", 4, "Windows", computacion);
        AsigPractica arqui = new AsigPractica("Arquitectura de Computadores", 4, "Windows", computacion);

        AsigTeorica algebraL = new AsigTeorica("Algebra Lineal", 4, "https://matematicas.com", cienciasN);
        //algebraL.agregarHorario("Jueves", "12:30-16:00", null);
        // algebraL.agregarHorario("Lunes", "7:30-11:30",null); // Añadir horario para otro día

        AsigTeorica ingles2 = new AsigTeorica("Ingles 2", 2, "https://english2.com", cienciasS);
        AsigPractica db = new AsigPractica("Bases de Datos", 4, "Windows", computacion);
        AsigPractica anali = new AsigPractica("Analísis de Algoritmos", 4, "Windows", computacion);

        AsigTeorica ambi = new AsigTeorica("Ambiente Humano", 2, "https://ambienteH.com", cienciasS);
        AsigTeorica proba = new AsigTeorica("Probabilidades", 4, "https://probabilidades.com", cienciasN);
        AsigPractica db2 = new AsigPractica("Bases de Datos2", 4, "Windows", computacion);
        AsigPractica len = new AsigPractica("Lenguajes de Programación", 4, "Windows", computacion);
        AsigPractica reque = new AsigPractica("Requerimientos de Software", 4, "Windows", computacion);

        AsigTeorica semi1 = new AsigTeorica("Seminario de Estudios Filosóficos", 2, "https://seminariofilo.com", cienciasS);
        AsigTeorica esta = new AsigTeorica("Estadística", 4, "https://estadisticas.com", cienciasN);
        AsigPractica admin = new AsigPractica("Administración de Proyectos", 4, "Windows", computacion);
        AsigPractica compi = new AsigPractica("Compiladores e Interpretes", 4, "Windows", computacion);
        AsigPractica dise = new AsigPractica("Diseño de Software", 4, "Windows", computacion);

        AsigTeorica semi2 = new AsigTeorica("Seminario de Estudios Costarricenses", 2, "https://seminariocosta.com", cienciasS);
        AsigTeorica compu = new AsigTeorica("Computación y Sociedad", 2, "https://compundsoci.com", cienciasS);
        AsigTeorica inve = new AsigTeorica("Investigación de Operaciones", 4, "https://investi.com", cienciasS);
        AsigPractica elec1 = new AsigPractica("Electiva 1", 3, "Windows", computacion);
        AsigPractica princi = new AsigPractica("Principios de Sistemas Operativos", 4, "Windows", computacion);
        AsigPractica ase = new AsigPractica("Aseguramiento de la Calidad del Software", 3, "Windows", computacion);

        AsigTeorica desa = new AsigTeorica("Desarrollo de Emprendedores", 2, "https://desarrolloem.com", ad);
        AsigPractica elec2 = new AsigPractica("Electiva 2", 3, "Windows", computacion);
        AsigPractica inteli = new AsigPractica("Inteligencia Artificial", 4, "Windows", computacion);
        AsigPractica redes = new AsigPractica("Redes", 4, "Windows", computacion);
        AsigPractica proye = new AsigPractica("Proyecto de Ingeniería de Software", 3, "Windows", computacion);

        AsigPractica practi = new AsigPractica("Práctica Profesional", 12, "Windows", computacion);


        //sistemasOperativos.agregarHorario("Miércoles", "12:30-16:00",null);
        // sistemasOperativos.agregarHorario("Lunes", "12:30-16:00", null);
        // Crear instancias de Semestres

        Semestre sem1 = new Semestre(1);
        Semestre sem2 = new Semestre(2);
        Semestre sem3 = new Semestre(3);
        Semestre sem4 = new Semestre(4);
        Semestre sem5 = new Semestre(5);
        Semestre sem6 = new Semestre(6);
        Semestre sem7 = new Semestre(7);
        Semestre sem8 = new Semestre(8);
        Programa progra = new Programa();

        // Añadir asignaturas a los semestres
        sem1.agregarAsignatura(mateDis);
        sem1.agregarAsignatura(mateGe);
        sem1.agregarAsignatura(mateGe);
        sem1.agregarAsignatura(inglesB);
        sem1.agregarAsignatura(comuE);
        sem1.agregarAsignatura(intro);
        sem1.agregarAsignatura(taller);
        sem1.agregarAsignatura(funda);

        sem2.agregarAsignatura(ingles1);
        sem2.agregarAsignatura(calculoD);
        sem2.agregarAsignatura(estruct);
        sem2.agregarAsignatura(arqui);
        sem2.agregarAsignatura(poo);

        sem3.agregarAsignatura(algebraL);
        sem3.agregarAsignatura(anali);
        sem3.agregarAsignatura(db);
        sem3.agregarAsignatura(ingles2);

        sem4.agregarAsignatura(ambi);
        sem4.agregarAsignatura(proba);
        sem4.agregarAsignatura(db2);
        sem4.agregarAsignatura(reque);
        sem4.agregarAsignatura(len);

        sem5.agregarAsignatura(semi1);
        sem5.agregarAsignatura(esta);
        sem5.agregarAsignatura(dise);
        sem5.agregarAsignatura(compi);
        sem5.agregarAsignatura(admin);

        sem6.agregarAsignatura(semi2);
        sem6.agregarAsignatura(compu);
        sem6.agregarAsignatura(inve);
        sem6.agregarAsignatura(elec1);
        sem6.agregarAsignatura(ase);
        sem6.agregarAsignatura(princi);

        sem7.agregarAsignatura(desa);
        sem7.agregarAsignatura(elec2);
        sem7.agregarAsignatura(inteli);
        sem7.agregarAsignatura(redes);
        sem7.agregarAsignatura(proye);

        sem8.agregarAsignatura(practi);

        progra.agregarSemestre(sem1);
        progra.agregarSemestre(sem2);
        progra.agregarSemestre(sem3);
        progra.agregarSemestre(sem4);
        progra.agregarSemestre(sem5);
        progra.agregarSemestre(sem6);
        progra.agregarSemestre(sem7);
        progra.agregarSemestre(sem8);
        System.out.println("Programa:");
        for (Semestre semestre : progra.getSemestres()) {
            System.out.println(semestre);
        }
        List<Aula> todasLasAulas = Aula.getAulas();
        //for (Aula aula : todasLasAulas) {
          //  System.out.println(aula.getNombre() + " - " + aula.getNumAula());
        //}

        InicioSesion sistema = new InicioSesion();

        // Agregar usuarios de ejemplo
        Profesor profesor1 = new Profesor("Juan", "1111", "1010", cienciasN);
        profesor1.agregarHorario("Lunes", "7:00-11:30");
        profesor1.agregarHorario("Martes", "7:00-11:30");
        profesor1.agregarHorario("Miércoles", "7:00-11:30");

        Profesor profesor2 = new Profesor("Luis", "2222", "2020", computacion);
        profesor2.agregarHorario("Lunes", "7:00-11:30");
        profesor2.agregarHorario("Martes", "7:00-11:30");
        profesor2.agregarHorario("Miércoles", "7:00-11:30");

        Profesor profesor3= new Profesor("Oscar", "3333", "3030", computacion);
        profesor3.agregarHorario("Lunes", "12:30-16:00");
        profesor3.agregarHorario("Jueves", "7:00-11:30");
        profesor3.agregarHorario("Miércoles", "7:00-11:30");

        Profesor profesor4= new Profesor("Michelle", "4444", "4040", cienciasS);
        profesor4.agregarHorario("Miercoles", "12:30-16:00");
        profesor4.agregarHorario("Jueves", "7:00-11:30");
        profesor4.agregarHorario("Viernes", "7:00-11:30");


        sistema.agregarUsuario(profesor1);
        sistema.agregarUsuario(profesor2);
        sistema.agregarUsuario(profesor3);
        sistema.agregarUsuario(profesor4);
        sistema.agregarUsuario(new Estudiante("E", "2"));
        sistema.agregarUsuario(new Coordinador("C", "3"));



        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Ingrese su nombre de usuario:");
            String nombreUsuario = scanner.nextLine();
            System.out.println("Ingrese su contraseña:");
            String contraseña = scanner.nextLine();

            // Intentar iniciar sesión
            Usuario usuario = sistema.iniciarSesion(nombreUsuario, contraseña);
            if (usuario != null) {
                System.out.println("Inicio de sesión exitoso como " + usuario.getTipoUsuario());
                sistema.mostrarMenu(usuario);
                int opcion;
                do {
                    System.out.println("Ingrese el número de la acción que desea realizar:");
                    opcion = scanner.nextInt();
                    scanner.nextLine(); // Consumir el salto de línea restante

                    switch (opcion) {
                        case 1:
                            if (usuario instanceof Profesor) {
                               

                                System.out.println("Cursos disponibles para impartir:");
                                Departamento deptoProfesor = ((Profesor) usuario).getDepartamento();
                                List<Asignatura> asignaturasDisponibles = new ArrayList<>();
                                for (Semestre semestre : progra.getSemestres()) {
                                    for (Asignatura asignatura : semestre.getAsignaturas()) {
                                        if (asignatura.getDepartamento().equals(deptoProfesor)) {
                                            asignaturasDisponibles.add(asignatura);
                                        }
                                    }
                                }

                                // Mostrar submenú con cursos disponibles
                                for (int i = 0; i < asignaturasDisponibles.size(); i++) {
                                    System.out.println((i + 1) + "=" + asignaturasDisponibles.get(i).getNombre());
                                }

                                // Lógica para que el profesor pueda seleccionar varios cursos
                                System.out.println("Por favor, ingrese los números de los cursos que desea impartir, separados por comas:");
                                String numerosCursos = scanner.nextLine();
                                String[] numerosCursosArray = numerosCursos.split(",");
                                List<Asignatura> cursosSeleccionados = new ArrayList<>();
                                for (String numeroCurso : numerosCursosArray) {
                                    int numeroCursoInt = Integer.parseInt(numeroCurso.trim());
                                    if (numeroCursoInt > 0 && numeroCursoInt <= asignaturasDisponibles.size()) {
                                        Asignatura cursoSeleccionado = asignaturasDisponibles.get(numeroCursoInt - 1);
                                        cursosSeleccionados.add(cursoSeleccionado);
                                    } else {
                                        System.out.println("Número de curso no válido: " + numeroCurso + ". Intente de nuevo.");
                                    }
                                }

                                if (!cursosSeleccionados.isEmpty()) {
                                    System.out.println("Has seleccionado los siguientes cursos:");
                                    for (Asignatura curso : cursosSeleccionados) {
                                        System.out.println(curso.getNombre());
                                    }

                                }
                            } else if (usuario instanceof Estudiante) {

                                //((Estudiante) usuario).verHorario();
                            } else if (usuario instanceof Coordinador) {
                                // Lógica para administrar profesores
                                //  ((Coordinador) usuario).administrarProfesores();

                            }
                            break;
                        case 2:
                            if (usuario instanceof Profesor) {
                                // Lógica para mostrar horario
                                //((Profesor) usuario).mostrarHorario();
                            } else if (usuario instanceof Estudiante) {
                                // Lógica para ver horario
                                //((Estudiante) usuario).verHorario();
                            } else if (usuario instanceof Coordinador) {
                                // Lógica para administrar estudiantes
                                //((Coordinador) usuario).administrarEstudiantes();
                            }
                            break;
                        case 3:
                            System.out.println("Saliendo del programa...");
                            System.exit(0); // Termina el programa
                            break;
                        default:
                            System.out.println("Opción no válida. Intente de nuevo.");
                    }
                } while (opcion != 3);

                break; // Termina el bucle principal después de un inicio de sesión exitoso
            } else {
                System.out.println("Inicio de sesión fallido. Intente de nuevo.");
            }
        }}}


