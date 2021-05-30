package project;

enum Format {
    EPUB, 
    PDF, 
    HTML5
}


class Ebook extends Book
{
    private byte storageSize;
    private Format format;

    public Ebook(byte storageSize, Format format, String title, String ISBN, short releaseYear, Author author) {
        super(title, ISBN, releaseYear, author);
        this.storageSize = storageSize;
        this.format = format;
    }

    public byte getStorageSize() {
        return storageSize;
    }

    public void setStorageSize(byte storageSize) {
        this.storageSize = storageSize;
    }

    public Format getFormat() {
        return format;
    }

    public void setFormat(Format format) {
        this.format = format;
    }
   
    
}