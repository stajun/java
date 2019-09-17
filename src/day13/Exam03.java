package day13;

import java.util.ArrayList;

public class Exam03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
class Word{
	String title;
	String contents;
	String a;
	String b;
	public Word() {}
	public Word(String title, String contents, String a, String b) {}
	@Override
	public String toString() {
		return "Word [title=" + title + ", contents=" + contents + ", a=" + a + ", b=" + b + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((contents == null) ? 0 : contents.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Word other = (Word) obj;
		if (contents == null) {
			if (other.contents != null)
				return false;
		} else if (!contents.equals(other.contents))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}
}
class WordList{
	ArrayList<Word> list = new ArrayList<>();
	public void insert() {
		System.out.println("단어 추가기능입니다.");
	}
	public void search() {}
}






