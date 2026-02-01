package repository;
import java.util.*;
import entity.*;
import ui.*;
public class ListTransactionRepo implements ITransactionRepo  {
    private IBookRepo bookRepo;
    public ListTransactionRepo(IBookRepo bookRepo)
    {
    	this.bookRepo=bookRepo;
    }
	public void issueBook(transaction t)
	{
		Book book=bookRepo.getBookById(t.getBookId());
		if(book != null && ! book.isIssued()  )
		{
			book.setIssued(true);
			System.out.println("Book issued successfully");
		}
		else
		{
			System.out.println("Book unavailable");
		}
			
		}
	}

}
