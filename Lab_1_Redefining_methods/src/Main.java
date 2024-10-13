public class Main {
    public static void main(String[] args) {
        Star sun = new Star("Млечный путь");
        StarSystem solarSystem = new StarSystem(sun);

        Planet mercury = new Planet("Меркурий");
        solarSystem.addPlanet(mercury);

        Planet venus = new Planet("Венера");
        solarSystem.addPlanet(venus);

        Planet earth = new Planet("Земля");
        earth.addMoon(new Moon("Луна"));
        solarSystem.addPlanet(earth);

        Planet mars = new Planet("Марс");
        mars.addMoon(new Moon("Фобос"));
        mars.addMoon(new Moon("Деймос"));
        solarSystem.addPlanet(mars);

        Planet jupiter = new Planet("Юпитер");
        jupiter.addMoon(new Moon("Ио"));
        jupiter.addMoon(new Moon("Европа"));
        jupiter.addMoon(new Moon("Ганимед"));
        jupiter.addMoon(new Moon("Каллисто"));
        solarSystem.addPlanet(jupiter);

        Planet saturn = new Planet("Сатурн");
        saturn.addMoon(new Moon("Титан"));
        saturn.addMoon(new Moon("Рея"));
        saturn.addMoon(new Moon("Энцелад"));
        solarSystem.addPlanet(saturn);

        Planet uranium = new Planet("Уран");
        uranium.addMoon(new Moon("Миранда"));
        uranium.addMoon(new Moon("Ариэль"));
        uranium.addMoon(new Moon("Титания"));
        uranium.addMoon(new Moon("Оберон"));
        solarSystem.addPlanet(uranium);

        Planet neptune = new Planet("Нептун");
        neptune.addMoon(new Moon("Тритон"));
        neptune.addMoon(new Moon("Нереида"));
        neptune.addMoon(new Moon("Протей"));
        solarSystem.addPlanet(neptune);

        solarSystem.printSystemInfo();
    }
}