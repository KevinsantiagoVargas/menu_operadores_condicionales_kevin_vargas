package co.edu.sena.miscelania;
public class ejercicios {
public class operadores {
public static double aretriangulo(double base, double altura) {
double area = (base * altura) / 2;
return area;}

public static double sumanumerototal(double primen, double segundon) {
double suma = primen + segundon;
return suma;}

public static double cuadrdadoelevado(double numeroa) {
double resultado = Math.pow(numeroa, 2);
return resultado;}

public static double convereurodolar(double euro) {
double porcen = 1.8;
double dolar = euro * porcen;
return dolar;}

public static double ladocuadro(double lado) {
double area = lado * lado;
double perimetro= 4 * lado;
System.out.println("resultado perimetro cuadrado: " + perimetro);
return (area);}

public static double areacilindro(double radio, double alturac) {
double areal = 2 * Math.PI * radio * alturac;
double areat = 2 * Math.PI * radio * (radio + alturac);
double volumen = Math.PI * Math.pow(radio, 2) * alturac;
System.out.println("area lateral cilindro= " + areal);
System.out.println("area total cilindro= " + areat);
return (volumen);}

public static double areacirculo(double radioc) {
double medidac = 2 * Math.PI * radioc;
double area = Math.PI * Math.pow(radioc, 2);
System.out.println("el tamaño del circulo da=: " + medidac);
return (area);}
        
public static double promnumeros(double primern, double segundonum, double tercern) {
double promedionum = (primern + segundonum + tercern) / 3;
return promedionum;}
}

//Conditions
public class condicionales {
public static String negativopositivo(double resultadopn) {
String valor;
if (resultadopn > 0) {
valor = "numero " +resultadopn + " es positivo=";
} else {
valor = "numero " +resultadopn + " es negativo=";}
return valor;}

public static String mayormen(double primern, double segundon) {
String rmayormen;
if (primern < segundon) {
rmayormen ="numero " +primern + " es menor " + segundon + " es el mayor";
}else{
rmayormen ="numero " +segundon + " es menor "  + primern + " es el mayor";}
return rmayormen;}


public static String numordenmenmayor(double primernA, double segundonA, double tercernA) {
String resultado;

if (Double.isNaN(primernA) || Double.isNaN(segundonA) || Double.isNaN(tercernA) || primernA < 0 || segundonA < 0 || tercernA < 0) {
System.out.println("seguir los pasos para buen funcionamineto");
return null;
} else {
double mayorn = primernA;
if (segundonA > mayorn) {
mayorn = segundonA;}
if (tercernA > mayorn) {
mayorn = tercernA;}
double menorn = primernA;
if (segundonA < menorn) {
menorn = segundonA;}
if (tercernA < menorn) {
menorn = tercernA;}
resultado = "numero mayor " + mayorn + " numero menor " + menorn + ".";
return resultado;}
}

public static double restsumn(double primernB, double segundonB) {
double resultado;
if (primernB < segundonB) {
resultado = primernB + segundonB;
} else {
resultado = segundonB - primernB;}
System.out.println("respuesta final: ");
return resultado;}

public static double divicionN(double primernC, double segundonC) {
double resultado;

if (segundonC == 0) {
System.out.println("no es compatible el numero 0");
resultado = Double.NaN;
} else {
resultado = primernC / segundonC;
System.out.println("resultado de los dos numero=: ");}
return resultado;}

public static double multiSum(double primernD, double segundonD) {
double resultado;
if (primernD < 0 || segundonD < 0) {
resultado = primernD + segundonD;        
System.out.println("suma de los dos digitos= "); 
} else {
resultado = primernD * segundonD;
System.out.println("multiplicacion de los digitos= "); }
return resultado;}
            
public static String bisiestofecha(Double tiempoano){
if (tiempoano % 4 == 0) {
if (tiempoano % 100 == 0) {
if (tiempoano % 400 == 0) {
return "año " + tiempoano + " bisiesto.";
} else {
return "año " + tiempoano + " no bisiesto.";}
} else {
return "año " + tiempoano + " bisiesto.";}
} else {
return "año " + tiempoano + " no bisiesto.";}
}
}
}
