package project;


class PrintCopyBook extends Book
{
    private short numberOfPages;
    private byte  physicalWeight;

    public PrintCopyBook(short numberOfPages, byte physicalWeight, String title, String ISBN, short releaseYear, Author author) {
        super(title, ISBN, releaseYear, author);
        this.numberOfPages = numberOfPages;
        this.physicalWeight = physicalWeight;
    }

    public short getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(short numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public byte getPhysicalWeight() {
        return physicalWeight;
    }

    public void setPhysicalWeight(byte physicalWeight) {
        this.physicalWeight = physicalWeight;
    }

}
