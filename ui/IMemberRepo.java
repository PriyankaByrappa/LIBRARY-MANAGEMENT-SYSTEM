package ui;
import java.util.List;
import entity.member;

public interface IMemberRepo {
	void addMember(member mem);
	List<member> getAllMember();
	member getMemberById(int id);
	

}
