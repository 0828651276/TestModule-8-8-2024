public class Main {
    public static void main(String[] args) {
        ProgrammingBook pb1 = new ProgrammingBook("PB001", "Java Basics", 300, "Author A", "Java", "Spring");
        ProgrammingBook pb2 = new ProgrammingBook("PB002", "Advanced Java", 400, "Author B", "Java", "Hibernate");
        ProgrammingBook pb3 = new ProgrammingBook("PB003", "Python Basics", 250, "Author C", "Python", "Django");

        FictionBook fb1 = new FictionBook("FB001", "Fiction One", 200, "Author D", "Fantasy");
        FictionBook fb2 = new FictionBook("FB002", "Fiction Two", 150, "Author E", "Horror");
        FictionBook fb3 = new FictionBook("FB003", "Fiction Three", 180, "Author F", "Sci-Fi");

        Book[] books = {pb1, pb2, pb3, fb1, fb2, fb3};
        double totalAmount = 0;
        for (Book book : books) {
            totalAmount += book.getPrice() * book.getAmount();
        }

        System.out.println("Total amount for all books: " + totalAmount);

        int javaBookCount = 0;
        ProgrammingBook[] programmingBooks = {pb1, pb2, pb3};
        for (ProgrammingBook book : programmingBooks) {
            if ("Java".equalsIgnoreCase(book.getLanguage())) {
                javaBookCount++;
            }
        }

        System.out.println("Number of ProgrammingBooks with language 'Java': " + javaBookCount);

        int FictionCount = 0;
        FictionBook[] fictionBooks = {fb1, fb2, fb3};
        for (FictionBook book : fictionBooks) {
            if ("Fiction One".equalsIgnoreCase(book.getName())) {
                FictionCount++;
            }
        }

        System.out.println("Number of Fictions: " + FictionCount);

        int FictionPrice = 0;
        for (FictionBook book : fictionBooks) {
            if (book.getPrice() >100){
                FictionPrice++;
            }
        }
        System.out.println("Number > 100:" +FictionPrice);
    }
}
