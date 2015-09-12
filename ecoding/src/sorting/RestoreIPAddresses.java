package sorting;

import java.util.ArrayList;
import java.util.List;

public class RestoreIPAddresses {
	public List<String> restoreIpAddresses(String s) {
		List<String> l = new ArrayList<String>();
		if (s.length() < 4 || s.length() > 12) {
			return l;
		}
		int length = s.length();
		int[][] a = { { 2 }, { 2, 3 }, { 2, 3, 4 }, { 2, 3, 4, 5 },
				{ 2, 3, 4, 5, 6 }, { 3, 4, 5, 6 }, { 4, 5, 6 }, { 5, 6 }, { 6 } };
		int[][] b = { { 1 }, { 1, 2 }, { 1, 2, 3 }, { 2, 3 }, { 3 } };
		for (int i = 0; i < a[length - 4].length; i++) {
			int index = a[length - 4][i] - 2;
			int index2 = length - a[length - 4][i] - 2;
			for (int j = 0; j < b[index].length; j++) {
				for (int p = 0; p < b[index2].length; p++) {
					if (isIp(s.substring(0, b[index][j]))
							&& isIp(s.substring(b[index][j], index + 2))
							&& isIp(s.substring(index + 2, index + 2
									+ b[index2][p]))
							&& isIp(s.substring(index + 2 + b[index2][p]))) {
						String ar = s.substring(0, b[index][j])
								+ "."
								+ s.substring(b[index][j], index + 2)
								+ "."
								+ s.substring(index + 2, index + 2
										+ b[index2][p]) + "."
								+ s.substring(index + 2 + b[index2][p]);
						l.add(ar);
					}
				}
			}
		}
		return l;
	}

	private boolean isIp(String a) {
		if ("".equals(a)) {
			return false;
		}
		if (a.charAt(0) == '0' && a.length() > 1) {
			return false;
		}
		int t = Integer.valueOf(a);
		if (t < 256 && t >= 0) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
