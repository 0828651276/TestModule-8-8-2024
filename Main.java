public class Main {
    public static void main(String[] args) {
        ProgrammingBook pb1 = new ProgrammingBook("PB001", "Java Basics", 300, "Author A", "Java", "Spring");
        ProgrammingBook pb2 = new ProgrammingBook("PB002", "Advanced Java", 400, "Author B", "Java", "Hibernate");
        ProgrammingBook pb3 = new ProgrammingBook("PB003", "Python Basics", 250, "Author C", "Python", "Django");

        FictionBook fb1 = new FictionBook("FB001", "Fiction One", 200, "Author D", "Fantasy");
        FictionBook fb2 = new FictionBook("FB002", "Fiction Two", 150, "Author E", "Horror");
        FictionBook fb3 = new FictionBook("FB003", "Fiction Three", 180, "Author F", "Sci-Fi");

        double totalAmount = pb1.getAmount() + pb2.getAmount() + pb3.getAmount()
                + fb1.getAmount() + fb2.getAmount() + fb3.getAmount();

        System.out.println("Total amount for all books: " + totalAmount);

        int javaBookCount = 0;
        ProgrammingBook[] programmingBooks = {pb1, pb2, pb3};
        for (ProgrammingBook book : programmingBooks) {
            if ("Java".equalsIgnoreCase(book.getLanguage())) {
                javaBookCount++;
            }
        }

        System.out.println("Number of ProgrammingBooks with language 'Java': " + javaBookCount);
    }
}
