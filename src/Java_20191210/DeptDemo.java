package Java_20191210;

import java.util.ArrayList;

import Java_20191210.dao.DeptDAO;
import Java_20191210.dto.DeptDTO;

public class DeptDemo {
	public static void main(String[] args) {
		DeptDAO d = DeptDAO.getInstance();
		//boolean isSuccess = d.insert(new DeptDTO(60,"DEVELOPERS","TEXAS"));
		//System.out.println(isSuccess);
		
		boolean isSuccess = d.update(new DeptDTO(60,"DEVELOPERS","LA"));
		System.out.println(isSuccess);
		
/*		boolean isSuccess = d.delete(50);
		System.out.println(isSuccess);*/
		
		/*ArrayList<DeptDTO> list = d.select();
		for (DeptDTO dto : list) {
			System.out.printf("%d, %s, %s %n", dto.getNo(), dto.getName(), dto.getLoc());
		}*/
		
		/*DeptDTO dto = d.select(10);
		if(dto == null){
			System.out.println("데이터가 존재하지 않습니다.");
		}else{
			System.out.printf("%d, %s, %s %n", dto.getNo(), dto.getName(), dto.getLoc());
		}*/
		
	}
}
