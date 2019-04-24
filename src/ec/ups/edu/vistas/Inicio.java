/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.ups.edu.vistas;

import ec.ups.edu.clases.EntrenadorPersonal;
import ec.ups.edu.clases.EntrenadorPsicologico;
import ec.ups.edu.clases.JugadorExtra;
import ec.ups.edu.clases.JugarProfesional;
import ec.ups.edu.controladores.ControladorListEntrenadorPersonal;
import ec.ups.edu.controladores.ControladorSetEntrenadorPsicologico;
import ec.ups.edu.controladores.ControladorTreeMapJugadorExtra;
import ec.ups.edu.controladores.ControladorSortedJugadorProfesional;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author erics
 */
public class Inicio {
    
    public static void main(String[] args) {
        /*
        System.out.println("Introduzca la fecha con formato dd/mm/yyyy");
        Scanner sc = new Scanner(System.in);
        String fecha = sc.nextLine();
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        Date testDate = null;
        String date = fecha;
        try{
            testDate = df.parse(date);
            System.out.println("Ahora hemos creado un objeto date con la fecha indicada, "+testDate);
        } catch (Exception e){ System.out.println("invalid format");}
 
        if (!df.format(testDate).equals(date)){
            System.out.println("invalid date!!");
        } else {
            System.out.println("valid date");
        }
        */
        ///////////////////////////////////////////////////////////////////////////
  Scanner s = new Scanner(System.in);
        boolean salir = false;
        boolean salir1 = false;

        ControladorListEntrenadorPersonal controladorEntrenador = new ControladorListEntrenadorPersonal();
        ControladorSetEntrenadorPsicologico controladorEntrenador1 = new ControladorSetEntrenadorPsicologico();
        ControladorSortedJugadorProfesional controladorJugador = new ControladorSortedJugadorProfesional();
        ControladorTreeMapJugadorExtra controladorJugador2 = new ControladorTreeMapJugadorExtra();
        int op, opcion;
        System.out.println("Bienvenido al proyecto Restaurante");
        while (!salir1) {
            System.out.println("1. CRUD Entrenador Personal");
            System.out.println("2. CRUD Entrenador Psicologico");
            System.out.println("3. CRUD Jugador Profesional");
            System.out.println("4. CRUD Jugador Extra");
            System.out.println("5. Salir");

            System.out.println("Elija una opcion");
            op = s.nextInt();
            System.out.println("\n");
            Scanner dato = new Scanner(System.in);

            switch (op) {
                case 1:
                    System.out.println("A elegido la opcion Entrenador Personal \n");

                    while (!salir) {

                        System.out.println("1. Create");
                        System.out.println("2. Read");
                        System.out.println("3. Update");
                        System.out.println("4. Dalete");
                        System.out.println("5. Regresar");
                        System.out.println("6. Listar");
                        System.out.println("Elija una opcion");
                        opcion = s.nextInt();
                        System.out.println("\n");
                        EntrenadorPersonal entre = new EntrenadorPersonal();

                        switch (opcion) {
                            case 1:
                                System.out.println("Has seleccionado la opción 'Create' ");
                                System.out.println("\n");
                                
                                System.out.println("Ingrese el titulo que tiene el Entrenador Personal  ");
                                String nombre = dato.next();
                                entre.setNombre(nombre);
                                System.out.println("\n");

                                System.out.println("Ingrese el idioma del Entrenador ");
                                String nomC = dato.next();
                                entre.setTipoIdioma(nomC);
                                System.out.println("\n");

                                System.out.println("Ingrese rutina del entrenador ");
                                String ru = dato.next();
                                entre.setRutina(ru);
                                System.out.println("\n");

                                System.out.println("Ingrese la edad del Entrenador");
                                int ed = dato.nextInt();
                                entre.setEdad(ed);
                                System.out.println("\n");

                                System.out.println("ingrese las recomendaciones del entrenador ");
                                String re = dato.next();
                                entre.setRecomendaciones(re);
                                System.out.println("\n");
/*
                                System.out.println("Ingrese codigo entrenador");
                                String co = dato.next();
                                entre.s
                                System.out.println("\n");
*/
                                System.out.println("Ingrese nombre del entrenador");
                                String no = dato.next();
                                entre.setNombre(no);
                                System.out.println("\n");

                                System.out.println("Ingrese cedula del entrenador");
                                String ce = dato.next();
                                entre.setCedula(ce);
                                System.out.println("\n");

                                System.out.println("Ingrese el telefono ");
                                int te = dato.nextInt();
                                entre.setTelefono(te);
                                System.out.println("\n");

                                System.out.println("Ingrese direccion ");
                                String di = dato.nextLine();
                                entre.setDireccion(di);
                                System.out.println("\n");

                                System.out.println("Ingresse correo electronico ");
                                String c = dato.next();
                                entre.setCorreo(c);
                                System.out.println("\n");
                                controladorEntrenador.create(entre);
                                
                                
                                break;
                            case 2:
                                System.out.println("Has seleccionado la opción 'Read'");
                                System.out.println("Ingrese el codigo a leer");
                                int codigo = dato.nextInt();
                                System.out.println(controladorEntrenador.read(codigo));
                                break;
                            case 3:
                                System.out.println("Has seleccionado la opción 'Update'");
                                  System.out.println("Ingrese el titulo que tiene el Entrenador Personal  ");
                                String nombre1 = dato.next();
                                entre.setNombre(nombre1);
                                System.out.println("\n");

                                System.out.println("Ingrese el idioma del Entrenador ");
                                String nomC1 = dato.next();
                                entre.setTipoIdioma(nomC1);
                                System.out.println("\n");

                                System.out.println("Ingrese rutina del entrenador ");
                                String ru1 = dato.next();
                                entre.setRutina(ru1);
                                System.out.println("\n");

                                System.out.println("Ingrese la edad del Entrenador");
                                int ed1 = dato.nextInt();
                                entre.setEdad(ed1);
                                System.out.println("\n");

                                System.out.println("ingrese las recomendaciones del entrenador ");
                                String re1 = dato.next();
                                entre.setRecomendaciones(re1);
                                System.out.println("\n");
/*
                                System.out.println("Ingrese codigo entrenador");
                                String co1 = dato.next();
                                entre.setCodigo(ed1);
                                System.out.println("\n");
*/
                                System.out.println("Ingrese nombre del entrenador");
                                String no1 = dato.next();
                                entre.setNombre(no1);
                                System.out.println("\n");

                                System.out.println("Ingrese cedula del entrenador");
                                String ce1= dato.next();
                                entre.setCedula(ce1);
                                System.out.println("\n");

                                System.out.println("Ingrese el telefono ");
                                int te1 = dato.nextInt();
                                entre.setTelefono(te1);
                                System.out.println("\n");

                                System.out.println("Ingrese direccion ");
                                String di1 = dato.nextLine();
                                entre.setDireccion(di1);
                                System.out.println("\n");

                                System.out.println("Ingresse correo electronico ");
                                String c1 = dato.next();
                                entre.setCorreo(c1);
                                System.out.println("\n");

                                controladorEntrenador.update(entre);
                                break;
                            case 4:
                                System.out.println("Has seleccionado la opción 'Delete'");
                                System.out.println("Ingrese el codigo a eliminar");
                                codigo = dato.nextInt();
                                controladorEntrenador.delete(codigo);
                                break;
                            case 5:
                                System.out.println("Has seleccionado la opción Regresar");

                                salir1 = true;
                                break;
                             
                            default:
                                System.out.println("Solo digite números entre 1 y 6");
                        }
                    }
                    break;

                case 2:
                    System.out.println("A elegido la opcion Entrenador Psicologico \n");

                    while (!salir) {

                        System.out.println("1. Create");
                        System.out.println("2. Read");
                        System.out.println("3. Update");
                        System.out.println("4. Dalete");
                        System.out.println("5. Regresar");

                        System.out.println("Elija una opcion");
                        opcion = s.nextInt();
                        System.out.println("\n");
                        //Scanner dato = new Scanner(System.in);
                        EntrenadorPsicologico entre1 = new EntrenadorPsicologico();

                        switch (opcion) {
                            case 1:
                                System.out.println("Has seleccionado la opción 'Create'");

                                System.out.println("\n");

                                System.out.println("Ingrese el titulo que tiene el Entrenador Psicologico  ");
                                String ti = dato.next();
                                entre1.setNombre(ti);
                                System.out.println("\n");

                                System.out.println("Ingrese el titulo de las charlas que dara ");
                                String t = dato.next();
                                entre1.setTituloCharlas(t);
                                System.out.println("\n");

                                System.out.println("Ingresar su fecha de Contratacion");
                                Scanner sc = new Scanner(System.in);
                                String fecha = sc.nextLine();
                                SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
                                Date testDate = null;
                                String date = fecha;
                                try {
                                    testDate = df.parse(date);
                                    System.out.println("Usted fue contratado el: " + fecha);
                                } catch (Exception e) {
                                    System.out.println("invalid format");
                                }
                                entre1.setFechaContratacion(testDate);

                                System.out.println("Ingrese sueldo del Entrenador psicologico");
                                double ed = dato.nextInt();
                                entre1.setSueldo(ed);
                                System.out.println("\n");

                                System.out.println("ingrese la edad del entrenador ");
                                int re = dato.nextInt();
                                entre1.setEdad(re);
                                System.out.println("\n");

                                System.out.println("Ingrese  las recomendaciones que tiene el entrenador");
                                String co = dato.next();
                                entre1.setRecomendaciones(co);
                                System.out.println("\n");
/*
                                System.out.println("Ingrese codigo del entrenador");
                                int c = dato.nextInt();
                                entre1.setCodigo(c);
                                System.out.println("\n");
*/
                                System.out.println("Ingrese nombre del entrenador");
                                String nom = dato.next();
                                entre1.setNombre(nom);
                                System.out.println("\n");

                                System.out.println("Ingrese cedula del entrenador");
                                String ce1= dato.next();
                                entre1.setCedula(ce1);
                                System.out.println("\n");

                                System.out.println("Ingrese el telefono ");
                                int te1 = dato.nextInt();
                                entre1.setTelefono(te1);
                                System.out.println("\n");

                                System.out.println("Ingrese direccion ");
                                String di1 = dato.nextLine();
                                entre1.setDireccion(di1);
                                System.out.println("\n");

                                System.out.println("Ingresse correo electronico ");
                                String c1 = dato.next();
                                entre1.setCorreo(c1);
                                System.out.println("\n");
                                controladorEntrenador1.create(entre1);
                                
                                
                                break;
                            case 2:
                                System.out.println("Has seleccionado la opción 'Read'");
                                System.out.println("Ingrese el usuario a leer");
                                int codigo = dato.nextInt();
                                System.out.println(controladorEntrenador.read(codigo));
                                break;
                            case 3:
                                System.out.println("Has seleccionado la opción 'Update'");
                                
                                System.out.println("Ingrese el titulo que tiene el Entrenador Personal  ");
                                String ti1 = dato.next();
                                entre1.setNombre(ti1);
                                System.out.println("\n");

                                System.out.println("Ingrese el titulo de las charlas que dara ");
                                String t1 = dato.next();
                                entre1.setTituloCharlas(t1);
                                System.out.println("\n");
                                   
                                System.out.println("Ingresar su fecha de Contratacion");
                                Scanner sc1 = new Scanner(System.in);
                                String fecha1 = sc1.nextLine();
                                SimpleDateFormat df1 = new SimpleDateFormat("dd/MM/yyyy");
                                Date testDate1 = null;
                                String date1 = fecha1;
                                try {
                                    testDate = df1.parse(date1);
                                    System.out.println("Usted fue contratado el: " + fecha1);
                                } catch (Exception e) {
                                    System.out.println("invalid format");
                                }
                                entre1.setFechaContratacion(testDate1);

                                System.out.println("Ingrese sueldo del Entrenador psicologico");
                                double ed1= dato.nextInt();
                                entre1.setSueldo(ed1);
                                System.out.println("\n");

                                System.out.println("ingrese la edad del entrenador ");
                                int re1 = dato.nextInt();
                                entre1.setEdad(re1);
                                System.out.println("\n");

                                System.out.println("Ingrese  las recomendaciones que tiene el entrenador");
                                String co1 = dato.next();
                                entre1.setRecomendaciones(co1);
                                System.out.println("\n");
/*
                                System.out.println("Ingrese codigo del entrenador");
                                int c2 = dato.nextInt();
                                entre1.setCodigo(c2);
                                System.out.println("\n");
*/
                                System.out.println("Ingrese nombre del entrenador");
                                String nom1 = dato.next();
                                entre1.setNombre(nom1);
                                System.out.println("\n");

                                System.out.println("Ingrese cedula del entrenador");
                                String ce11= dato.next();
                                entre1.setCedula(ce11);
                                System.out.println("\n");

                                System.out.println("Ingrese el telefono ");
                                int te11 = dato.nextInt();
                                entre1.setTelefono(te11);
                                System.out.println("\n");

                                System.out.println("Ingrese direccion ");
                                String di11 = dato.nextLine();
                                entre1.setDireccion(di11);
                                System.out.println("\n");

                                System.out.println("Ingresse correo electronico ");
                                String c11 = dato.next();
                                entre1.setCorreo(c11);
                                System.out.println("\n");

                                controladorEntrenador1.update(entre1);
                            case 4:
                                System.out.println("Has seleccionado la opción 'Delete'");
                                System.out.println("Ingrese el codigo a eliminar");
                                codigo = dato.nextInt();
                                controladorEntrenador1.delete(codigo);
                                break;
                            case 5:
                                System.out.println("Has seleccionado la opción Regresar");
                                salir1 = true;
                                break;

                            default:
                                System.out.println("Solo digite números entre 1 y 5");
                        }
                    }

                    break;

                case 3:
                    System.out.println("A elegido la opcion Jugador Profesional \n");

                    while (!salir) {

                        System.out.println("1. Create");
                        System.out.println("2. Read");
                        System.out.println("3. Update");
                        System.out.println("4. Dalete");
                        System.out.println("5. Regresar");

                        System.out.println("Elija una opcion");
                        opcion = s.nextInt();
                        JugarProfesional ju = new JugarProfesional();

                        switch (opcion) {
                            case 1:
                                System.out.println("Has seleccionado la opción 'Create'");
                                System.out.println("\n");
                                
                                System.out.println("Ingrese el lugar de nacimiento ");
                                String lu = dato.next();
                                ju.setLugardeNacimiento(lu);
                                System.out.println("\n");

                                System.out.println("Ingrese peso del jugador");
                                double pe = dato.nextDouble();
                                ju.setPeso(pe);
                                System.out.println("\n");

                                System.out.println("Ingrese la audicion");
                                boolean s1 = dato.nextBoolean();
                                ju.setTitularsuplente(s1);
                                System.out.println("\n");

                                System.out.println("Ingrese la edad del jugador");
                                int ed = dato.nextInt();
                                ju.setEdad(ed);
                                System.out.println("\n");
                                
                                System.out.println("Ingrese estatura del jugador");
                                double esta = dato.nextDouble();
                                ju.setEstatura(esta);
                                System.out.println("\n");

                                System.out.println("ingrese el salario ");
                                double sa = dato.nextDouble();
                                ju.setSalario(sa);
                                System.out.println("\n");

                                System.out.println("Ingrese la posicion de juego");
                                String po = dato.next();
                                ju.setPosiciondeJuego(po);
                                System.out.println("\n");
/*
                               System.out.println("Ingrese codigo del entrenador");
                                int c = dato.nextInt();
                                ju.setCodigo(c);
                                System.out.println("\n");
*/
                                System.out.println("Ingrese nombre del Jugador");
                                String nom = dato.next();
                                ju.setNombre(nom);
                                System.out.println("\n");

                                System.out.println("Ingrese cedula del Jugador");
                                String ce1= dato.next();
                                ju.setCedula(ce1);
                                System.out.println("\n");

                                System.out.println("Ingrese el telefono ");
                                int te1 = dato.nextInt();
                                ju.setTelefono(te1);
                                System.out.println("\n");

                                System.out.println("Ingrese direccion ");
                                String di1 = dato.nextLine();
                                ju.setDireccion(di1);
                                System.out.println("\n");

                                System.out.println("Ingresse correo electronico ");
                                String c1 = dato.next();
                                ju.setCorreo(c1);
                                System.out.println("\n");
                                controladorJugador.create(ju);

                                break;
                            case 2:
                                System.out.println("Has seleccionado la opción 'Read'");
                                System.out.println("Ingrese el usuario a leer");
                                int codigo = dato.nextInt();
                                System.out.println(controladorJugador.read(codigo));
                                break;
                            case 3:
                                System.out.println("Has seleccionado la opción 'Update'");
                               System.out.println("Ingrese el lugar de nacimiento ");
                                String lu1 = dato.next();
                                ju.setLugardeNacimiento(lu1);
                                System.out.println("\n");

                                System.out.println("Ingrese peso del jugador");
                                double pe1 = dato.nextDouble();
                                ju.setPeso(pe1);
                                System.out.println("\n");

                                System.out.println("Ingrese la audicion");
                                boolean s11 = dato.nextBoolean();
                                ju.setTitularsuplente(s11);
                                System.out.println("\n");

                                System.out.println("Ingrese la edad del jugador");
                                int ed1 = dato.nextInt();
                                ju.setEdad(ed1);
                                System.out.println("\n");
                                
                                System.out.println("Ingrese estatura del jugador");
                                double esta1 = dato.nextDouble();
                                ju.setEstatura(esta1);
                                System.out.println("\n");

                                System.out.println("ingrese el salario ");
                                double sa1 = dato.nextDouble();
                                ju.setSalario(sa1);
                                System.out.println("\n");

                                System.out.println("Ingrese la posicion de juego");
                                String po11 = dato.next();
                                ju.setPosiciondeJuego(po11);
                                System.out.println("\n");
/*
                               System.out.println("Ingrese codigo del entrenador");
                                int c11 = dato.nextInt();
                                ju.setCodigo(c11);
                                System.out.println("\n");
*/
                                System.out.println("Ingrese nombre del Jugador");
                                String nom1 = dato.next();
                                ju.setNombre(nom1);
                                System.out.println("\n");

                                System.out.println("Ingrese cedula del Jugador");
                                String ce11= dato.next();
                                ju.setCedula(ce11);
                                System.out.println("\n");

                                System.out.println("Ingrese el telefono ");
                                int te11 = dato.nextInt();
                                ju.setTelefono(te11);
                                System.out.println("\n");

                                System.out.println("Ingrese direccion ");
                                String di11 = dato.nextLine();
                                ju.setDireccion(di11);
                                System.out.println("\n");

                                System.out.println("Ingresse correo electronico ");
                                String c112 = dato.next();
                                ju.setCorreo(c112);
                                System.out.println("\n");

                                controladorJugador.update(ju);
                                break;
                            case 4:
                                System.out.println("Has seleccionado la opción 'Delete'");
                                System.out.println("Has seleccionado la opción 'Delete'");
                                System.out.println("Ingrese el codigo a eliminar");
                                codigo = dato.nextInt();
                                controladorJugador.delete(codigo);
                                break;
                            case 5:
                                System.out.println("Has seleccionado la opción Regresar");

                                salir1 = true;
                                break;
                            default:
                                System.out.println("Solo digite números entre 1 y 5");
                        }
                    }
                    break;
                case 4:
                    System.out.println("A elegido la opcion Jugador Extra \n");

                    while (!salir) {

                        System.out.println("1. Create");
                        System.out.println("2. Read");
                        System.out.println("3. Update");
                        System.out.println("4. Dalete");
                        System.out.println("5. Regresar");
                        System.out.println("6. Listar");
                        System.out.println("Elija una opcion");
                        opcion = s.nextInt();
                        JugadorExtra j = new JugadorExtra();

                        switch (opcion) {
                            case 1:
                                System.out.println("Has seleccionado la opción 'Create'");
                                System.out.println("\n");

                                System.out.println("Ingrese el lugar de nacimiento ");
                                String lu = dato.next();
                                j.setLugardeNacimiento(lu);
                                System.out.println("\n");

                                System.out.println("Ingrese peso del jugador");
                                double pe = dato.nextDouble();
                                j.setPeso(pe);
                                System.out.println("\n");

                                System.out.println("Ingrese si es titular o suplente");
                                boolean s1 = dato.nextBoolean();
                                j.setTitularsuplente(s1);
                                System.out.println("\n");

                                System.out.println("Ingrese la edad del jugador");
                                int ed = dato.nextInt();
                                j.setEdad(ed);
                                System.out.println("\n");
                                
                                System.out.println("Ingrese estatura del jugador");
                                double esta = dato.nextDouble();
                                j.setEstatura(esta);
                                System.out.println("\n");

                                System.out.println("ingrese el salario ");
                                double sa = dato.nextDouble();
                                j.setSalario(sa);
                                System.out.println("\n");

                                System.out.println("Ingrese la posicion de juego");
                                String po = dato.next();
                                j.setPosiciondeJuego(po);
                                System.out.println("\n");
/*
                               System.out.println("Ingrese codigo del entrenador");
                                int c = dato.nextInt();
                                j.setCodigo(c);
                                System.out.println("\n");
*/
                                System.out.println("Ingrese nombre del Jugador");
                                String nom = dato.next();
                                j.setNombre(nom);
                                System.out.println("\n");

                                System.out.println("Ingrese cedula del Jugador");
                                String ce1= dato.next();
                                j.setCedula(ce1);
                                System.out.println("\n");

                                System.out.println("Ingrese el telefono ");
                                int te1 = dato.nextInt();
                                j.setTelefono(te1);
                                System.out.println("\n");

                                System.out.println("Ingrese direccion ");
                                String di1 = dato.nextLine();
                                j.setDireccion(di1);
                                System.out.println("\n");

                                System.out.println("Ingresse correo electronico ");
                                String c1 = dato.next();
                                j.setCorreo(c1);
                                System.out.println("\n");
                                controladorJugador2.create(j);

                                break;
                            case 2:
                                System.out.println("Has seleccionado la opción 'Read'");
                                System.out.println("Ingrese el usuario a leer");
                                int codigo = dato.nextInt();
                                System.out.println(controladorJugador2.read(codigo));
                                break;
                            case 3:
                                System.out.println("Has seleccionado la opción 'Update'");
                                System.out.println("Ingrese el lugar de nacimiento ");
                                String lu1 = dato.next();
                                j.setLugardeNacimiento(lu1);
                                System.out.println("\n");

                                System.out.println("Ingrese peso del jugador");
                                double pe1 = dato.nextDouble();
                                j.setPeso(pe1);
                                System.out.println("\n");

                                System.out.println("Ingrese la audicion");
                                boolean s11 = dato.nextBoolean();
                                j.setTitularsuplente(s11);
                                System.out.println("\n");

                                System.out.println("Ingrese la edad del jugador");
                                int ed1= dato.nextInt();
                                j.setEdad(ed1);
                                System.out.println("\n");
                                
                                System.out.println("Ingrese estatura del jugador");
                                double esta1 = dato.nextDouble();
                                j.setEstatura(esta1);
                                System.out.println("\n");

                                System.out.println("ingrese el salario ");
                                double sa1 = dato.nextDouble();
                                j.setSalario(sa1);
                                System.out.println("\n");

                                System.out.println("Ingrese la posicion de juego");
                                String po1 = dato.next();
                                j.setPosiciondeJuego(po1);
                                System.out.println("\n");
/*
                               System.out.println("Ingrese codigo del entrenador");
                                int c11= dato.nextInt();
                                j.setCodigo(c11);
                                System.out.println("\n");
*/
                                System.out.println("Ingrese nombre del Jugador");
                                String nom1 = dato.next();
                                j.setNombre(nom1);
                                System.out.println("\n");

                                System.out.println("Ingrese cedula del Jugador");
                                String ce112= dato.next();
                                j.setCedula(ce112);
                                System.out.println("\n");

                                System.out.println("Ingrese el telefono ");
                                int te12 = dato.nextInt();
                                j.setTelefono(te12);
                                System.out.println("\n");

                                System.out.println("Ingrese direccion ");
                                String di12 = dato.nextLine();
                                j.setDireccion(di12);
                                System.out.println("\n");

                                System.out.println("Ingresse correo electronico ");
                                String c12 = dato.next();
                                j.setCorreo(c12);
                                System.out.println("\n");

                                controladorJugador2.update(j);
                                break;
                            case 4:
                                System.out.println("Has seleccionado la opción 'Delete'");
                                System.out.println("Ingrese el codigo a eliminar");
                                codigo = dato.nextInt();
                                controladorJugador2.delete(codigo);
                                break;
                            case 5:
                                System.out.println("Has seleccionado la opción Regresar");

                                salir1 = true;
                                break;
                            default:
                                System.out.println("Solo digite números entre 1 y 5");
                             case 6:
                                controladorJugador2.listar();
                                break;
                        }
                    }
                    break;
            }
        }
    }
}
