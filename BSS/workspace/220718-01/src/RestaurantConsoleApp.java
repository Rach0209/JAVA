import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class RestaurantConsoleApp {
	private RestaurantRepository repo;

	public RestaurantConsoleApp(RestaurantRepository repo) {
		this.repo = repo;
	}

	public void menu() {
		while (true) {
			Scanner scan = new Scanner(System.in);
			System.out.println("1. 추가\t, 2. 목록\t, 3. 삭제\t, 4. 수정\t, 5. 검색(제목)\t 0. 프로그램 종료");

			int num = scan.nextInt();

			switch (num) {
			case 1:
				add();
				break;
			case 2:
				list();
				break;
			case 3:
				delete();
				break;
			case 4:
				System.out.println("1. 전체수정\t 2. 상호명만 수정");
				int edit = scan.nextInt();
				if (edit == 1) {
					update();
				} else {
					updateTitle();
				}
				break;
			case 5:
				search();
				break;
			case 0:
				return;
			default:
				System.out.println("잘못된 입력 값입니다.");
				break;
			}
		}
	}


	private void list() {
		List<Restaurant> list;
		try {
			list = repo.list();
			if (list.size() > 0) {
				for (Restaurant r : list) {
					System.out.println(r);
				}
			} else {
				System.out.println("음식점 데이터가 없습니다.");
			}
		} catch (SQLException e) {
			System.out.println("데이터를 불러오는 과정이 실패했습니다. 다시 시도해 주십시오.");
		}
	}

	private void add() {
		System.out.println("추가할 음식점의 상호명, 전화번호, 주소를 입력해주세요.");
		Scanner scan = new Scanner(System.in);

		String title = null;
		boolean bool = false;
		do {
			title = scan.nextLine();

			bool = title.length() > 20;
			if (bool) {
				System.out.println("상호명은 20자를 넘을 수 없습니다. 다시 입력해주세요.");
			}
		} while (bool);

		String phoneNumber = null;
		do {
			phoneNumber = scan.nextLine();

			bool = phoneNumber.length() > 16;
			if (bool) {
				if (phoneNumber.contains("-")) {
					System.out.println("16자를 넘을 수 없습니다. 다시 한번 확인해주세요.");
				} else if (!phoneNumber.contains("-")) {
					System.out.println("16자를 넘을 수 없고, 숫자와 '-'만  사용하여 입력해주세요.");
				}
			}
		} while (bool);

		String address = null;
		do {
			address = scan.nextLine();

			bool = address.length() > 100;
			if (bool) {
				System.out.println("주소는 100자를 넘을 수 없습니다. 다시 입력해주세요.");
			}
		} while (bool);

		int result;
		try {
			result = repo.add(new Restaurant(title, phoneNumber, address));
			System.out.println(result + "개의 음식점이 추가되었습니다.");
		} catch (SQLException e) {
			int code = e.getErrorCode();
			if (code == 1062) {
				System.out.println("전화번호 혹은 주소가 중복되었습니다. 다시 확인해주세요.");
			}
			System.out.println("데이터를 추가하는 과정이 실패하였습니다. 다시 시도해주세요.");
		}
	}

	private void delete() {
		list();
		System.out.println("삭제할 음식점의 RestaurantId를 입력해주세요.");
		Scanner scan = new Scanner(System.in);
		int restaurantId = scan.nextInt();

		int result;
		try {
			result = repo.delete(restaurantId);
			if (result > 0) {
				System.out.println(result + "개의 음식점 데이터가 삭제되었습니다.");
			} else {
				System.out.println("없는 번호입니다.");
			}
		} catch (SQLException e) {
			System.out.println("데이터를 삭제하는 과정이 실패하였습니다. 다시 시도해주세요.");
		}
	}
	
	private void update() {
		list();
		System.out.println("수정할 음식점의 Id를 입력해주세요.");
		Scanner scan = new Scanner(System.in);
		
		int restaurantId = scan.nextInt();
		scan.nextLine();
		System.out.println("수정할 음식점의 상호명을 입력해주세요.");
		String title = scan.nextLine();
		System.out.println("수정할 음식점의 새로운 전화번호를 입력해주세요.");
		String phoneNumber = scan.nextLine();
		System.out.println("수정할 음식점의 새로운 주소를 입력해주세요.");
		String address = scan.nextLine();
				
		int result;
		try {
			result = repo.update(new Restaurant(restaurantId, title, phoneNumber, address));
			System.out.println(result + "행 수정");
		} catch (SQLException e) {
			System.out.println("똑같은 값은 입력불가해요. 다시 시도해주세요.");
		}
	}
	
	private void updateTitle() {
		list();
		System.out.println("수정할 음식점의 Id를 입력해주세요.");
		Scanner scan = new Scanner(System.in);
		
		int restaurantId = scan.nextInt();
		scan.nextLine();
		System.out.println("수정할 음식점의 상호명을 입력해주세요.");
		String title = scan.nextLine();
		try {
			int result = repo.updateTitle(new Restaurant(restaurantId, title));
			System.out.println(result + "행 수정");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	private void search() {
		System.out.println("검색할 음식점의 상호명을 입력하세요.");
		Scanner scan = new Scanner(System.in);
		String title = scan.nextLine();
		
		Restaurant restaurant;
		try {
			restaurant = repo.selectByTitle(title);
			System.out.println(restaurant);
			if (restaurant == null) {
				System.out.println("음식점 데이터에 없는 상호명 입니다.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		RestaurantConsoleApp app = new RestaurantConsoleApp(new RestaurantRepository());
		app.menu();
	}

}
