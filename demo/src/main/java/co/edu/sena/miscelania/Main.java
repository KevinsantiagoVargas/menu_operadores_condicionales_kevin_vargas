package co.edu.sena.miscelania;
import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
  menu();
  }

  public static void menu() {
  Scanner in = new Scanner(System.in);
  boolean aceptado = true;

  while (aceptado) {
  System.out.println("Menu de problemas matematicos");
  System.out.println("1) OPERADORES");
  System.out.println("2) CONDICIONALES");
  System.out.println("0) FINALIZAR");
  int opc = in.nextInt();

  switch (opc) { 
  case 1:
  menuoperadores(in);
  break;
  case 2:
  menucondicionales(in);
  break;
  case 0:
  aceptado = false;
  System.out.println("finalizo ejecucion");
  break;
  default:
  System.out.println("dijitar opcion");
  break;
  }
  }
  in.close();
  }
  public static void menuoperadores(Scanner in) {
  boolean aceptado = true;

  while (aceptado) {
  System.out.println("OPERADORES");
  System.out.println("1) Area de un triangulo");
  System.out.println("2) sumar numeros");
  System.out.println("3) cuadrado elevado");
  System.out.println("4) dinero euro pasar a dolar");
  System.out.println("5) cuadrado su area y perimetro");
  System.out.println("6) cilindro su area y volumen");
  System.out.println("7) circulo su longitud y area");
  System.out.println("8) Ptres numeros promediados");
  System.out.println("0) Regresar menu del principio");
  int opc = in.nextInt();
  switch (opc) {
  case 1:
  System.out.println("digite valor de la base triangulo:");
  double base = in.nextDouble();
  System.out.println("digite valor de la altura triangulo:");
  double altura = in.nextDouble();
  System.out.println(
  "area del triangulo: " + ejercicios.operadores.aretriangulo(base, altura));
  break;

  case 2:
  System.out.println("ingresar primer numero suma:");
  double primen = in.nextDouble();
  System.out.println("ingresar segundo numero suma:");
  double segundon = in.nextDouble();
  System.out.println("suma total numeros: " + ejercicios.operadores.sumanumerototal(primen, segundon));
  break;

  case 3:
  System.out.println("numero para elevar al cuadrado:");
  double numeroa = in.nextDouble();
  System.out.println("el elevador " + numeroa + " al cuadrado es: "
  + ejercicios.operadores.cuadrdadoelevado(numeroa));
  break;

  case 4:
  System.out.println("digite los euros que quiere cambiar a dolares:");
  double euro = in.nextDouble();
  System.out.println(euro + " los euros son " + ejercicios.operadores.convereurodolar(euro)
  + " dolares.");
  break;

  case 5:
  System.out.println("ingrese un valor del lado del cuadrado");
  double lado = in.nextDouble();
  System.out.println(
  "are cuadrado= " + ejercicios.operadores.ladocuadro(lado));
  break;

  case 6:
  System.out.println("ingresar radio cilindro:");
  double radio = in.nextDouble();
  System.out.println("ingresar altura cilindro:");
  double alturac = in.nextDouble();
  System.out.println("volumen final=: "
  + ejercicios.operadores.areacilindro(radio, alturac));
  break;

  case 7:
  System.out.println("ingrese radio circulo: ");
  double area = in.nextDouble();
  System.out.println("area de la circunferencia: "
  + ejercicios.operadores.areacirculo(area));
  break;  
    
  case 8:
  System.out.println("digitar tres numeros espaciados: ");
  double primern = in.nextDouble();
  double segundonum = in.nextDouble();
  double tercern = in.nextDouble();
  System.out.println("promedio de los tres numero en total: "
  + ejercicios.operadores.promnumeros(primern, segundonum, tercern));
  break;
  case 0:
  aceptado = false;
  break;
  default:
  System.out.println("eso no es valido");
  break;
  }
  }
  }
//mysql<- dato random
  public static void menucondicionales(Scanner in) {
  boolean aceptado = true;
  while (aceptado) {
  System.out.println("CONDICIONALES");
  System.out.println("1) saber cual es negativo y positivo");
  System.out.println("2) numero mayor y menor orden ");
  System.out.println("3) 3 numeros y cual es el menor y mayor en orden");
  System.out.println("4) digitar dos digitos si (a) sumarlos o (b) restar");
  System.out.println("5) buscar el conciente a,b");
  System.out.println("6) digitar dos digitos a,b sumar si es negativo o multiplicar si es positivo");
  System.out.println("7) calcular si un año es bisiesto");
  System.out.println("0) Regresar menu del principio");
  int opc = in.nextInt();
  switch (opc) {
  case 1:
  System.out.println("ingrese un digito:");
  double resultadopn = in.nextDouble();
  System.out.println(ejercicios.condicionales.negativopositivo(resultadopn)); 
  break;

  case 2:
  System.out.println("ingrese un digito:");
  double primern = in.nextDouble();
  System.out.println("ingrese otro digito:");
  double segundon = in.nextDouble();
  System.out.println(ejercicios.condicionales.mayormen(primern,segundon)); 
  break;
  
  case 3:
  System.out.println("ingrese primer digito");
  double primernA = in.nextDouble();
  System.out.println("ingrese segundo digito");
  double segundonA= in.nextDouble();
  System.out.println("ingrese tercer digito");
  double tercernA= in.nextDouble();
  System.out.println(ejercicios.condicionales.numordenmenmayor(primernA, segundonA, tercernA));
  break;

  case 4:
  System.out.println("ingrese primer digito");
  double primernB = in.nextDouble();
  System.out.println("ingrese segundo digito");
  double segundonB = in.nextDouble();
  System.out.println(ejercicios.condicionales.restsumn(primernB, segundonB));
  break;

  case 5:
  System.out.println("ingrese primer digito");
  double primernC = in.nextDouble();
  System.out.println("ingrese segundo digito");
  double segundonC = in.nextDouble();
  System.out.println(ejercicios.condicionales.divicionN(primernC, segundonC));
  break;

  case 6:
  System.out.println("ingrese primer digito ");
  double primernD = in.nextDouble();
  System.out.println("ingrese segundo digito");
  double segundonD = in.nextDouble();
  System.out.println(ejercicios.condicionales.multiSum(primernD, segundonD));
  break;

  case 7:
  System.out.println("digitar cual es el año que desea saber si bisiesto o no lo es");
  double tiempoano = in.nextDouble();
  System.out.println(ejercicios.condicionales.bisiestofecha(tiempoano));
  break;

  case 0:
  aceptado = false;
  break;

  default:
  System.out.println("eso no es valido");
  break;
}}
  }
  //mariz crud :3
  private static void menu(Scanner in) {
  throw new UnsupportedOperationException("menu micelania");
  }
  }