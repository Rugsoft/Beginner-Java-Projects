package dueloGuerreros;

public class Main {

    public static void main(String[] args) {

        // Se crean dos guerreros con sus atributos:
        // (ataque, defensa, puntos de vida, nombre, velocidad, destreza)
        Guerrero Kelemvor = new Guerrero(14, 5, 55, "Kelemvor", 20, 80);
        Guerrero Darius = new Guerrero(12, 6, 60, "Darius", 25, 70);

        // Mostrar las estadísticas iniciales de ambos combatientes
        Kelemvor.showStats();
        Darius.showStats();

        // Bucle del combate: continúa mientras ambos estén vivos
        while (Kelemvor.isAlive() && Darius.isAlive()) {

            // El que tenga mayor velocidad ataca primero
            if(Kelemvor.getSpeed() > Darius.getSpeed()) {

                // Kelemvor ataca primero
                Kelemvor.atacar(Darius);
                // Si Darius muere con el ataque, se termina el combate
                if (Darius.isAlive() == false) {
                    break;
                } else {
                    // Si sigue vivo, Darius contraataca
                    Darius.atacar(Kelemvor);
                }
            } else {

                // Darius ataca primero (incluye el caso de igualdad de velocidad)
                Darius.atacar(Kelemvor);
                // Si Kelemvor muere con el ataque, se termina el combate
                if (Kelemvor.isAlive() == false) {
                    break;
                } else {
                    // Si sigue vivo, Kelemvor contraataca
                    Kelemvor.atacar(Darius);
                }
            }

        }

        // Mensaje final indicando el vencedor
        if (Kelemvor.isAlive()) {
            System.out.println("\nKelemvor es el vencedor");
        } else {
            System.out.println("\nDarius es el vencedor");
        }

    }

}