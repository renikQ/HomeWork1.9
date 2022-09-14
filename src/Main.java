public class Main {
    public static void main(String[] args) {
        Author dostoevsky = new Author("Фёдор", "Достоевский");
        Book moron = new Book("Идиот", dostoevsky, 1869);
        Author tolstoy = new Author("Лев", "Толстой");
        Book warAndPeacePartOneTolstoy = new Book("Война и мир", tolstoy, 1973);
        Book aKarenina = new Book("Анна Каренина", tolstoy, 1878);
        System.out.println(moron.getBookName());
        aKarenina.setPublishingYear(2005);
        System.out.println(aKarenina.getPublishingYear());
        System.out.println(warAndPeacePartOneTolstoy.equals(aKarenina));
        System.out.println(moron);
        System.out.println(dostoevsky);
        System.out.println(dostoevsky.equals(tolstoy));

    }
}