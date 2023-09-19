import java.util.Scanner;

public class CuerposGeometricos {
    public static void main(String[] args) throws Exception {
        Scanner leye = new Scanner(System.in);

         int CantidadLados;
         double Radio, Altura, AreaLateral, AreaTotal;
        double PerimetroBase, AreaBase, Apotema, ApotemaPiramide;
        double Num5 = 5;
        double Area, Volumen, LongitudLados, Generatriz, RadioMayor;
         double NumeroGrados;
        double AreaHuso, VolumenCuna;
        double MedidaA, MedidaB, MedidaC, LongitudPenta, APenta;
        double Diagonal;
        double Num1 = 3;
        double Num2 = 2;
        double Num6 = 6;
        double Gene, RadioMayorr, RadioMenor, AreaMayorTAreaMenor;
        double PerimetroMayor, PerimetroMenor; // Perimetro base mayor, Perimetro base menor
        double AreaBaseMayor, AreaBaseMenor, LongitudAristas;


        System.out.println("a) Prisma ");
        System.out.println("b) Cilindro");
        System.out.println("c) Piramide");
        System.out.println("d) Cono");
        System.out.println("e) Esfera");
        System.out.println("f) Zona esferica");
        System.out.println("g) Casquete esferico");
        System.out.println("h) Huso esferico y cuna esferica");
        System.out.println("i) Ortoedro");
        System.out.println("j) Tetraedro");
        System.out.println("k) Hexaedro");
        System.out.println("l) Octaedro");
        System.out.println("m) Dodecaedro");
        System.out.println("n) Icosaedro");
        System.out.println("o) Tronco de cono");
        System.out.println("p) Tronco de piramide");
        System.out.println("q) Salir");

        char opc = leye.next().charAt(0);
        switch (opc) {
            
            case 'a':

        System.out.print("Cantidad de lados: ");
        CantidadLados = leye.nextInt();
        System.out.print("Altura: ");
        Altura = leye.nextDouble();
        System.out.print("Longitud de lados: ");
        LongitudLados = leye.nextDouble();

        PerimetroBase = CantidadLados * LongitudLados;
        AreaLateral = PerimetroBase * Altura;
        double beta = (Math.PI/180) * (360/CantidadLados);
        Apotema = LongitudLados / (2 * Math.tan((beta)/2));
        AreaBase = (PerimetroBase * Apotema) /2;
        AreaTotal = AreaLateral + 2 * AreaBase;
        Volumen = AreaBase * Altura;

        System.out.println("Area Lateral: " + AreaLateral + "unidades cuadradas.");
        System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::");
        System.out.println("Area Total: " + AreaTotal + "unidades cuadradas.");
        System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::");
        System.out.println("Volumen: " + Volumen + "unidades cubicas.");

           break;

           case 'b':

        System.out.print("Radio: ");
        Radio = leye.nextDouble();
        System.out.print("Altura: ");
        Altura = leye.nextDouble();

        PerimetroBase = (2 * Math.PI * Radio);
        AreaLateral = PerimetroBase * Altura;
        AreaBase = (Math.PI * Radio * Radio);
        AreaTotal = (AreaLateral) + (2 * AreaBase);
        Volumen = (AreaBase * Altura);

        System.out.println("Area Lateral: " + AreaLateral + "unidades cuadradas.");
        System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::");
        System.out.println("Area Total: " + AreaTotal + "unidades cuadradas.");
        System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::");
        System.out.println("Volumen: " + Volumen + "unidades cubicas.");

           break;

           case 'c':

        System.out.print("Cantidad de lados: ");
        CantidadLados = leye.nextInt();
        System.out.print("Perimetro de la base: ");
        PerimetroBase = leye.nextDouble();
        System.out.print("Altura: ");
        Altura = leye.nextDouble();
        System.out.print("Longitud de lados: ");
        LongitudLados = leye.nextDouble();

        double delta = (Math.PI/180) * (360/CantidadLados);
        Apotema = LongitudLados / (2 * Math.tan((delta)/2));
        ApotemaPiramide = (Altura * Altura) + (Apotema * Apotema);
        AreaLateral = (PerimetroBase * ApotemaPiramide) / 2;
        AreaBase = PerimetroBase * Altura;
        AreaTotal = AreaLateral + AreaBase;
        Volumen = (AreaBase * Altura) / 3;

        System.out.println("Area Lateral: " + AreaLateral + "unidades cuadradas.");
        System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::");
        System.out.println("Area Total: " + AreaTotal + "unidades cuadradas.");
        System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::");
        System.out.println("Volumen: " + Volumen + "unidades cubicas.");

           break;

           case 'd':

        System.out.print("Radio: ");
        Radio = leye.nextDouble();
        System.out.print("Altura: ");
        Altura = leye.nextDouble();

        Generatriz = (Altura * Altura) + (Radio * Radio);
        AreaLateral = (Math.PI * Radio * Generatriz);
        AreaBase = (Math.PI) * (Radio * Radio);
        AreaTotal = AreaLateral + AreaBase;
        Volumen = (AreaBase * Altura) / 3;

        System.out.println("Area Lateral: " + AreaLateral + "unidades cuadradas.");
        System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::");
        System.out.println("Area Total: " + AreaTotal + "unidades cuadradas.");
        System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::");
        System.out.println("Volumen: " + Volumen + "unidades cubicas."); 

           break;

           case 'e':

        System.out.print("Radio: ");
        Radio = leye.nextDouble();

        Area = 4 * Math.PI * (Radio * Radio);
        Volumen = (4 / 3) * Math.PI * (Radio * Radio * Radio);

        System.out.println("Area: " + Area + "unidades cuadradas.");
        System.out.println(":::::::::::::::::::::::::::::::::::::::::");
        System.out.println("Volumen: " + Volumen + "unidades cubicas."); 

           break;

           case 'f':

        System.out.print("Altura: ");
        Altura = leye.nextDouble();
        System.out.print("Radio Mayor: ");
        RadioMayor = leye.nextDouble();
        System.out.print("Radio: ");
        Radio = leye.nextDouble();

        double lota = (Altura * Altura);
        double chi = (3 * (Radio * Radio));
        double alpha = (3 * (Radio * Radio));
        Area = (2 * Math.PI * RadioMayor * Altura);
        Volumen = Math.PI * Altura * ((lota) + (chi) + (alpha)) / 6;

        System.out.println("Area: " + Area + "unidades cuadradas.");
        System.out.println(":::::::::::::::::::::::::::::::::::::::::");
        System.out.println("Volumen: " + Volumen + "unidades cubicas.");


           break;

           case 'g':

        System.out.print("Radio mayor: ");
        RadioMayor = leye.nextDouble();
        System.out.print("Altura: ");
        Altura = leye.nextDouble();

        Area = (2 * Math.PI * RadioMayor * Altura);
        double xi = (3 * RadioMayor);
        Volumen = Math.PI * (Altura * Altura) * ((xi) - Altura) / 3;

        System.out.println("Area: " + Area + "unidades cuadradas.");
        System.out.println(":::::::::::::::::::::::::::::::::::::::::");
        System.out.println("Volumen: " + Volumen + "unidades cubicas.");

           break;

           case 'h':

        System.out.print("Radio: ");
        Radio = leye.nextDouble();
        System.out.print("Numero de grados: ");
        NumeroGrados = leye.nextDouble();

        AreaHuso = 4 * Math.PI * (Radio * Radio) * NumeroGrados / 360;
        double nu = Math.PI * (Radio * Radio * Radio);
        VolumenCuna = 4 / 3 * ((nu) * NumeroGrados) / 360;

        System.out.println("Area Huso: " + AreaHuso + "unidades cuadradas.");
        System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::");
        System.out.println("Volumen Cuña: " + VolumenCuna + "unidades cubicas.");

           break;

           case 'i':

        System.out.print("Medida de A: ");
        MedidaA = leye.nextDouble();
        System.out.print("Medida de B: ");
        MedidaB = leye.nextDouble();
        System.out.print("Medida de C: ");
        MedidaC = leye.nextDouble();

        double zeta = (MedidaA * MedidaB);
        double eta = (MedidaA * MedidaC);
        double tau = (MedidaB * MedidaC);
        Area = 2 * ((zeta) * (eta) * (tau));
        Volumen = (MedidaA * MedidaB * MedidaC);
        double Kappa = (MedidaA * MedidaA);
        double theta = (MedidaB * MedidaB);
        double sigma = (MedidaC * MedidaC);
        double omega = ((Kappa) + (theta) + (sigma));
        Diagonal = Math.sqrt((omega));

        System.out.println("Area: " + Area + "unidades cuadradas.");
        System.out.println(":::::::::::::::::::::::::::::::::::::::::");
        System.out.println("Volumen: " + Volumen + "unidades cubicas");
        System.out.println(":::::::::::::::::::::::::::::::::::::::::");
        System.out.println("Diagonal: " + Diagonal );

           break; 

           case 'j':

        System.out.print("Longitud de las aristas: ");
        LongitudAristas = leye.nextDouble();

        Area = (Math.pow(LongitudAristas, 2)) * Math.sqrt(Num1);
        Volumen = Math.sqrt(Num2) / 12 * (Math.pow(LongitudAristas, 2));
        Altura = LongitudAristas * (Math.sqrt(Num6) / 3); 
        
        System.out.println("Area: " + Area + "unidades cuadradas.");
        System.out.println("::::::::::::::::::::::::::::::::::::::::::");
        System.out.println("Volumen: " + Volumen + "unidades cubicas.");
        System.out.println("::::::::::::::::::::::::::::::::::::::::::");
        System.out.println("Altura: " + Altura );

           break;

           case 'k':

        System.out.print("Longitud de las aristas: ");
        LongitudAristas = leye.nextDouble();

        Area = 6 * (Math.pow(LongitudAristas, 2));
        Volumen = Math.pow(LongitudAristas, 3);
        Diagonal = LongitudAristas * Math.sqrt(Num1);

        System.out.println("Area: " + Area + "unidades cuadradas.");
        System.out.println(":::::::::::::::::::::::::::::::::::::::::");
        System.out.println("Volumen: " + Volumen + "unidades cubicas.");
        System.out.println(":::::::::::::::::::::::::::::::::::::::::");
        System.out.println("Diagonal: " + Diagonal );

           break; 

           case 'l':

        System.out.print("Longitud de las aristas: ");
        LongitudAristas = leye.nextDouble();

        Area = 2 * (Math.pow(LongitudAristas, 2)) * Math.sqrt(Num1);
        Volumen = Math.sqrt(Num2) / 3 * (Math.pow(LongitudAristas, 3));

        System.out.println("Area: " + Area + "unidades cuadradas.");
        System.out.println(":::::::::::::::::::::::::::::::::::::::::");
        System.out.println("Volumen: " + Volumen + "unidades cubicas.");

           break;

           case 'm':

        System.out.print("Longitud de aristas: ");
        LongitudAristas = leye.nextDouble();
        System.out.print("Valor de la apotema: ");
        Apotema = leye.nextDouble();
        System.out.print("Longitud del lado pentagonal: ");
        LongitudPenta = leye.nextDouble();
        
        APenta = 5 * LongitudPenta * Apotema / 2;
        double epsilon = (25 + (10 * Math.sqrt(Num5)));
        Area = 3 * (Math.pow(LongitudAristas, 2)) * (Math.sqrt(epsilon));
        Volumen = (15 + 7 * Math.sqrt(Num5)) * Math.pow(LongitudAristas, 3) / 4;

        System.out.println("Area: " + Area + "unidades cuadradas.");
        System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::");
        System.out.println("Area Pentagonal: " + APenta + "unidades cuadradas.");
        System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::");
        System.out.println("Volumen: " + Volumen + "unidades cubicas.");

           break;

           case 'n':

        System.out.print("Longitud de las aristas: ");
        LongitudAristas = leye.nextDouble();

        Area = 5 * (Math.pow(LongitudAristas, 2)) * (Math.sqrt(Num1));
        
        Volumen = 5 * (3 + Math.sqrt(Num5)) * (Math.pow(LongitudAristas, 3)) / 12;

        System.out.println("Area: " + Area + "unidades cuadradas.");
        System.out.println(":::::::::::::::::::::::::::::::::::::::");
        System.out.println("Volumen: " + Volumen + "unidades cubicas.");

           break;

           case 'o':

        System.out.print("Valor de la Altura: ");
        Altura = leye.nextDouble();
        System.out.print("Radio mayor: ");
        RadioMayor = leye.nextDouble();
        System.out.print("Radio menor: ");
        RadioMenor = leye.nextDouble();


        double rat = Math.pow(RadioMayor - RadioMenor, 2);
        Gene = (Math.sqrt(Math.pow(Altura, 2) + rat));
        AreaLateral = Math.PI * Gene * (RadioMayor + RadioMenor);
        AreaMayorTAreaMenor = Math.PI * (Math.pow(RadioMayor,  2) + Math.pow(RadioMenor, 2));
        AreaTotal = AreaLateral + AreaMayorTAreaMenor;
        Volumen = Math.PI * Altura / 3 * (Math.pow(RadioMayor, 2) + Math.pow(RadioMenor, 2) + RadioMayor * RadioMenor);

        System.out.println("Area Lateral: " + AreaLateral + "unidades cuadradas.");
        System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::");
        System.out.println("Area Total: " + AreaTotal + "unidades cuadradas.");
        System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::");
        System.out.println("Volumen: " + Volumen + "unidades cubicas.");

           break;

           case 'p':

        System.out.print("Valor de la apotema: ");
        Apotema = leye.nextDouble();
        System.out.print("Perimetro base mayor: ");
        PerimetroMayor = leye.nextDouble();
        System.out.print("Perimetro base menor: ");
        PerimetroMenor = leye.nextDouble();
        System.out.print("Altura: ");
        Altura = leye.nextDouble();
        System.out.print("Area base mayor: ");
        AreaBaseMayor = leye.nextDouble();
        System.out.print("Area base menor: ");
        AreaBaseMenor = leye.nextDouble();

        AreaLateral = PerimetroMayor + PerimetroMenor / 2 * Apotema;
        AreaTotal = AreaLateral + AreaBaseMayor + AreaBaseMenor; 
        Volumen = Altura / 3 * (AreaBaseMayor + AreaBaseMenor + Math.sqrt(AreaBaseMayor * AreaBaseMenor));

        System.out.println("Area lateral: " + AreaLateral + "unidades cuadradas.");
        System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::");
        System.out.println("Area Total: " + AreaTotal + "unidades cuadradas.");
        System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::");
        System.out.println("Volumen: " + Volumen + "unidades cubicas.");


           break;

           case 'q':
           System.out.println("Saliendo de la App");

           break;

            default:
                System.out.println("Opcion incorrecta/no valida.");
                System.out.println("Saliendo de la App");
                break;



        }

        leye.close();
    }
}
