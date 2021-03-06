// 1번
// 책 클래스 (class Book)
// 필드(상태) : 제목(title), 저자(author)
// 메소드(기능) : 제목과 저자를 콘솔에 출력 가능(printAll)

// 2번
// 날짜 클래스
// 필드 : 연도, 월, 일
// 메소드(기능) : "2022-05-27" 
//			   "05/27/22" 와 같은 다양한 서식으로 출력 선택적

// 3번
// 영화
// 제목, 평점, 감독, 발표된 연도
// 모든 값을 콘솔 출력하는 기능

// 위의 클래스를 테스트 할 수 있는 main메소드를 포함하는 클래스를 작성하고
// 인스턴스화 하여, 필드값을 대입연산 후 출력메소드를 호출하여 콘솔에서 값 확인.

// 3번

class Movie {
	String title;
	double grade;
	String director;
	String releaseDate;
	
	void printAll() {
		System.out.println("영화 제목 : " + title + "\n" + "영화 평점 : " + grade + "\n"
					+ "영화 감독 : " + director + "\n" + "영화 개봉일 : " + releaseDate);
	}
}

public class Q3AboutMovie {
	public static void main(String[] args) {
		Movie goodMovie = new Movie();
		goodMovie.title = "스파이더맨:노 웨이 홈";
		goodMovie.grade = 9.11;
		goodMovie.director = "Jon Watts(존 왓츠)";
		goodMovie.releaseDate = "2021.12.15.";
		goodMovie.printAll();
	}
}