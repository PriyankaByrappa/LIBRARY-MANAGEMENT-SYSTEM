package repository;
import java.util.*;

import entity.member;
import ui.IMemberRepo;
public class ListMemberRepo implements IMemberRepo {
	private List<member> mems=new ArrayList<>();
	@Override
	public void addMember(member mem)
	{
		mems.add(mem);
	}
	@Override
	public member getMemberById(int id)
	{
		for(member m:mems)
		{
			if(m.getId()==id)
				return m;
		}
		return null;
	}
	@Override
	public List<member> getAllMember()
	{
		return mems;
		
	}
	

}    
