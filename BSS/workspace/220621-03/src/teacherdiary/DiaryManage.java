package teacherdiary;

import java.time.LocalDate;
import java.util.List;
// 추상적 행동에 집중.
// 꼭 가져야 할 행동들을 인터페이스에 이름으로 정의.
// => 기능이 없으면 안되는 것들을 넣으면, 무조건 재정의해야하기 때문에
// 기능을 빼먹는 실수를 할 일이 없어짐.
public interface DiaryManage {
	void add(Diary d);
	List<Diary> list();
	void edit(LocalDate day, String content);
	void deleteFirst();
}
