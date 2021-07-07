package Mod7Exer1Fase3;

import java.util.Scanner;

public class NewMain {

    public static void main(String[] args) {
        System.out.println("Quin tipus de vehicle vols?");
        System.out.println("1. Car");
        System.out.println("2. Bike");
    
    Scanner lector = new Scanner(System.in);
    
    int decisio = lector.nextInt();
    
    if (decisio == 1){
        Car nouCotxe = new Car("1234", "HOT", "Sireres", "Blanc");
        try{
        nouCotxe.setNombre("1234");
        }catch(Exception e){
            System.out.println("S´han de possar cuatre nombres enters!");
        }
        try{
        nouCotxe.setLletres("HOT");   
        }catch(Exception e){
            System.out.println("S´han de possar dos o tres lletres majúscules");
        }
        
        System.out.println("El cotxe té matrícula: " + nouCotxe.getMatriculaChar() +
            " " + nouCotxe.getMatriculaChar() + ", de marca: " +
             nouCotxe.getMarca() + ", i color: " + nouCotxe.getColor());
        
        Car nouCotxeRodesDarrere = new Car("Parelli", 2.2);
        try{
        nouCotxeRodesDarrere.setDiametre(2.2);
        }catch(Exception e){
        System.out.println("El diàmetre de les rodes traseres ha de ser major de 0,4 i menor de 4");
        }
        
        System.out.println("Les dues rodes traseres són de marca: " +
            nouCotxeRodesDarrere.getMarca() + ", i tenen: " +
            nouCotxeRodesDarrere.getDiametre() + " de diàmetre.");
        
        Car nouCotxeRodesDavant =new Car("Machelin", 1.9);
        try{
        nouCotxeRodesDavant.setDiametre(1.9);
        }catch(Exception e){
        System.out.println("El diàmetre de les rodes traseres ha de ser major de 0,4 i menor de 4");
        }
        
        System.out.println("Les dues rodes davanteres són de marca: " +
            nouCotxeRodesDavant.getMarca() + ", i tenen: " +
            nouCotxeRodesDavant.getDiametre() + " de diàmetre.");
        }else if(decisio == 2){
        Bike novaMoto = new Bike("9876", "MOT", "Magneti Marilli", "Negre");
        try{
        novaMoto.setNombre("9876");
        }catch(Exception e){
            System.out.println("S´han de possar cuatre nombres enters!");
        }
        try{
        novaMoto.setLletres("MOT");   
        }catch(Exception e){
            System.out.println("S´han de possar dos o tres lletres majúscules");
        }
        
        System.out.println("La moto té matrícula: " + novaMoto.getMatriculaNombre()+
            " " + novaMoto.getMatriculaChar() + ", de marca: " +
             novaMoto.getMarca() + ", i color: " + novaMoto.getColor());
        
        Bike novaMotoRodesDarrere = new Bike("Machelin", 0.9);
        try{
        novaMotoRodesDarrere.setDiametre(0.9);
        }catch(Exception e){
        System.out.println("El diàmetre de la roda del darrere ha de ser major de 0,4 i menor de 4");
        }
        
        System.out.println("Les dues rodes traseres són de marca: " +
            novaMotoRodesDarrere.getMarca() + ", i tenen: " +
            novaMotoRodesDarrere.getDiametre() + " de diàmetre.");
        
        Bike novaMotoRodesDavant = new Bike("Machelin", 0.7);
        try{
        novaMotoRodesDavant.setDiametre(0.7);
        }catch(Exception e){
            System.out.println("El diàmetre de la roda del davant ha de ser major de 0,4 i menor de 4");
        }
    
        System.out.println("Les dues rodes davanteres són de marca: " +
            novaMotoRodesDavant.getMarca() + ", i tenen: " +
            novaMotoRodesDavant.getDiametre() + " de diàmetre.");
        } else {
            System.out.println("S´ha de triar cotxe o moto!");
        }
    lector.close();
    }

}


