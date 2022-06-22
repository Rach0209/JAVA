package teacherdiary;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
// 기능에 집중한 클래스 생성.
// 기능오류가 생기면 여기서 수정
public class DiaryManageImpl implements DiaryManage {
	private List<Diary> list; // List가 필요해서 필드 만들고 초기화

	public DiaryManageImpl() {
		list = new ArrayList<>();
	}

	@Override
	public void add(Diary d) {
		list.add(d);
	}

	@Override
	public List<Diary> list() {
		return list;
	}

	@Override
	public void edit(LocalDate day, String content) {
		int index = list.indexOf(new Diary(day));
		if (index >= 0) {
			Diary d = list.get(index);
			d.setContent(content);
		}
	}

	@Override
	public void deleteFirst() {
		if (!list.isEmpty()) {
			list.remove(0);
		}
	}

}