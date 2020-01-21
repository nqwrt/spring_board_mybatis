package edu.bit.board.mapper;

import java.util.ArrayList;

import edu.bit.board.vo.DeptEmpVO;
import edu.bit.board.vo.EmpVO;




public interface EmpMapper {

	
	public ArrayList<EmpVO> selectAllEmpList();
	
	public DeptEmpVO selectEmpDeptName(int deptno);
	
/*	@Select("select * from users where username = #{username} and password = #{password}")
	public UserVO logInUser(@Param("username") String username,@Param("password") String password);*/
	
}
