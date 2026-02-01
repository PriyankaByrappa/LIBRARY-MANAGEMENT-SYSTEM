package entity;

public class transaction {
	private int memberId;
	private int bookId;
	public transaction(int memberId, int bookId) {
		
		this.memberId = memberId;
		this.bookId = bookId;
	}
	public int getMemberId() {
		return memberId;
	}
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	
	

}
