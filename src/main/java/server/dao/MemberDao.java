package server.dao;

import java.util.List;

import server.dao.interfaceDao.InterfaceDao;
import shared.MemberDto;

public interface MemberDao extends InterfaceDao<MemberDto>{

	public List<MemberDto> getListLastMember(int sizeList);
	
	//public void createMember(MemberDto memberDto);
	
	public MemberDto getMemberById(Integer id);
	
	public List<MemberDto> getMembersByName(String name);
	
	public List<MemberDto> getMembersByNameAndForname(String name,String forname);
	
	public List<MemberDto> getMembersByTown(String town);
	
	public List<MemberDto> getMembersBySupplyDemand(String type,String category);
	
	public List<MemberDto> getMembersByData(MemberDto memberDto);
	
	//public void deleteMember(MemberDto memberDto);
	
	//public void updateMember(MemberDto memberDto);
	
	
}
