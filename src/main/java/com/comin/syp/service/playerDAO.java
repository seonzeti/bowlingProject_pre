package com.comin.syp.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class playerDAO {

	// DAO (Data Access Object) DB를 사용해 데이터를 조회하거나 조작하는 기능
	// 사용자는 자신이 필요한 Interface를 DAO에게 던지고, DAO는 이 인터페이스를 구현한 객체를 사용자에게 편리하게 사용할 수 있도록
	// 반환해준다.

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String url = "jdbc:mariadb://localhost:3308/mysql";
		String sql = "SELECT * FROM bowling.yp_player";

		// 클래스를 객체화, 드라이버를 로드
		Class.forName("org.mariadb.jdbc.Driver");
		// 실행 도구 생성
		Connection con = DriverManager.getConnection(url, "root", "5741");
		// 연결 객체를 얻음
		Statement st = con.createStatement();
		// 쿼리를 실행하여 결과 집합을 얻어온다.
		ResultSet rs = st.executeQuery(sql);

		if (rs.next()) { // 다음 값을 가져옴 Bof ~ Eof
			String ex1 = rs.getString(1);
			System.out.println(ex1);
		}

		rs.close();
		st.close();
		con.close();
	}

}
