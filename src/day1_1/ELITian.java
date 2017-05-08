package day1_1;

import java.util.Date;

public class ELITian extends associate {

	
	
	@Override
	public String toString()
	{
		return super.toString()+"\ngroupId=" + groupId + ",\nmappedIBU=" + mappedIBU;
		
	}
	private int groupId;
	private String mappedIBU;
	public ELITian(int id, String name, Date joinDate, int gId,String IBU) {
		super(id, name, joinDate);
		this.groupId=gId;
		this.mappedIBU=IBU;
	}
	
	
	
	
	
}
