package programmers;

public class 신규아이디추천 {

	public static String solution(String new_id) {
		return new KAKAOID(new_id)
			.toLowerCase()
			.filter()
			.toSingleDot()
			.noStartEndDot()
			.noBlank()
			.noGreaterThan16()
			.noLessThan2()
			.getResult();
	}

	public static class KAKAOID {
		private String s;

		public KAKAOID(String s) {
			this.s = s;
		}

		private KAKAOID toLowerCase() {
			s = s.toLowerCase();
			return this;
		}

		private KAKAOID filter() {
			s = s.replaceAll("[^a-z0-9._-]", "");
			return this;
		}

		private KAKAOID toSingleDot() {
			s = s.replaceAll("[.]{2,}", ".");
			return this;
		}

		private KAKAOID noStartEndDot() {
			s = s.replaceAll("^[.]|[.]$", "");
			return this;
		}

		private KAKAOID noBlank() {
			s = s.isEmpty() ? "a" : s;
			return this;
		}

		private KAKAOID noGreaterThan16() {
			if (s.length() >= 16) {
				s = s.substring(0, 15);
			}
			s = s.replaceAll("[.]$", "");
			return this;
		}

		private KAKAOID noLessThan2() {
			StringBuilder sb = new StringBuilder(s);

			while (sb.length() <= 2) {
				sb.append(sb.charAt(sb.length() - 1));
			}
			s = sb.toString();
			return this;
		}

		private String getResult() {
			return s;
		}
	}

	public static void main(String[] args) {
		solution("...!@BaT#*..y.abcdefghijklm");
	}
}
