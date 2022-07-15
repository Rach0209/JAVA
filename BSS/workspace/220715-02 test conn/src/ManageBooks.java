import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import kr.co.greenart.dbutil.DBUtil;

/*
 * my_db.books
 * (콘솔 작업 => 데이터베이스에 정보 적용)
 * 도서 관리 프로그램
 * 기능: 추가
 * 전체 목록
 * (아이디나 제목이나 가격 등으로 검색 가능)
 * 삭제
 * 수정
*/

public class ManageBooks {
	// DB 메소드 편하게 만들기
	public static void readyForDB(String query) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		try {
			conn = DBUtil.getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(query);

			while (rs.next()) {
				int result = rs.getInt("BookId");
				String title = rs.getString("Title");
				String price = rs.getString("Price");
				System.out.println("책ID : " + result + "제목 : " + title + "가격 : " + price);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.closeRS(rs);
			DBUtil.closeStmt(stmt);
			DBUtil.closeConn(conn);
		}
	}

	// ******************************** 조회 옵션 **************************************
	// 책 이름 포함된 글자로 찾는 필터 검색;
	public static String searchForTitle(String title) {
		title = "SELECT * FROM books " + "WHERE Title " + "LIKE '%" + title + "%';";
		return title;
	}

	// 책 id로 찾기.
	public static String searchForId(int id) {
		String findId = "SELECT * FROM books WHERE BookId = " + id + ";";
		return findId;
	}

	public static String orderByDesc(int order) {
		if (order == 1) {
			String desc = "SELECT * FROM books ORDER BY Price DESC;";
			return desc;
		} else {
			String asc = "SELECT * FROM books ORDER BY Price;";
			return asc;
		}
	}

	// 책 전체 목록(id, title, price) 가져오기
	public static void searchAllBooks() {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		try {
			conn = DBUtil.getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery("SELECT * FROM books;");

			while (rs.next()) {
				int result = rs.getInt("BookId");
				String title = rs.getString("Title");
				String price = rs.getString("Price");
				System.out.println("책ID : " + result + "제목 : " + title + "가격 : " + price);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.closeRS(rs);
			DBUtil.closeStmt(stmt);
			DBUtil.closeConn(conn);
		}
	}

	// ******************************** 추가, 수정, 삭제 ***************************************
	public static void editForDB(String query) {
		Connection conn = null;
		Statement stmt = null;

		try {
			conn = DBUtil.getConnection();
			stmt = conn.createStatement();
			stmt.executeUpdate(query);

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.closeStmt(stmt);
			DBUtil.closeConn(conn);
		}
	}

	// 책 추가하기
	public static String addBooks(String title, int price) {
		String query = "INSERT INTO books (Title, Price) VALUES ('" + title + "', " + price + ");";
		return query;
	}

	// 책 삭제하기
	public static String deleteBooks(int id) {
		String query = "DELETE FROM books WHERE BookId = " + id + ";";
		return query;
	}

	// 책 수정하기 (제목)
	public static String editTitle(String title, int id) {
		String query = "UPDATE books SET Title = '" + title + "'" + "WHERE BookId = " + id + "";
		return query;
	}
	// 책 수정하기 (가격)
	public static String editPrice(int price, int id) {
		String query = "UPDATE books SET Price = " + price + "WHERE BookId = " + id + "";
		return query;
	}
	// 책 정보 전체 수정 (제목, 가격)
	public static String editAll(String title, int price, int id) {
		String query = "UPDATE books SET Title = '" + title + "', " + "Price = " + price + " WHERE BookId = " + id + "";
		return query;
	}

	public static void main(String[] args) {
		// 시스템 시작.
		while (true) {
			System.out.println("****************************** Welcome to MOB(Manage Of Books) ******************************");
			System.out.println("---------------------------------------------------------------------------------------------");
			System.out.println("---------------------------------------------------------------------------------------------");
			System.out.println("1. 전체 목록\t 2. 검색 필터\t 3. 도서 추가\t 4. 도서 삭제\t 5. 도서 수정\t 0. 프로그램 종료");
			Scanner scan = new Scanner(System.in);
			int menuInput = scan.nextInt();
			switch (menuInput) {
			case 1:
				searchAllBooks();
				System.out.println();
				break;
			case 2:
				while (true) {
					System.out.println("1. 책ID로 검색\t 2. 책 이름포함\t 3. 책 가격순\t 0. 상위 메뉴");
					int subMenu = scan.nextInt();
					scan.nextLine();
					switch (subMenu) {
					case 1:
						System.out.println("책 ID를 입력하세요. 1~8번까지 있음 3번 없음.");
						int id = scan.nextInt();
						scan.nextLine();
						readyForDB(searchForId(id));
						break;
					case 2:
						System.out.println("책 이름에 포함될 글자를 입력하세요.");
						String str = scan.nextLine();
						readyForDB(searchForTitle(str));
						break;
					case 3:
						System.out.println("1. 높은가격순\t 2. 낮은가격순\t 다른번호 입력하면 높은가격순으로 보여줍니다");
						int order = scan.nextInt();
						scan.nextLine();
						readyForDB(orderByDesc(order));
						break;
					case 0:
						System.out.println("상위 메뉴");
						System.out.println("\n");
						break;
					default:
						System.out.println("잘못된 값입니다.");
						System.out.println();
						continue;
					}
					System.out.println();
					break;
				}
				break;
			case 3:
				System.out.println("추가할 제목과 가격을 입력하세요.");
				String title = scan.nextLine();
				scan.nextLine();
				int price = scan.nextInt();
				scan.nextLine();
				editForDB(addBooks(title, price));
				System.out.println("책이 추가 되었습니다.");
				System.out.println();
				break;
			case 4:
				searchAllBooks();
				System.out.println("삭제할 책의 id를 입력해주세요.");
				int deleteId = scan.nextInt();
				scan.nextLine();
				editForDB(deleteBooks(deleteId));
				System.out.println("책이 삭제되었습니다.");
				System.out.println();
				break;
			case 5:
				while (true) {
					System.out.println("1. 제목 수정\t 2. 가격 수정\t 3. 제목, 가격 수정\t 0. 상위 메뉴");
					int num = scan.nextInt();
					scan.nextLine();
					if (num == 1 || num == 2 || num == 3) {
						searchAllBooks();
						System.out.println("수정할 책의 id를 입력해주세요.");
						int editId = scan.nextInt();
						scan.nextLine();
						readyForDB(searchForId(editId));

						switch (num) {
						case 1:
							System.out.println("수정할 제목을 입력해주세요.");
							String editTitle = scan.nextLine();
							editForDB(editTitle(editTitle, editId));
							System.out.println("수정 되었습니다.");
							continue;
						case 2:
							System.out.println("수정할 가격을 입력해주세요.");
							int editPrice = scan.nextInt();
							scan.nextLine();
							editForDB(editPrice(editPrice, editId));
							System.out.println("수정 되었습니다.");
							continue;
						case 3:
							System.out.println("수정할 제목과 가격을 입력해주세요.");
							String editTitle2 = scan.nextLine();
							int editPrice2 = scan.nextInt();
							scan.nextLine();
							editForDB(editAll(editTitle2, editPrice2, editId));
							System.out.println("수정 되었습니다.");
							continue;
						default:
							System.out.println("잘못된 값입니다.");
							continue;
						}
					} else if (num != 0) {
						System.out.println("잘못된 값입니다.");
					}
					System.out.println();
					break;
				}
				break;
			case 0:
				System.out.println("***** 프로그램을 종료합니다 *****");
				System.out.println();
				return;
			default:
				System.out.println("잘못된 입력 값입니다!!!");
				break;
			}
		}

	}
}
