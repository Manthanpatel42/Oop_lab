class BookNotAvailableException extends Exception {
    BookNotAvailableException(String msg) {
        super(msg);
    }
}

class Library {
    int availableBooks;

    Library(int books) {
        availableBooks = books;
    }

    void issueBook(int count) throws BookNotAvailableException {
        if (count <= availableBooks) {
            availableBooks -= count;
            System.out.println("Book issued successfully");
        } else {
            throw new BookNotAvailableException("Requested books not available");
        }
    }

    public static void main(String[] args) {
        Library l = new Library(3);

        try {
            l.issueBook(2);
            l.issueBook(2);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}