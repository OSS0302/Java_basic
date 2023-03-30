package ch15;

public class BookShelf extends Shelf implements Queue {

	@Override
	public void enQueque(String title) {
		shelf.add(title); // 책 제목을 리스트에 추가하겠다.
	}

	@Override
	public String enQueue() {
		return shelf.remove(0);
	}

	@Override
	public int getSize() {
		return getCount();
	}

}
