package server.dao;

import java.util.List;

import javax.ejb.Local;

import server.dao.entity.MemberEntity;
import server.dao.interfaces.InterfaceDao;

@Local
public interface MemberDaoLocal extends InterfaceDao<MemberEntity>{

	public List<MemberEntity> getListLastMember(int sizeList);
	
	public List<MemberEntity> getAllMembers();
	
	//public void createMember(MemberDto memberDto);
	
	public MemberEntity getMemberById(Integer id);
	
	public List<MemberEntity> getMembersByName(String name);
	
	public List<MemberEntity> getMembersByNameAndForname(String name,String forname);
	
	public List<MemberEntity> getMembersByTown(String town);
	
	public List<MemberEntity> getMembersBySupplyDemand(String type,String category);
	
	//public List<MemberDto> getMembersByData(MemberDto memberDto);
	
	//public void deleteMember(MemberDto memberDto);
	
	//public void updateMember(MemberDto memberDto);
	
	
}
