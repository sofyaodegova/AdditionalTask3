public class LuciferTheCat {
    public static void main(String[] args) {

        Pets lucifer = new Pets("Люцифер", 2, "дворовый");
        String luciferName = lucifer.getName();
        int luciferAge = lucifer.getAge();
        String luciferBreed = lucifer.getBreed();

        System.out.println("Имя питомца: " + luciferName);
        System.out.println("Возраст питомца: " + luciferAge);
        System.out.println("Порода питомца: " + luciferBreed);

        lucifer.setBreed("домашний");
        System.out.println("Вы взяли кота домой. Теперь он стал " + lucifer.getBreed());

    }
}
