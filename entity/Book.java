package entity;

public class Book {
	private int id;
	private String bookname;
	private String authorname;
	private boolean issued;
	public Book(int id,String bookname,String authorname)
	{
		this.id=id;
		this.bookname=bookname;
		this.authorname=authorname;
		this.issued=false;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public String getAuthorname() {
		return authorname;
	}
	public void setAuthorname(String authorname) {
		this.authorname = authorname;
	}
	public void setIssued(boolean issued) {
        this.issued = issued;
    }
	

}
