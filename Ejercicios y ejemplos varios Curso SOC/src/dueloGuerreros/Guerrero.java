package dueloGuerreros;

import java.util.Random;

public class Guerrero {

    // Atributos del guerrero:
    // attack: daño base que puede infligir
    // defense: reduce el daño recibido
    // lifePoints: puntos de vida actuales
    // name: nombre del guerrero
    // speed: determina el orden de turno
    // dexterity: probabilidad (%) de acertar el ataque
    int attack;
    int defense;
    int lifePoints;
    String name;
    int speed;
    int dexterity;

    // Constructor para inicializar un guerrero con todos sus atributos
    public Guerrero(int attack, int defense, int lifePoints, String name, int speed, int dexterity) {

        this.attack = attack;
        this.defense = defense;
        this.lifePoints = lifePoints;
        this.name = name;
        this.speed = speed;
        this.dexterity = dexterity;
    }

    // Muestra las estadísticas actuales del guerrero en consola
    public void showStats() {

        System.out.printf("\nNombre: %s\nVida: %d\nAtaque: %d\nDefensa: %d\nVelocidad: %d\nDestreza: %d\n",this.name, this.lifePoints, this.attack, this.defense, this.speed, this.dexterity);
    }

    // Lógica de ataque a otro guerrero
    public void atacar(Guerrero oponente) {
        Random random = new Random();
        int numeroRandom = random.nextInt(101); // número aleatorio de 0 a 100

        // Si el oponente ya está muerto, no se puede atacar
        if (oponente.isAlive() == false) {
            System.out.printf("\n%s ya no puede atacar a %s porque está muerto", this.name, oponente.getName());
            return;
        } else {
            // Comprobación de tirada de destreza: si el número aleatorio es menor o igual a la destreza, el ataque acierta
            if (numeroRandom <= this.dexterity) {
                // El daño se calcula como ataque del atacante menos defensa del oponente
                int damage = this.getAttack() - oponente.getDefense();
                if (damage <= 0) {
                    // Si la defensa supera o iguala el ataque, no se hace daño
                    System.out.println("La defensa del enemigo es demasiado alta!");
                    return;
                } else {
                    // Se aplica el daño a los puntos de vida del oponente
                    int lifeBeforeAttack = oponente.getLifePoints() - damage;
                    oponente.setLifePoints(lifeBeforeAttack);
                    // Se asegura que la vida no sea negativa
                    if (oponente.getLifePoints() <= 0) {
                        oponente.setLifePoints(0);
                    }
                    // Mensaje de resultado del ataque
                    System.out.printf("\n%s ha realizado %d puntos de daño a %s y le queda %d de vida", this.name, damage, oponente.getName(), oponente.getLifePoints());
                }
            } else {
                // Fallo del ataque por no superar la tirada de destreza
                System.out.printf("\n%s fallaste la tirada de destreza y fallaste el ataque", this.name);
            }
        }
    }

    // Indica si el guerrero sigue con vida (vida > 0)
    public boolean isAlive() {

        if (this.getLifePoints() <= 0) {
            return false;
        } else {
            return true;
        }
    }

    // Getters y setters de los atributos
    public int getAttack() {
        return attack;
    }
    public void setAttack(int attack) {
        this.attack = attack;
    }
    public int getDefense() {
        return defense;
    }
    public void setDefense(int defense) {
        this.defense = defense;
    }
    public int getLifePoints() {
        return lifePoints;
    }
    public void setLifePoints(int lifePoints) {
        this.lifePoints = lifePoints;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public int getDexterity() {
        return dexterity;
    }
    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

}